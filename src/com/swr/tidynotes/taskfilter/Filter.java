/**
 * 
 */
package com.swr.tidynotes.taskfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.swr.tidynotes.note.ANote;
import com.swr.tidynotes.note.ATask;
import com.swr.tidynotes.taskfilter.check.AfterDueDateCheck;
import com.swr.tidynotes.taskfilter.check.BeforeDueDateCheck;
import com.swr.tidynotes.taskfilter.check.Check;


/**
 * @author steve
 *
 */
public class Filter implements TaskFilter {

	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filter(com.swr.tidynotes.note.ATask[])
	 * 
	 */
	/**
	 * Returns all tasks due after today's date
	 */
	@Override
	public ATask[] filter(ATask[] tasks) {	
		
		Calendar cal = GregorianCalendar.getInstance();
		return filterByDueDate(tasks, cal.getTime(), true);
	}
	
	public ATask[] filterByDueDate(ATask[] tasks, Date earliest, boolean after){
		
		Check check = null; 
		if(after){
			check = new AfterDueDateCheck();
			((AfterDueDateCheck)check).setEarliest(earliest);
		}
		else{
			check = new BeforeDueDateCheck();
			((BeforeDueDateCheck)check).setEarliest(earliest);
		}
		return filter(tasks, check);
	}
	
	/**
	 * Generic filter handles looping, calling check object if should add to list
	 * @param tasks - list of task to check
	 * @param check - object that determines if task should be added to filtered list
	 * @return
	 */
	public ATask[] filter(ATask[] tasks, Check check) {	
		
		List<ATask> filtered = new ArrayList<ATask>();
		
		ATask task = null;
		for (int i = 0; i < tasks.length; i++) {
			
			task = tasks[i];
			
			if(check.passes(task)){
				filtered.add(task);
			}
		}
		
		//filtered = Collections.sort(filtered, new DueDateComparator());
		
		Object[] obj = filtered.toArray();		
		ATask[] newTasks = new ATask[obj.length];
		for (int i = 0; i < obj.length; i++) {
			newTasks[i] = (ATask)obj[i];
		}
		return newTasks;
	}

	
	
	class NameComparator implements Comparator<ANote>{
		 
		@Override
	    public int compare(ANote emp1, ANote emp2){    
	 
	        //parameter are of type Object, so we have to downcast it to Employee objects
	       
	        String emp1Name = emp1.getName();        
	        String emp2Name = emp2.getName();
	       
	        //uses compareTo method of String class to compare names of the employee
	        return emp1Name.compareTo(emp2Name);
	   
	    }		 
	}

	class LastModifiedDateComparator implements Comparator<ANote>{
		 
	    public int compare(ANote emp1, ANote emp2){    
	    	//parameter are of type Object, so we have to downcast it to Employee objects
		       
	        Date a1 = ((ANote)emp1).getLastModifiedDate();        
	        Date a2 = ((ANote)emp2).getLastModifiedDate();
	       
	        //uses compareTo method of String class to compare names of the employee
	        return a1.compareTo(a2);
	    }	 
	}
	
	class DueDateComparator implements Comparator<ATask>{
		 
	    public int compare(ATask emp1, ATask emp2){    
	    	//parameter are of type Object, so we have to downcast it to Employee objects
		       
	        Date a1 = emp1.getDueDate();        
	        Date a2 = emp2.getDueDate();
	       
	        //uses compareTo method of String class to compare names of the employee
	        return a1.compareTo(a2);
	    }	 
	}
	

}
