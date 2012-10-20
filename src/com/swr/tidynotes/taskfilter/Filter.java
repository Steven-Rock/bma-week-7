/**
 * 
 */
package com.swr.tidynotes.taskfilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import com.swr.tidynotes.note.ANote;
import com.swr.tidynotes.note.ATask;


/**
 * @author steve
 *
 */
public class Filter implements TaskFilter {

	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filter(com.swr.tidynotes.note.ATask[])
	 */
	@Override
	public ATask[] filter(ATask[] tasks) {		
		return filterByName(tasks);
	}

	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filter(com.swr.tidynotes.note.ANote[])
	 */
	@Override
	public ANote[] filter(ANote[] notes) {
		return filterByName(notes);
	}
	

	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filterByLastModifiedDate(com.swr.tidynotes.note.ATask[])
	 */
	@Override
	public ATask[] filterByLastModifiedDate(ATask[] tasks) {
		Arrays.sort(tasks, new LastModifiedDateComparator());
		return tasks;
	}

	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filterByLastModifiedDate(com.swr.tidynotes.note.ANote[])
	 */
	@Override
	public ANote[] filterByLastModifiedDate(ANote[] notes) {
		Arrays.sort(notes, new LastModifiedDateComparator());
		return notes;
	}

	
	
	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filterByName(com.swr.tidynotes.note.ATask[])
	 */
	@Override
	public ATask[] filterByName(ATask[] tasks) {
		Arrays.sort(tasks, new NameComparator());
		return tasks;
	}

	/* (non-Javadoc)
	 * @see com.swr.tidynotes.taskfilter.TaskFilter#filterByName(com.swr.tidynotes.note.ANote[])
	 */
	@Override
	public ANote[] filterByName(ANote[] notes) {
		Arrays.sort(notes, new NameComparator());
		return notes;
	}
	
	
	class NameComparator implements Comparator{
		 
	    public int compare(Object emp1, Object emp2){    
	 
	        //parameter are of type Object, so we have to downcast it to Employee objects
	       
	        String emp1Name = ((ANote)emp1).getName();        
	        String emp2Name = ((ANote)emp2).getName();
	       
	        //uses compareTo method of String class to compare names of the employee
	        return emp1Name.compareTo(emp2Name);
	   
	    }
	 
	}

	class LastModifiedDateComparator implements Comparator{
		 
	    public int compare(Object emp1, Object emp2){    
	    	//parameter are of type Object, so we have to downcast it to Employee objects
		       
	        Date a1 = ((ANote)emp1).getLastModifiedDate();        
	        Date a2 = ((ANote)emp2).getLastModifiedDate();
	       
	        //uses compareTo method of String class to compare names of the employee
	        return a1.compareTo(a2);
	    }	 
	}

}
