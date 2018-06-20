/**
 * 
 */
package com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject topic;

	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Observer#update(
	 * )
	 */
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if (msg == null) {
			System.out.println(name + " - No message");
		} else
			System.out.println(name + "- Consuming message -" + msg);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Observer#
	 * setSubject(com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.
	 * Subject)
	 */
	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
