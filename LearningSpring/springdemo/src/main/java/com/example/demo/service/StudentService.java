package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Student;

/**
 * 学生服务接口类
 * @author lenjor
 *
 */
public interface StudentService {

	/**
	 * 获取所有学生列表
	 * 
	 * @return 
	 */
    List<Student> findAllStudent();

    /**
     * 获取指定学号学生
     * @param sid
     * @return 学生信息
     */
    Student findStudentById(Long sid);
    
    /**
     * 新增学生信息
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
     * 删除学生信息
     * @param sid
     * @return
     */
    Long deleteStudent(Long sid);
    
}
