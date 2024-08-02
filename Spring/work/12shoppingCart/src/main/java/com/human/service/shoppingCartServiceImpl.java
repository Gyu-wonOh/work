package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IProductDao;
import com.human.dao.IShoppingCartDao;
import com.human.dto.ProductDto;
import com.human.dto.ShoppingCartDto;
@Service
public class shoppingCartServiceImpl implements IShoppingCartService {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(ShoppingCartDto dto) throws Exception {
		IShoppingCartDao dao = sqlSession.getMapper(IShoppingCartDao.class);
		dao.insert(dto);
	}

	@Override
	public List<ShoppingCartDto> selectUser(String userId) throws Exception {
		IShoppingCartDao dao =sqlSession.getMapper(IShoppingCartDao.class);
		return dao.selectUser(userId);
	}

	@Override
	public void update(ShoppingCartDto dto) throws Exception {
		IShoppingCartDao dao =sqlSession.getMapper(IShoppingCartDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(int cartId) throws Exception {
		IShoppingCartDao dao =sqlSession.getMapper(IShoppingCartDao.class);
		dao.delete(cartId);
	}

	@Override
	public List<ShoppingCartDto> selectAll() throws Exception {
		IShoppingCartDao dao =sqlSession.getMapper(IShoppingCartDao.class);
		return dao.selectAll();
	}

}
