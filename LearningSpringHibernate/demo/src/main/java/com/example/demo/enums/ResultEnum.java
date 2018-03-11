package com.example.demo.enums;


public enum ResultEnum {
	UNKNOWN_ERROR(-1,"未知错误"),
	SUCCESS(0,"成功"),
	PRIMARY_SCHOOL(100, "我猜你可能还在上小学"),
    MIDDLE_SCHOOL(101, "你可能在上初中"),
    INPUT_ERROR(103,"输入有误"),
    ERROR(300,"一般错误"),
    ERROR_EMPTY(301,"数据表为空")
    ;
	
	/**
	 * 结果码
	 */
	private Integer code;
	/**
	 * 结果信息
	 */
	private String msg;
	
	ResultEnum(Integer code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
		
}
