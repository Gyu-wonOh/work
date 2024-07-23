package com.human.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IDeptDao;
import com.human.dto.DeptDto;
//import com.human.vo.CustomerHobbyVo;
//import com.human.vo.CustomerHobbyVo2;
@Service
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(DeptDto dto) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.insert(dto);		
	}
	@Override
	public DeptDto select(int id) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		return dao.select(id);
	}

	@Override
	public List<DeptDto> selectAll() throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		return dao.selectAll();
	}

	@Override
	public void delete(int deptNo) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.delete(deptNo);
		
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
