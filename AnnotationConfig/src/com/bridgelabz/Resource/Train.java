/**
 * 
 */
package com.bridgelabz.Resource;

/**
 * purpose Train bean class
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Train {

	private String trainName;
	private int cost;

	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}

	/**
	 * @param trainName
	 *            the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Train [trainName=" + trainName + ", cost=" + cost + "]";
	}
}
