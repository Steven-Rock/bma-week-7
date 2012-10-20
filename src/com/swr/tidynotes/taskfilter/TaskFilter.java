package com.swr.tidynotes.taskfilter;

import com.swr.tidynotes.note.ANote;
import com.swr.tidynotes.note.ATask;

public interface TaskFilter {
	
	public ATask[] filter(ATask[] tasks);
	public ANote[] filter(ANote[] notes);
	
	public ATask[] filterByLastModifiedDate(ATask[] tasks);
	public ANote[] filterByLastModifiedDate(ANote[] notes);
	
	public ATask[] filterByName(ATask[] tasks);
	public ANote[] filterByName(ANote[] notes);
	
}
