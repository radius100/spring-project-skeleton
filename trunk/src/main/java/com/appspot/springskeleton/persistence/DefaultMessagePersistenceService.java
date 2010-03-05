package com.appspot.springskeleton.persistence;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.orm.jdo.support.JdoDaoSupport;

import com.appspot.springskeleton.persistence.domain.MessageEntity;

public class DefaultMessagePersistenceService extends JdoDaoSupport implements MessagePersistenceService, ApplicationListener {

	private static final Logger logger = Logger.getLogger(DefaultMessagePersistenceService.class.getName());
	
	public void init() {
		
	}
	
	@Override
	public MessageEntity createNewMessage(MessageEntity messageEntity) {
		
		
		return null;
	}

	@Override
	public List<MessageEntity> findAllMessageEntities() {
		return (List<MessageEntity>) getJdoTemplate().find(MessageEntity.class);
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		logger.info(event.toString());
	}

}
