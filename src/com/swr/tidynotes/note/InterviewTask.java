/**
 * 
 */
package com.swr.tidynotes.note;

import java.util.Date;

/**
 * @author steve
 *
 */
public class InterviewTask extends Task {
	
	boolean phoneInterview = false;
	String contactNumber = null;
	String interviewerName = null;
	
	public InterviewTask() {
		super();
	}

	public InterviewTask(String name, String note, 
			Date dueDate, boolean phoneInterview, String contactNumber,
			String interviewerName) {
		super(name, note, dueDate);
		this.phoneInterview = phoneInterview;
		this.contactNumber = contactNumber;
		this.interviewerName = interviewerName;
	}
	
	@Override
	public String toString() {
		return "InterviewTask [phoneInterview=" + phoneInterview
				+ ", contactNumber=" + contactNumber + ", interviewerName="
				+ interviewerName + ", Task=" + super.toString()
				+ ", getDueDate()=" + getDueDate() + ", isCompleted()="
				+ isCompleted() + ", getCompletedDate()="
				+ getCompletedDate() + ", isDirty()=" + isDirty()
				+ ", getGuid()=" + getGuid() + ", getName()=" + getName()
				+ ", getNote()=" + getNote() + ", getLastModifiedDate()="
				+ getLastModifiedDate() + ", getCreateDate()="
				+ getCreateDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public boolean isPhoneInterview() {
		return phoneInterview;
	}

	public void setPhoneInterview(boolean phoneInterview) {
		this.phoneInterview = phoneInterview;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getInterviewerName() {
		return interviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
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
		if (!(obj instanceof InterviewTask))
			return false;
		InterviewTask other = (InterviewTask) obj;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (interviewerName == null) {
			if (other.interviewerName != null)
				return false;
		} else if (!interviewerName.equals(other.interviewerName))
			return false;
		if (phoneInterview != other.phoneInterview)
			return false;
		return true;
	}
	
	
}
