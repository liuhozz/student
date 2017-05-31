package com.heima.store.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.heima.store.utils.MySessionContext;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
public class MySessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        MySessionContext.AddSession(se.getSession());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	MySessionContext.DelSession(se.getSession());
    }
	
}
