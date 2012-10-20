/**
 * 
 */
package com.swr.tidynotes.note;

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
	
	
		
}
