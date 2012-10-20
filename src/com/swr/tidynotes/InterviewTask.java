/**
 * 
 */
package com.swr.tidynotes;

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
}
