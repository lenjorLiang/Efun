package com.example.demo.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Result;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.GirlException;
import com.example.demo.utils.ResultUtil;

/**
 * 统一异常处理类
 * @author lenjor
 */

@ControllerAdvice
public class ExceptionHandle {
	
	private final static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
	@ExceptionHandler(value = Exception.class)
	@ResponseBody		//由于是要返回json数据，这里需要加入@ResponseBody注解
	public Result handler(Exception e) {
		if(e instanceof GirlException){
			GirlException girlException = (GirlException) e;
			logger.info("异常码："+girlException.getCode()+" 异常信息："+girlException.getStackTrace());
			return ResultUtil.error(girlException.getCode(), girlException.getMessage()); 
		}else {
			logger.info("【系统异常】"+e);
			return ResultUtil.error(ResultEnum.UNKNOWN_ERROR);
		}
	}

}
