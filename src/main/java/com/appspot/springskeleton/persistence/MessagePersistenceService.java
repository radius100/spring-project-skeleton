package com.appspot.springskeleton.persistence;

import java.util.List;

import com.appspot.springskeleton.persistence.domain.MessageEntity;

public interface MessagePersistenceService {

	public MessageEntity createNewMessage(MessageEntity messageEntity);
	
	public List<MessageEntity> findAllMessageEntities();
	
}
