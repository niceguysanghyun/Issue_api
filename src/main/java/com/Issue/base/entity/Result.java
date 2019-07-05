package com.Issue.base.entity;

import lombok.Getter;

/**
 * Result
 *
 * @author LEE SANGHYUN
 * @since 2019/07/05
 */
@Getter
public class Result {
	private int code;
	private String message;
	private Object data;
	
	private Result setResult(int code,String message, Object data) {
		this.code = code;
		this.message=message;
		this.data = data;
		
		return this;
	}
    public Result success() {
        return setResult(200, "Success", null);
    }
    public Result success(Object data) {
		return setResult(200,"Sucess",data);
	}
    public Result fali() {
        return setResult(400, "fali", null);
    }
    public Result fali(int code,String message) {
		return setResult(code,message,null);
	}
    public Result fali(int code,String message, Object data) {
		return setResult(code,message,data);
	}
	
}
