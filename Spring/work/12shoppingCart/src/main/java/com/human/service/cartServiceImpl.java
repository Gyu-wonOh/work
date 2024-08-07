package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.ICartDao;
import com.human.dao.IProductDao;
import com.human.dao.IUserDao;
import com.human.dto.CartDto;
import com.human.dto.ProductDto;
@Service
public class cartServiceImpl implements ICartService {
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private ICartService cartService;
	
	@Override
	public void insert(CartDto dto) throws Exception {
		ICartDao dao = sqlSession.getMapper(ICartDao.class);
		dao.insert(dto);
		int maxId =dao.selectMaxId();
		System.out.println(maxId);
		IUserDao user = sqlSession.getMapper(IUserDao.class);
		user.updateCart(dto.getUserId(),maxId);
	}

	@Override
	public List<CartDto> selectAll() throws Exception {
		ICartDao dao = sqlSession.getMapper(ICartDao.class);
		return dao.selectAll();
	}

	@Override
	public void update(CartDto dto) throws Exception {
		ICartDao dao = sqlSession.getMapper(ICartDao.class);
		dao.update(dto);
	}

	@Override
	public void deleteProduct(String productCode) throws Exception {
		ICartDao dao = sqlSession.getMapper(ICartDao.class);
		dao.deleteProduct(productCode);
	}
	@Override
	public void deleteCart(int cartId) throws Exception {
		ICartDao dao = sqlSession.getMapper(ICartDao.class);
		dao.deleteCart(cartId);
	}

	@Override
	public List<CartDto> selectUser(String id) throws Exception {
		ICartDao dao = sqlSession.getMapper(ICartDao.class);
		System.out.println(dao);
		List<CartDto> dtos = dao.selectUser(id);
		System.out.println(dtos);
		return dtos;
	}

}
