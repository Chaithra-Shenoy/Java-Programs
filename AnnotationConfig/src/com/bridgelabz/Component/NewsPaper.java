/**
 * 
 */
package com.bridgelabz.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * purpose Setting values to Newspaper parameter using value annotation
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
@Component
public class NewsPaper {
	@Value("5")
	private int cost;
	@Value("#{massMedia.Category}")
	private String headLines;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NewsPaper [cost=" + cost + ", headLines=" + headLines + "]";
	}

	/**
	 * @return the headLines
	 */
	public String getHeadLines() {
		return headLines;
	}

	/**
	 * @param headLines
	 *            the headLines to set
	 */
	public void setHeadLines(String headLines) {
		this.headLines = headLines;
	}
}
