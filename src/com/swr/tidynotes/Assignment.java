/**
 * 
 */
package com.swr.tidynotes;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;



import com.swr.tidynotes.note.*;
import com.swr.tidynotes.taskfilter.Filter;
import com.swr.tidynotes.taskfilter.TaskFilter;
import com.swr.tidynotes.taskfilter.check.Check;
import com.swr.tidynotes.taskfilter.check.NameContainsCheck;

/**
 * Class $7 Java Homework
 * @author steve
 *
 */
public class Assignment {

	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
	 private static SimpleDateFormat fullFormatter = new SimpleDateFormat("yyyy/MM/dd HH:MM");
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Assignment a = new Assignment();
		ATask[] tasks = a.generateTasks();
		
		// not sure why we need a collection of filters, one should handle it
		
		TaskFilter f = null;
		ATask[] newTasks = null;
		
		TaskFilter[] filters = new TaskFilter[2];
		filters[0] = new Filter();
		filters[1] = new TaskFilter(){

			@Override
			public ATask[] filter(ATask[] tasks) {
				NameContainsCheck check = new NameContainsCheck();
				check.setSubString("ork"); // items with work in the name
				return filter(tasks, check);
			}

			@Override
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

			@Override
			public ATask[] filterByDueDate(ATask[] tasks, Date earliest,
					boolean after) {
				return null;
			}

			
		};
		
		// Run the filters and print results
		for (int i = 0; i < filters.length; i++) {
			
			System.out.println("Filtering tasks");
			
			f = filters[i];
			newTasks = f.filter(tasks);
			
			for (int j = 0; j < newTasks.length; j++) {				
				System.out.println("Filtered Task = " + newTasks[j].toString());				
			}
			
		}

	}
	
	public ATask[] generateTasks(){
		
		
		ATask[] tasks = new ATask[4];
		
		Date date = null;
		Calendar cal = GregorianCalendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -5);
		
		int i = 0;
		tasks[i++] = new Task("Project1 at Work", "Need to create materlialized views in DB", cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, +10);
		tasks[i++] = new Task("Project1 at Home", "Put up new door knob", cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, +1);
		tasks[i++] = new Task("Hobbies", "learn guitar", cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, -100);
		tasks[i++] = new Task("Hobbies", "Hiking", cal.getTime());
		
		return tasks;
	}
	
	private static void printTask(ANote note){
		if(note != null){
			System.out.println(note);
		}
	}
	
	static String getElement(String [] values, int index){

		// validation
		if(index < 0) return null;
		if(values == null) return null;
		if(index > values.length) return null;

		return values[index];

	}
	

}
