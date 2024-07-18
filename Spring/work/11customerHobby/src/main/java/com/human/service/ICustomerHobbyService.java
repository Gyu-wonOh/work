package com.human.service;

import java.util.ArrayList;
import java.util.List;

import com.human.dto.CustomerDto;
import com.human.dto.CustomerHobbyDto;

public interface ICustomerHobbyService {
	public List<CustomerHobbyDto>selectAll()throws Exception;
	public void insertCustomHobby(CustomerDto dto, ArrayList<String> hobbys) throws Exception;
	
}
