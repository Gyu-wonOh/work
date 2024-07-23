package com.human.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IDeptDao;
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
		List<DeptEmpDto> chDtos = new ArrayList<DeptEmpDto>();
		
		List<DeptDto> deptDtos = deptService.selectAll();
		System.out.println(deptDtos);
		if(deptDtos != null) {
			for(DeptDto dto:deptDtos) {
				List<EmpDto> emps = empService.selectEmpNo(dto.getDeptNo());
				chDtos.add(new DeptEmpDto(dto,emps));
			}
		}
		return chDtos;
	}
	
	@Override
	public void insertDeptEmp(DeptDto dto,List<EmpDto> emps) throws Exception {
		deptService.insert(dto);
		int maxDeptNo =deptService.selectMaxDeptNo();
		
		System.out.println(emps);
		for(EmpDto emp:emps) {
			System.out.println(emp);
			if(emp.equals("")) {
				System.out.println(emp+"insert");
				empService.insert(new EmpDto(maxDeptNo,emp));
			}
		}
	}

	@Override
	public void update(DeptEmpDto dto) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(int deptNo) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.delete(deptNo);

	}

	@Override
	public DeptDto selectDeptNo(int deptNo) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		return dao.selectDeptNo(deptNo);
	}

	@Override
	public void insert(DeptEmpDto dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDeptNo(int deptNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmpNo(int empNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DeptDto selectEmpNo(int empNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
