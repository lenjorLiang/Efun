package com.example.demo.aspect;


import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Aspect
@Component
public class HttpAspect {
	
	//使用Logger打印会更好
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	//声明切入点，可以减少代码冗余度
	@Pointcut("execution(public * com.example.demo.controller.GirlController.*(..))")
	public void log() {	
	}
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		logger.info("接收http之前拦截");
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		//url
		logger.info("url={}",request.getRequestURL());
		//method
		logger.info("method={}",request.getMethod());
		//ip
		logger.info("ip={}",request.getRemoteAddr());
		//类方法
		logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."
				+joinPoint.getSignature().getName());
		//参数
		logger.info("args={}",joinPoint.getArgs());

	}
	@After("log()")
	public void doAfter() {
		logger.info("处理完http请求之后");
	}
	
	/**
	 * 获取返回的内容
	 * @param object
	 */
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
       logger.info("response={}", object.toString());

    }

}
