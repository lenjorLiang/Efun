package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

/**
 * 学生服务实现类
 * @author  lenjor
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentDao studentDao;
	
	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAllStudent();
	}

	@Override
	public Student findStudentById(Long sid) {
		// TODO Auto-generated method stub
		return studentDao.findStudentById(sid);
	}

	@Override
	public Long saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	public Long updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public Long deleteStudent(Long sid) {
		return studentDao.deleteStudent(sid);
	}

}
