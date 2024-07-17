package com.human.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IHumanDao;
import com.human.dto.deptDto;
@Service
public class HumanServiceImpl implements IHumanService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(deptDto dto) throws Exception {
		IHumanDao dao=sqlSession.getMapper(IHumanDao.class);
		dao.insert(dto);
	}

	@Override
	public void update(deptDto dto) throws Exception {
		IHumanDao dao=sqlSession.getMapper(IHumanDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(int deptNo) throws Exception {
		IHumanDao dao=sqlSession.getMapper(IHumanDao.class);
		dao.delete(deptNo);

	}

	@Override
	public ArrayList<deptDto> selectAll() throws Exception {
		IHumanDao dao=sqlSession.getMapper(IHumanDao.class);
		System.out.println(dao.selectAll());
		return dao.selectAll();
	}

	@Override
	public deptDto selectDeptNo(int deptNo) throws Exception {
		IHumanDao dao=sqlSession.getMapper(IHumanDao.class);
		return dao.selectDeptNo(deptNo);
	}

}
