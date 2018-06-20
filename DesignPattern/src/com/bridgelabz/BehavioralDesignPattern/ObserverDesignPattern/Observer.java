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
public interface Observer {
	// method to update the observer, used by subject
	public void update();

	// attach with subject to observe
	public void setSubject(Subject subject);
}
