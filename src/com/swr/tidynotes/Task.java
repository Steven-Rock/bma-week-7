/**
 * 
 */
package com.swr.tidynotes;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * @author steve
 *
 */
public class Task extends ATask {
	
	public Task(String name, String note, Date dueDate) {
		super();
		setName(name);
		setNote(note);
		setGuid(UUID.randomUUID());
		setLastModifiedDate(GregorianCalendar.getInstance().getTime());
		setCreateDate(GregorianCalendar.getInstance().getTime());
		setCompleted(false);
		setDirty(true);
		setDueDate(dueDate);
	}

	public Task() {
		super();
		setGuid(UUID.randomUUID());
		setLastModifiedDate(GregorianCalendar.getInstance().getTime());
		setCreateDate(GregorianCalendar.getInstance().getTime());
		setCompleted(false);
		setDirty(true);
	}

	@Override
	public String toString() {
		return "Task [getDueDate()=" + getDueDate() + ", isCompleted()="
				+ isCompleted() + ", getCompletedDate()="
				+ getCompletedDate() + ", aNote()=" + super.toString()
				+ ", isDirty()=" + isDirty() + ", getGuid()=" + getGuid()
				+ ", getName()=" + getName() + ", getNote()=" + getNote()
				+ ", getLastModifiedDate()=" + getLastModifiedDate()
				+ ", getCreateDate()=" + getCreateDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
