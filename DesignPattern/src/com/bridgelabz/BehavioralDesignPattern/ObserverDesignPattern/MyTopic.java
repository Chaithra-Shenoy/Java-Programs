/**
 * 
 */
package com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object OBJECT = new Object();

	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Subject#register
	 * (com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Observer)
	 */
	@Override
	public void register(Observer observer) {
		if (observer == null)
			throw new NullPointerException("Observer not present");
		// Doubled checked Locking
		synchronized (OBJECT) {
			if (!observers.contains(observer))
				observers.add(observer);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Subject#
	 * unregister(com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.
	 * Observer)
	 */
	@Override
	public void unregister(Observer observer) {
		synchronized (OBJECT) {
			observers.remove(observer);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Subject#
	 * notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		// synchronization is used to make sure any observer registered after message is
		// received is not notified
		synchronized (OBJECT) {
			if (!changed)
				return;
			observersLocal = new ArrayList<Observer>(this.observers);
			this.changed = false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.Subject#
	 * getUpdate(com.bridgelabz.BehavioralDesignPattern.ObserverDesignPattern.
	 * Observer)
	 */
	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	// method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
