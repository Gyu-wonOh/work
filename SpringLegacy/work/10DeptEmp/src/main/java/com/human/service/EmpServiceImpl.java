package com.human.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IEmpDao;
import com.human.dto.EmpDto;
//import com.human.vo.CustomerHobbyVo;
//import com.human.vo.CustomerHobbyVo2;
@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(EmpDto dto) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		dao.insert(dto);		
	}
	@Override
	public EmpDto select(int id) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		return dao.select(id);
	}

	@Override
	public List<EmpDto> selectAll() throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		return dao.selectAll();
	}

	@Override
	public void delete(int deptNo) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		dao.delete(deptNo);
		
	}

	@Override
	public void update(EmpDto dto) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
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
