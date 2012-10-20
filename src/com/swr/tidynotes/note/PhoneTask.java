package com.swr.tidynotes.note;

import java.util.Date;

public class PhoneTask extends Task {

	private String phoneNUmber = null;
	private String person = null;
	private ATask followUp = null;
	
	
	public PhoneTask(String name, String note, Date dueDate,
			String phoneNUmber, String person, ATask followUp) {
		super(name, note, dueDate);
		this.phoneNUmber = phoneNUmber;
		this.person = person;
		this.followUp = followUp;
	}

	public PhoneTask() {
		super();
		
	}
	
	
	public String getPhoneNUmber() {
		return phoneNUmber;
	}
	public void setPhoneNUmber(String phoneNUmber) {
		this.phoneNUmber = phoneNUmber;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public ATask getFollowUp() {
		return followUp;
	}
	public void setFollowUp(ATask followUp) {
		this.followUp = followUp;
	}
	
	@Override
	public String toString() {
		return "PhoneTask [phoneNUmber=" + phoneNUmber + ", person=" + person
				+ ", followUp=" + followUp + ", toString()=" + super.toString()
				+ ", getDueDate()=" + getDueDate() + ", isCompleted()="
				+ isCompleted() + ", getCompletedDate()=" + getCompletedDate()
				+ ", isDirty()=" + isDirty() + ", getGuid()=" + getGuid()
				+ ", getName()=" + getName() + ", getNote()=" + getNote()
				+ ", getLastModifiedDate()=" + getLastModifiedDate()
				+ ", getCreateDate()=" + getCreateDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((followUp == null) ? 0 : followUp.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result
				+ ((phoneNUmber == null) ? 0 : phoneNUmber.hashCode());
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
		if (!(obj instanceof PhoneTask))
			return false;
		PhoneTask other = (PhoneTask) obj;
		if (followUp == null) {
			if (other.followUp != null)
				return false;
		} else if (!followUp.equals(other.followUp))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (phoneNUmber == null) {
			if (other.phoneNUmber != null)
				return false;
		} else if (!phoneNUmber.equals(other.phoneNUmber))
			return false;
		return true;
	}
	
	
	

}
