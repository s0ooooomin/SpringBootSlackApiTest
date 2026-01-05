package com.mycom.myapp.service;

public interface SlackApiService {
	void sendMessage(String message);
	void sendMessageToChannel(String channel, String message);
}
