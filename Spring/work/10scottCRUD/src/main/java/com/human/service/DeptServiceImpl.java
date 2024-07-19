package com.human.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IDeptDao;
import com.human.dto.DeptDto;
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
	public void update(DeptDto dto) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(int deptNo) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		dao.delete(deptNo);

	}

	@Override
	public ArrayList<DeptDto> selectAll() throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		System.out.println(dao.selectAll());
		return dao.selectAll();
	}

	@Override
	public DeptDto selectDeptNo(int deptNo) throws Exception {
		IDeptDao dao=sqlSession.getMapper(IDeptDao.class);
		return dao.selectDeptNo(deptNo);
	}

}
