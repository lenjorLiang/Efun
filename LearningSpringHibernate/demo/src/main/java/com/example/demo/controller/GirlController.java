package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Girl;
import com.example.demo.domain.Result;
import com.example.demo.enums.ResultEnum;
import com.example.demo.service.impl.GirlServiceImpl;
import com.example.demo.utils.ResultUtil;

@RestController
public class GirlController {
	@Autowired
	private GirlServiceImpl girlServiceImpl;
	
	@GetMapping(value = "/girls")
	public Result girls() throws Exception {
		List<Girl> girlList = girlServiceImpl.findAll();	
		return ResultUtil.success(girlList);
	}
	
	@GetMapping(value = "/girl/{id}")
	public Result findById(@PathVariable("id") Integer id) throws Exception {
		Girl girl = girlServiceImpl.findOne(id);		
		return ResultUtil.success(girl);
	}
	
	
	//age属性是有限制的，加入 @Valid  注解就会验证收到的girl对象的响应属性，把检验结果存放到 BindingResult里
	@PostMapping(value = "/save")
	public Result save(@Valid @RequestBody Girl girl, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			return ResultUtil.error(ResultEnum.INPUT_ERROR);
		}
		Girl saveResult= girlServiceImpl.saveGirl(girl);
		if(saveResult == null) {	
			return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
		}
			
		return ResultUtil.success();

	}
}
