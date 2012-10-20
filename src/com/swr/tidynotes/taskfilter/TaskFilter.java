package com.swr.tidynotes.taskfilter;

import java.util.Date;

import com.swr.tidynotes.note.ANote;
import com.swr.tidynotes.note.ATask;
import com.swr.tidynotes.taskfilter.check.Check;

public interface TaskFilter {
	
	public ATask[] filter(ATask[] tasks);
	//public ANote[] filter(ANote[] notes);
	
	public ATask[] filterByDueDate(ATask[] tasks, Date earliest, boolean after);
	
	public ATask[] filter(ATask[] tasks, Check check);
	
	/* to be implemented
	 * 
	public ATask[] filterByLastModifiedDate(ATask[] tasks, Date lastCheck);
	public ANote[] filterByLastModifiedDate(ANote[] notes, Date lastCheck);
	
	public ATask[] filterByName(ATask[] tasks, String nameContains);
	public ANote[] filterByName(ANote[] notes, String nameContains);
	
	*/
}
