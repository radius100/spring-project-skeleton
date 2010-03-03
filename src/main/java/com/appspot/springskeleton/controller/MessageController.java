package com.appspot.springskeleton.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.appspot.springskeleton.service.MessageService;

@Controller
public class MessageController {

	private static final Logger logger = Logger.getLogger(MessageController.class.getName());

	@Autowired
	private ApplicationContext context;
	
	private MessageService messageService;
	
//	public void setContext(ApplicationContext context) {
//		this.context = context;
//	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	/**
	 * Default constructor
	 */
	public MessageController() {
		super();
	}

    @RequestMapping(value = "message", method = RequestMethod.GET)
    public String getMessage(ModelMap modelMap) {
    	
    	logger.info("getMessage");
    	
    	modelMap.addAttribute("message", messageService.getNextMessage());
    	
    	return "message";
    	
    }

}
