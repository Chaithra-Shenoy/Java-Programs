/**
 * 
 */
package com.bridgelabz.AutoWired;

/**
 * purpose Bean class
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Auto {
	private int autoId;
	private String autoName;

	/**
	 * @return the autoId
	 */
	public int getAutoId() {
		return autoId;
	}

	/**
	 * @param autoId
	 *            the autoId to set
	 */
	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}

	/**
	 * @return the autoName
	 */
	public String getAutoName() {
		return autoName;
	}

	/**
	 * @param autoName
	 *            the autoName to set
	 */
	public void setAutoName(String autoName) {
		this.autoName = autoName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [autoId=" + autoId + ", autoName=" + autoName + "]";
	}

}
