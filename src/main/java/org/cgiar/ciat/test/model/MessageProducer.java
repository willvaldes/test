package org.cgiar.ciat.test.model;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageProducer {
    
    private String greetingMessage;
    
    public MessageProducer() {
        greetingMessage = "This is a greeting message testing a Struts 2 action";
    }

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

}
