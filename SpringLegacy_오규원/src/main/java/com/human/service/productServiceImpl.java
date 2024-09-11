package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IProductDao;
import com.human.dto.ProductDto;
@Service
public class productServiceImpl implements IProductService {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(ProductDto dto) throws Exception {
		IProductDao dao = sqlSession.getMapper(IProductDao.class);
		dao.insert(dto);
	}

	@Override
	public List<ProductDto> selectAll() throws Exception {
		IProductDao dao = sqlSession.getMapper(IProductDao.class);
		return dao.selectAll();
	}

	@Override
	public ProductDto select(String productCode) throws Exception {
		IProductDao dao = sqlSession.getMapper(IProductDao.class);
		return dao.select(productCode);
	}

	@Override
	public void update(ProductDto dto) throws Exception {
		IProductDao dao = sqlSession.getMapper(IProductDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(String productCode) throws Exception {
		IProductDao dao = sqlSession.getMapper(IProductDao.class);
		dao.delete(productCode);
	}

}
