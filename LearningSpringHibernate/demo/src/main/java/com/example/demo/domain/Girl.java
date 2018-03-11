package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Girl{
	@Id
	@GeneratedValue
	private Integer id;		//自增
	@Min(value = 10, message="禁止10岁以下儿童入内")
	private Integer age;
	private String girlName;
	private String cupSize;
	private String school;
	
	/**
	 * 无参数的构造方法，不然Hibernate会报错
	 */
	public Girl() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGirlName() {
		return girlName;
	}
	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Girl {id=" + id + ", age=" + age + ", girlName=" + girlName + ", cupSize=" + cupSize + ", school="
				+ school + "}";
	}



	
}
