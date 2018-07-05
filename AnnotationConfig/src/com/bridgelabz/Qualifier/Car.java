/**
 * 
 */
package com.bridgelabz.Qualifier;

/**
 * purpose Car bean class
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Car {
	private String carModel;
	private long cost;

	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * @param carModel
	 *            the carModel to set
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	/**
	 * @return the cost
	 */
	public long getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(long cost) {
		this.cost = cost;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", cost=" + cost + "]";
	}

}
