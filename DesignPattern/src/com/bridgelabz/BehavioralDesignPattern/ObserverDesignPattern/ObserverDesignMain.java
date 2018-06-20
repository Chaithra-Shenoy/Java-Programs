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
public class ObserverDesignMain {
	public static void main(String[] args) {
		// create subject
		MyTopic topic = new MyTopic();

		// create observers
		Observer obj1 = new MyTopicSubscriber("Observer1");
		Observer obj2 = new MyTopicSubscriber("Observer2");
		Observer obj3 = new MyTopicSubscriber("Observer3");
		Observer obj4 = new MyTopicSubscriber("Observer4");
		

		// register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		topic.register(obj4);
		// attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		obj4.setSubject(topic);

		// check if any update is available
		obj4.update();
   
		// now send message to subject
		topic.postMessage("Welcome to BridgeLabz");
	}
}
