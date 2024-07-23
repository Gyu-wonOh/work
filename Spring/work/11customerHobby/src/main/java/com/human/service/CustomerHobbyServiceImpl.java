package com.human.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.ICustomerDao;
import com.human.dto.CustomerDto;
import com.human.dto.CustomerHobbyDto;
import com.human.dto.CustomerHobbysDto;
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
		
		ICustomerDao dao=sqlSession.getMapper(ICustomerDao.class);
		
		List<CustomerHobbyDto> dtos=dao.selectAllCustomerHobby();
		
		
		return dtos;
	}
	
	@Override
	   public void insertCustomHobby(CustomerDto dto, ArrayList<String> hobbys)throws Exception {
	            
	      customerService.insert(dto);
	      int maxId=customerService.selectMaxId();
	      
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
	public void deleteCustom(Integer id) throws Exception {
		//hobby지우고 customer지운다.
		hobbyService.deleteId(id);
		customerService.delete(id);
	}

	@Override
	public void deleteHobby(Integer id, String hobby) throws Exception {
		
		hobbyService.deleteIdHobby(id,hobby);
	}
	@Override
	public List<CustomerHobbysDto> selectAll2() throws Exception {
		List<CustomerHobbysDto> chDtos = new ArrayList<CustomerHobbysDto>();

		List<CustomerDto> customerDtos = customerService.selectAll();
		System.out.println(customerDtos);

		if (customerDtos != null) {
			for (CustomerDto dto : customerDtos) {

				List<String> hobbys = hobbyService.selectId(dto.getId());
				chDtos.add(new CustomerHobbysDto(dto, hobbys));

			}
		}
		return chDtos;
	}
}
