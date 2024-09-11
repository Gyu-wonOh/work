package com.example.start01.controller;

import com.example.start01.dto.HumanDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j  //로그용 라이브러리
public class MyController {
    @GetMapping("/")
    public String start(Model model){
        return "01start";
    }
    @GetMapping("model1")
    public String intro(Model model){
        log.info("model1");
        model.addAttribute("key","value=02model1");
        return "02model";
    }
    @GetMapping("model2")
    public ModelAndView intro() {
        log.info("model2");
        // ModelAndView 객체 생성
        ModelAndView modelAndView = new ModelAndView();
        // 모델에 데이터 추가
        modelAndView.addObject("key", "value=model2");
        // 뷰 이름 설정
        modelAndView.setViewName("02model");
        return modelAndView;
    }

    @GetMapping("model3")
    public String thymeleafOutput(Model model) {


        // map 데이터 (묶음 데이터)
        Map<String, String> rmap = new HashMap<>();
        rmap.put("key1", "홍길동");
        rmap.put("key2", "21");
        rmap.put("key3", "대전");

        model.addAttribute("mapdata", rmap);

        // HumanDto 데이터
        HumanDto humanDto = new HumanDto();
        humanDto.setName("아무개");
        humanDto.setAge(30L);  // long 타입
        humanDto.setHeight(180.5);
        humanDto.setBirthday(LocalDateTime.of(1993, 7, 21, 10, 30));

        model.addAttribute("humanDto", humanDto);

        // javascript 출력용 데이터
        model.addAttribute("message", "success");
        // tag 데이터
        model.addAttribute("titleStr", "<h1>제목</h1>");
        return "03model"; // t_output이라는 이름의 뷰를 반환
    }

    @GetMapping("model4")
    public String thymeleafControl(Model model) {
        model.addAttribute("title", "이 문자열은 제목");
        model.addAttribute("age", 20);

        List<HumanDto> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            HumanDto dto = new HumanDto();
            dto.setName("이름" + i);
            dto.setAge(25 + i);
            dto.setHeight(170 + i);
            dto.setBirthday(LocalDateTime.of(1993, 7, 21, 10, 30).plusYears(i)); // 예제용 생일 설정
            list.add(dto);
        }
        model.addAttribute("list", list);

        return "04model"; // t_control이라는 이름의 뷰를 반환
    }

   //model5?name=John&age=25&height=175.5&birthday=2023-09-11T15:30
    @GetMapping("model5")
    public String noneDtoSend(@RequestParam("name") String name,
                              @RequestParam("age") long age, // `long` 타입으로 수정
                              @RequestParam("height") double height, // 추가된 필드
                              @RequestParam("birthday") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime birthday,
                              Model model) {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("height : " + height);
        System.out.println("birthday : " + birthday);

        model.addAttribute("result", "none dto send OK");
        return "05model";
    }
    //model6?name=John&age=25&height=175.5&birthday=2023-09-11T15:30
    @GetMapping("model6")
    public String dtoSend(@ModelAttribute HumanDto humanDto, Model model) {
        System.out.println("name : " + humanDto.getName());
        System.out.println("age : " + humanDto.getAge());
        System.out.println("height : " + humanDto.getHeight());
        System.out.println("birthday : " + humanDto.getBirthday());

        model.addAttribute("result", "dto send OK");
        return "06model";
    }
    //model7?name=John&age=25&height=175.5&birthday=2023-09-11T15:30
    @GetMapping("model7")
    public String thymeleafControl1(Model model) {
        // 데이터를 모델에 추가
        model.addAttribute("str", "control1");
        model.addAttribute("age", 20);

        List<HumanDto> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            HumanDto human = new HumanDto();
            human.setName("이름" + i);
            human.setAge(25 + i);
            human.setHeight(170.0 + i); // height 추가
            human.setBirthday(LocalDateTime.of(1993, 7, 21, 10, 30).plusYears(i)); // 생일 설정
            list.add(human);
        }

        // 리스트 데이터를 모델에 추가
        model.addAttribute("list", list);

        HumanDto human = new HumanDto();
        human.setName("이름");
        human.setAge(25);
        human.setHeight(170.0 ); // height 추가
        human.setBirthday(LocalDateTime.of(1993, 7, 21, 10, 30).plusYears(1));

        model.addAttribute("dto", human);
        // 뷰 이름 반환
        return "07model";
    }
}
