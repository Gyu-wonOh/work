package com.human.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.human.dto.SampleDto;


@RestController
@RequestMapping("/sample")
public class SampleController {

  @RequestMapping("/hello")
  public String sayHello() {
    return "Hello World ";
  }

  @RequestMapping("/sendVO")
  public SampleDto sendVO() {

    SampleDto vo = new SampleDto();
    vo.setFirstName("길동");
    vo.setLastName("홍");
    vo.setMno(123);

    return vo;
  }

  @RequestMapping("/sendList")
  public List<SampleDto> sendList() {

    List<SampleDto> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      SampleDto vo = new SampleDto();
      vo.setFirstName("길동");
      vo.setLastName("홍");
      vo.setMno(i);
      list.add(vo);
    }
    return list;
  }

  @RequestMapping("/sendMap")
  public Map<Integer, SampleDto> sendMap() {

    Map<Integer, SampleDto> map = new HashMap<>();

    for (int i = 0; i < 10; i++) {
      SampleDto vo = new SampleDto();
      vo.setFirstName("길동");
      vo.setLastName("홍");
      vo.setMno(i);
      map.put(i, vo);
    }
    return map;
  }

  @RequestMapping("/sendErrorAuth")
  public ResponseEntity<Void> sendListAuth() {

    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

  @RequestMapping("/sendErrorNot")
  public ResponseEntity<List<SampleDto>> sendListNot() {

    List<SampleDto> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      SampleDto vo = new SampleDto();
      vo.setFirstName("길동");
      vo.setLastName("홍");
      vo.setMno(i);
      list.add(vo);
    }

    return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
  }

}
