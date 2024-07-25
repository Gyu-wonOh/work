package com.human.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IDeptDao;
import com.human.dao.IEmpDao;
import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;
import com.human.dto.EmpDto;
@Service
public class DeptEmpServiceImpl implements IDeptEmpService {

	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private IDeptService deptService;
	@Autowired
	private IEmpService empService;
	
	@Override
	public List<DeptEmpDto> selectAll() throws Exception {
		
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		
		List<DeptEmpDto> dtos=dao.selectAllDeptEmp();
		
		return dtos;
	}

	@Override
	public void insertDeptEmp(int deptNo, String dName, String loc, EmpDto emp) throws Exception {
		System.out.println("Dept :"+deptNo+dName+loc);
		System.out.println("Emp :"+emp);
		IDeptDao dao =sqlSession.getMapper(IDeptDao.class);
		IEmpDao empDao = sqlSession.getMapper(IEmpDao.class);
		dao.insertDept(deptNo,dName,loc);
		empDao.insert(emp);
	}

	@Override
	public void deleteDept(int deptNo) throws Exception {
		empService.delete(deptNo);
		deptService.delete(deptNo);
	}
	@Override
	public void deleteEmp(int empNo) throws Exception {
		empService.delete(empNo);
	}
}
