package com.example.demo.utils;

import com.example.demo.domain.Result;
import com.example.demo.enums.ResultEnum;


public class ResultUtil {

	/**
	 * 带参数的成功返回结果
	 * @param object
	 * @return
	 */
	public static Result success(Object object) {
		Result result = new Result();
		result.setCode(ResultEnum.SUCCESS.getCode());
		result.setMsg(ResultEnum.SUCCESS.getMsg());
		result.setData(object);
		return result;
	}
	
	/**
	 * 无参数的成功返回结果
	 * @return
	 */
    public static Result success() {
    	return success(null);
    }
    /**
     * 特殊自定义错误返回
     * @param code
     * @param msg
     * @return
     */
	public static Result error(Integer code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(null);
		return result;
	}
	
	/**
	 * 预定义错误返回
	 * @param resultEnum
	 * @return
	 */
	public static Result error(ResultEnum resultEnum) {
		return error(resultEnum.getCode(),resultEnum.getMsg());
	}
	
}
