package com.example.demo.domain;

/**
 * HTTP请求返回的最外层的对象
 * @author lenjor
 * @param <Object>
 */
public class Result{
	/**
	 * 结果码
	 */
	private Integer code;
	
	/**
	 * 消息内容
	 */
	private String msg;
	
	/**
	 * 数据

	 */
	private Object data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		if(data!=null) {
			return "{code="+code+", msg="+msg+" data="+data.toString()+"}";
		}else {
			return "{code="+code+", msg="+msg+" data=null}";
		}

	}
	
	
}
