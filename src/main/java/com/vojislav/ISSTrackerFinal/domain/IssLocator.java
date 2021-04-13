package com.vojislav.ISSTrackerFinal.domain;

public class IssLocator {
	
	private long timestamp;
	private String message;
	private issPosition iss_position ;
	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public issPosition getIss_position() {
		return iss_position;
	}
	public void setIss_position(issPosition iss_position) {
		this.iss_position = iss_position;
	}
	@Override
	public String toString() {
		return "IssLocator [timestamp=" + timestamp + ", message=" + message + ", iss_position=" + iss_position + "]";
	}
	
	
}
