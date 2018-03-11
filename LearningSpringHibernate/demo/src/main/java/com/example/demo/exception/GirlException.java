package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

/**
 * 自定义异常，弥补默认的异常类只有异常的信息，没有错误标识码，加入自定义的异常码，就能更快的排查异常错误
 * @author lenjor
 */
public class GirlException extends RuntimeException{
	
	//自定义的异常码
	private Integer code;
	
	public GirlException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}
	public GirlException(Integer code,String msg) {
		super(msg);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	

}
