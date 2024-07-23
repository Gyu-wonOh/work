package com.human.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IEmpDao;
import com.human.dto.EmpDto;



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
	public void update(EmpDto dto) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(int empNo) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		dao.delete(empNo);

	}

	@Override
	public ArrayList<EmpDto> selectAll() throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		System.out.println(dao.selectAll());
		return dao.selectAll();
	}

	@Override
	public EmpDto selectEmpNo(int empNo) throws Exception {
		IEmpDao dao=sqlSession.getMapper(IEmpDao.class);
		return dao.selectEmpNo(empNo);
	}
}
