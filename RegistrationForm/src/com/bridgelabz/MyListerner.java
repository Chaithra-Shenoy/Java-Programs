package com.bridgelabz;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListerner
 *
 */
@WebListener
public class MyListerner implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public MyListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
System.out.println("Request Destroyed "+arg0.getServletRequest().getDispatcherType().name());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
    	System.out.println("Request Initialized "+arg0.getServletRequest().getRemoteAddr());
    }
	
}
