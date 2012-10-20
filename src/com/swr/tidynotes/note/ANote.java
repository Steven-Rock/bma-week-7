/**
 * 
 */
package com.swr.tidynotes.note;

import java.util.Date;
import java.util.UUID;

/**
 * @author steve
 *
 */
public abstract class ANote {

	private String name = null;
	private String note = null;
	private Date lastModifiedDate = null;
	private Date createDate = null;
	private UUID guid = null;
	private boolean dirty = true;
	
	@Override
	public String toString() {
		return "ANote [name=" + name + ", note=" + note
				+ ", lastModifiedDate=" + lastModifiedDate
				+ ", createDate=" + createDate + ", guid=" + guid
				+ ", dirty=" + dirty + "]";
	}
	
	public boolean isDirty() {
		return dirty;
	}
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}
	public UUID getGuid() {
		return guid;
	}
	
	public void setGuid(UUID guid) {
		this.guid = guid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
