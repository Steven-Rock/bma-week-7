package com.swr.tidynotes.taskfilter.check;

import java.util.Date;
import com.swr.tidynotes.note.ATask;

public class BeforeDueDateCheck extends Check {
		
	private Date earliest = null;
	
	@Override
	public boolean passes(ATask task) {
		if(task.getDueDate().before(earliest)){
			return true;
		}
		return false;
	}

	/**
	 * @return the earliest
	 */
	public Date getEarliest() {
		return earliest;
	}

	/**
	 * @param earliest the earliest to set
	 */
	public void setEarliest(Date earliest) {
		this.earliest = earliest;
	}


}
