/**
 * 
 */
package com.bridgelabz.Required;

import org.springframework.beans.factory.annotation.Required;

/**
 * purpose to describe required annotation for msg parameter.
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class Message {
	private int msgId;
	private String msg;

	/**
	 * @return the msgId
	 */
	public int getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId
	 *            the msgId to set
	 */
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void display() {
		System.out.println("Message is " + msg + " with msg id is " + msgId);
	}
}
