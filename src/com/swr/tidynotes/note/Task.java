/**
 * 
 */
package com.swr.tidynotes.note;

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


}
