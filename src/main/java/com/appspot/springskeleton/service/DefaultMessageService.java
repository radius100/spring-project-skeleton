package com.appspot.springskeleton.service;

public class DefaultMessageService implements MessageService {

	@Override
	public String getNextMessage() {
		return "my custom message bis";
	}

}
