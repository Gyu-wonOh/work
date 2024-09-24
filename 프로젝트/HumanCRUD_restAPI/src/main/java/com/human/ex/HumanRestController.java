package com.human.ex;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.human.dto.HumanDto;
import com.human.service.IHumanService;

@RestController
@RequestMapping("rest")
public class HumanRestController {
	@Autowired
	private IHumanService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HumanRestController.class);
	
	@RequestMapping(value ="/all", method = RequestMethod.GET)
	public ResponseEntity<List<HumanDto>> selectAll(){
		ResponseEntity<List<HumanDto>> entity =null;
		try {
			entity = new ResponseEntity<>(service.selectAll(),HttpStatus.OK); /*HttpStatus 는 상태정보*/
		}catch (Exception e) {
			e.printStackTrace();
			entity= new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value="/all/{name}",method=RequestMethod.GET)
	ResponseEntity<HumanDto> selectId(@PathVariable("name")String name){
		ResponseEntity<HumanDto> entity = null;
		
		try {
			entity =new ResponseEntity<>(service.selectName(name),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value ="", method =RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody HumanDto dto) {
		
		ResponseEntity<String> entity =null;
		try {
			service.insert(dto);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value="/{name}", method = {RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<String> update(@PathVariable("name")String name,@RequestBody HumanDto dto){
		ResponseEntity<String> entity = null;
		try {
			dto.setName(name);
			service.update(dto);
		
			entity =new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value="/{name}",method =RequestMethod.DELETE)
	public ResponseEntity<String> remove(@PathVariable("name")String name){
		ResponseEntity<String> entity = null;
		try {
			service.delete(name);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
