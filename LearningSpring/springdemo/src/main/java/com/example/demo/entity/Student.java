package com.example.demo.entity;

/*
 * 学生实体类
 */
public class Student {
	/*
	 * 学号
	 */
	private Long sid;
	/*
	 * 姓名
	 */
	private String sname;
	
	/*
	 * 性别
	 */
	private String sex;
	
	/*
	 * 成绩
	 */
	private Long score;
	

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	
	
	
}
