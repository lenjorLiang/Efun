package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Girl;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.GirlException;
import com.example.demo.repository.GirlRepository;
import com.example.demo.service.GirlService;

@Service
public class GirlServiceImpl implements GirlService {
	
	@Autowired
	private GirlRepository girlRepository;
	
	@Override
	public Girl findOne(Integer id)throws Exception {
		Girl girl = girlRepository.findOne(id);
		if(girl != null) {
			return girl;
		}else {		//找不到该id的女生
			throw new GirlException(ResultEnum.ERROR.getCode(),"没有id为"+id+"的女生信息");
		}
	}

	@Override
	public List<Girl> findAll() throws Exception{
		List<Girl> girlList = girlRepository.findAll();
		if(girlList != null) {
			return girlList;
		}else {
			throw new GirlException(ResultEnum.ERROR_EMPTY);
		}
	}

	@Override
	public Girl saveGirl(Girl girl){
		Girl saveResult = girlRepository.save(girl);
		if(girlRepository !=null) {
			return saveResult;
		}else {
			//throw new GirlException(ResultEnum.INPUT_ERROR);
		}
		return saveResult;
	}

}
