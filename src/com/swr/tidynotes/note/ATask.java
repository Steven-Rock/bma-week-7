package com.swr.tidynotes.note;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class ATask extends Note {
	
	private boolean completed = false;
	private Date completedDate = null;
	private Date dueDate = null;
	
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
		this.completedDate = GregorianCalendar.getInstance().getTime();
	}

	
	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	@Override
	public String toString() {
		return "ATask [completed=" + completed + ", completedDate="
				+ completedDate + ", dueDate=" + dueDate + ", Note()="
				+ super.toString() + ", isDirty()=" + isDirty()
				+ ", getGuid()=" + getGuid() + ", getName()=" + getName()
				+ ", getNote()=" + getNote() + ", getLastModifiedDate()="
				+ getLastModifiedDate() + ", getCreateDate()="
				+ getCreateDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
