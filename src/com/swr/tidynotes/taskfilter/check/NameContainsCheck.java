package com.swr.tidynotes.taskfilter.check;

import com.swr.tidynotes.note.ATask;

public class NameContainsCheck extends Check {
	
	private String subString = null;

	@Override
	public boolean passes(ATask task) {
		if(task.getName().contains(subString)){
			return true;
		}
		return false;
	}

	/**
	 * @return the subString
	 */
	public String getSubString() {
		return subString;
	}

	/**
	 * @param subString the subString to set
	 */
	public void setSubString(String subString) {
		this.subString = subString;
	}
	
	

}
