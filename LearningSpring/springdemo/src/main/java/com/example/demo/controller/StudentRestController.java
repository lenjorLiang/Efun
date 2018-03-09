package com.example.demo.controller;


import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;






/*
 * 学生控制器
 * 包含CURD
 */
@RestController
public class StudentRestController {
	
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * 查找单个学生
	 * @param sid
	 * @return
	 */
	@RequestMapping(value = "/api/student/{sid}", method = RequestMethod.GET)
	public Student findStudentById(@PathVariable("sid") Long sid) {
		return studentService.findStudentById(sid);
	}
	/**
	 * 查找所有学生
	 * @return
	 */
	@RequestMapping(value="/api/student/all",method = RequestMethod.GET)
	public List<Student> findAllStudent(){
		return studentService.findAllStudent();
	}
	/**
	 * 添加一个新的学生
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/api/student/save", method = RequestMethod.POST)
	public String save(@RequestBody Student student) {
		//System.out.println("save---------------------");
		//System.out.println(student.getSname());
		Long result = studentService.saveStudent(student);
		if(result>0) {
			return "添加成功！";
		}
		return "添加失败";
	}
	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/api/student/update",method = RequestMethod.PUT)
	public String modifyStudent(@RequestBody Student student) {
		//System.out.println("update---------------------");	
		//System.out.println(student.getSname());
		Long result = studentService.updateStudent(student);
		if(result>0) {
			return "修改成功！";
		}
		return "修改失败";
	}
	
	@RequestMapping(value = "/api/student/delete/{sid}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("sid") Long sid)
	{
		//System.out.println("delete---------------------");
		Long result = studentService.deleteStudent(sid);
		if(result > 0) {
			return "删除成功";
		}
		return "删除失败";
		
	}
}
