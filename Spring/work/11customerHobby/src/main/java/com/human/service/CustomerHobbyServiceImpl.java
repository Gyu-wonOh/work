package com.human.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.ICustomerDao;
import com.human.dto.CustomerDto;
import com.human.dto.CustomerHobbyDto;
import com.human.dto.HobbyDto;

@Service
public class CustomerHobbyServiceImpl implements ICustomerHobbyService {
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private IHobbyService hobbyService;
	@Autowired
	private ICustomerService customerService;

	@Override
	public List<CustomerHobbyDto> selectAll() throws Exception {

		ICustomerDao dao = sqlSession.getMapper(ICustomerDao.class);

		List<CustomerHobbyDto> dtos = dao.selectAllCustomerHobby();

		return dtos;
	}

	@Override
	public void insertCustomHobby(CustomerDto dto, ArrayList<String> hobbys) throws Exception {
		
		customerService.insert(dto);//CustomerDto 데이터 넣는 작업
		int maxId=customerService.selectMaxId();//마지막에 넣은 고객 id를 읽어오기 위해서 사용
		
		System.out.println(hobbys);
	      for(String hobby :hobbys) {
	         System.out.println(hobby);
	         if(!hobby.equals("")) {
	         System.out.println(hobby+"insert");
	            hobbyService.insert(new HobbyDto(maxId,hobby));
	         }
	      }
	}

	@Override
	public void selectCustomerHobby(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCustom(Integer id) throws Exception {
		hobbyService.deleteId(id);
		customerService.delete(id);
	}

	@Override
	public void deleteIdHobby(Integer id, String hobby) throws Exception {
		hobbyService.deleteIdHobby(id,hobby);
	}
	
}
