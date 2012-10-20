package com.swr.tidynotes.taskfilter.check;

import com.swr.tidynotes.note.ATask;

public abstract class Check {

	public abstract boolean passes(ATask task);
	
}
