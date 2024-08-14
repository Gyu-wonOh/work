package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IBoardDao;
import com.human.dto.BoardDto;
@Service
public class boardServiceImpl implements IBoardService {

	@Autowired
	private SqlSession sqlSession;
	@Override
	public void create(BoardDto dto) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		dao.create(dto);

	}

	@Override
	public BoardDto read(int bId) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		return dao.read(bId);
	}

	@Override
	public void update(BoardDto dto) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		dao.update(dto);
	}

	@Override
	public void bHitUpdate(int bId) throws Exception {
		IBoardDao dao =sqlSession.getMapper(IBoardDao.class);
		dao.bHitUpdate(bId);
	}

	@Override
	public void bLike(int bId) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		dao.bLike(bId);
	}

	@Override
	public void bDislike(int bId) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		dao.bDislike(bId);
	}

	@Override
	public void delete(int bId) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		dao.delete(bId);
	}

	@Override
	public List<BoardDto> listAll() throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		return dao.listAll();
	}

	@Override
	public List<BoardDto> listMenu(@Param("bGroupKind")String bGroupKind) throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		return dao.listMenu(bGroupKind);
	}

	@Override
	public String menuKind() throws Exception {
		IBoardDao dao = sqlSession.getMapper(IBoardDao.class);
		return dao.menuKind();
	}

}
