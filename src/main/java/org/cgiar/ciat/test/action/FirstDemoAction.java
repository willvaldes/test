package org.cgiar.ciat.test.action;

import org.cgiar.ciat.test.model.MessageProducer;

import com.opensymphony.xwork2.ActionSupport;

public class FirstDemoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * The model class that stores the message to display in the view.
	 */
	private MessageProducer messageProducer;

	public String execute() {
		messageProducer = new MessageProducer();

		return SUCCESS;
	}

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

}
