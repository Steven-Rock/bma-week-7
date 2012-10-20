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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result
				+ ((completedDate == null) ? 0 : completedDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ATask))
			return false;
		ATask other = (ATask) obj;
		if (completed != other.completed)
			return false;
		if (completedDate == null) {
			if (other.completedDate != null)
				return false;
		} else if (!completedDate.equals(other.completedDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		return true;
	}

	
	
	
	
	
}
