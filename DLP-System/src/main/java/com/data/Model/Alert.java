package com.data.Model;

import java.time.LocalDateTime;

public class Alert {
	private String userId;
    private LocalDateTime timestamp;
    private String message;

    public Alert(String userId, LocalDateTime timestamp, String message) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.message = message;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
