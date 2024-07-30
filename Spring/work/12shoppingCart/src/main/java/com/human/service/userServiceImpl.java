package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IUserDao;
import com.human.dto.UserDto;
@Service
public class userServiceImpl implements IUserService {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(UserDto dto) throws Exception {
		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		dao.insert(dto);
	}

	@Override
	public List<UserDto> selectAll() throws Exception {
		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		return dao.selectAll();
	}

	@Override
	public UserDto select(String id) throws Exception {
		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		return dao.select(id);
	}

	@Override
	public void update(@Param("pw")String pw, @Param("email")String email,@Param("phoneNumber")String PhoneNumber, @Param("id")String id) throws Exception {
		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		dao.update(pw, email, PhoneNumber, id);
	}

	@Override
	public void delete(String id) throws Exception {
		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		dao.delete(id);
	}

}
