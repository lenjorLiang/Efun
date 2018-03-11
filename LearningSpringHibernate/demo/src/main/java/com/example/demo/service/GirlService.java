package com.example.demo.service;

import java.util.List;


import com.example.demo.domain.Girl;


public interface GirlService {
	/**
	 * 查询一个女生
	 * @param id
	 * @return
	 */
	public Girl findOne(Integer id)throws Exception;
	
	/**
	 * 查询出所有的女生
	 * @return
	 */
	public List<Girl> findAll() throws Exception;
	
	/**
	 * 增加一个女生
	 * @param girl
	 * @return
	 */
	public Girl saveGirl(Girl girl);
	
}
