/**
 * 
 */
package com.swr.tidynotes;

import java.util.GregorianCalendar;
import java.util.UUID;


/**
 * @author steve
 *
 */
public class Note extends ANote {
		
	public Note(String name, String note) {
		super();
		setName(name);
		setNote(note);
		setGuid(UUID.randomUUID());
		setLastModifiedDate(GregorianCalendar.getInstance().getTime());
		setCreateDate(GregorianCalendar.getInstance().getTime());
		setDirty(true);
		
	}

	public Note() {
		super();
		setGuid(UUID.randomUUID());
		setLastModifiedDate(GregorianCalendar.getInstance().getTime());
		setCreateDate(GregorianCalendar.getInstance().getTime());
		setDirty(true);			
	}

	@Override
	public String toString() {
		return "Note [aNote()=" + super.toString() + ", isDirty()="
				+ isDirty() + ", getGuid()=" + getGuid() + ", getName()="
				+ getName() + ", getNote()=" + getNote()
				+ ", getLastModifiedDate()=" + getLastModifiedDate()
				+ ", getCreateDate()=" + getCreateDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
		
}
