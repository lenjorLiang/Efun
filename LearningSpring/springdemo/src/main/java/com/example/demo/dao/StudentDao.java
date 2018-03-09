package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Student;

public interface StudentDao {
	/**
	 * 获取所有学生
	 * @return
	 */
	List<Student> findAllStudent();
	
	/**
	 * 查找单个学生
	 * @param sid
	 * @return
	 */
	Student findStudentById(@Param("sid") Long sid);
	
	/**
	 * 添加学生
	 * @param student
	 * @return
	 */
	Long saveStudent(Student student);
	
	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 */
	Long updateStudent(Student student);
	
	/**
	 * 删除学生
	 * @param sid
	 * @return
	 */
	Long deleteStudent(@Param("sid") Long sid);
	
}
