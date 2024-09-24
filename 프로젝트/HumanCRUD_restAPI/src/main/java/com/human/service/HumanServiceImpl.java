package com.human.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.HumanDao;
import com.human.dto.HumanDto;
@Service
public class HumanServiceImpl implements IHumanService {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(HumanDto dto) throws Exception {
		HumanDao dao =sqlSession.getMapper(HumanDao.class);
		dao.insert(dto);
	}

	@Override
	public void update(HumanDto dto) throws Exception {
		HumanDao dao =sqlSession.getMapper(HumanDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(String name) throws Exception {
		HumanDao dao =sqlSession.getMapper(HumanDao.class);
		dao.delete(name);
	}

	@Override
	public List<HumanDto> selectAll() throws Exception {
		HumanDao dao =sqlSession.getMapper(HumanDao.class);
		return dao.selectAll();
	}

	@Override
	public HumanDto selectName(String name) throws Exception {
		HumanDao dao =sqlSession.getMapper(HumanDao.class);
		return dao.selectName(name);
	}

}
