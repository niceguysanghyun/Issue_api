package com.Issue.base.exception;

import lombok.Getter;

/***
 * 
 * @author LEE SANG HYUN
 *
 */

@Getter
public class ServiceException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
    private String message;
    private Object data;
    
    public ServiceException(String message,Object data) {
    	this.code	=400;
    	this.message=message;
    	this.data	=data;
    }
    
    public ServiceException(int code,String message, Object data) {
    	this.code	=code;
    	this.message=message;
    	this.data	=data;
    }
    
    public ServiceException(String message) {
    	this.code	=400;
    	this.message=message;
    }
    
    public ServiceException(int code,String message) {
    	this.code	=code;
    	this.message=message;
    }
}
