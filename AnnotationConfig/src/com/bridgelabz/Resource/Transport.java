/**
 * 
 */
package com.bridgelabz.Resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * purpose Transport class to describe resource annotation.
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Transport {
	private String startingPoint;
	private String destination;
	@Resource(name = "train2")
	private Train train;

	/**
	 * @return the startingPoint
	 */
	public String getStartingPoint() {
		return startingPoint;
	}

	/**
	 * @param startingPoint
	 *            the startingPoint to set
	 */
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the train
	 */
	public Train getTrain() {
		return train;
	}

	/**
	 * @param train
	 *            the train to set
	 */
	public void setTrain(Train train) {
		this.train = train;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transport [startingPoint=" + startingPoint + ", destination=" + destination + "]";
	}

}
