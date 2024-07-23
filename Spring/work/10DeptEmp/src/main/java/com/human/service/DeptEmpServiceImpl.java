package com.human.service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IDeptDao;
import com.human.dao.IDeptEmpDao;
import com.human.dao.IEmpDao;
import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;
import com.human.dto.EmpDto;
//import com.human.vo.CustomerHobbyVo;
//import com.human.vo.CustomerHobbyVo2;
@Service
public class DeptEmpServiceImpl implements IDeptEmpService {

	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private IDeptService deptService;
	@Autowired
	private IEmpService empService;
	
	@Override
	public void insert(DeptDto dto,List<EmpDto> emps) throws Exception {
		deptService.insert(dto);
		System.out.println(emps);
		for(EmpDto emp: emps) {
			System.out.println(emp);
			if(emp!=null) {
				System.out.println(emp+"insert");
	            empService.insert(new EmpDto());
			}
		}
	}

	@Override
	public List<DeptEmpDto> selectAll() throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		
		List<DeptEmpDto> dtos=dao.selectAllDeptEmp();
		
		
		return dtos;
	}

	@Override
	public void delete(int deptNo) throws Exception {
		empService.delete(deptNo);
		deptService.delete(deptNo);
	}

	@Override
	public void deleteEmp(int empNo) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		dao.delete(empNo);
		
	}
	@Override
	public void update(DeptDto dto) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.update(dto);
		
	}
//	@Override
//	public Integer selectMaxDeptNo() throws Exception {
//		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
//		return dao.selectMaxDeptNo();
//	}
//	@Override
//	public List<CustomerHobbyVo2> selectAllCustomerHobby() throws Exception {
//		// TODO Auto-generated method stub
//		ICustomerDao dao=sqlSession.getMapper(ICustomerDao.class);
//		return dao.selectAllCustomerHobby();
//	}

}
