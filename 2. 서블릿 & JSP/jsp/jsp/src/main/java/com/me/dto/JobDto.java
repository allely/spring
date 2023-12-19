package com.me.dto;

public class JobDto {

	private String jobCode;
	private String jobName;
	
	@Override
	public String toString() {
		return jobCode + "/" + jobName;
	}
	public JobDto() {
		
	}
	
	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}