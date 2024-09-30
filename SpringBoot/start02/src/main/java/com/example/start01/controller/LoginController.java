package com.example.start01.controller;

import com.example.start01.model.entity.LoginEntity;
import com.example.start01.model.request.LoginDto;
import com.example.start01.repository.LoginRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@Slf4j
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/insert")
    public String insert(){

        return "insert";
    }
    /*
    JPA를 이용한 데이터베이스 작업
    자바 객체를 관계형 데이터베이스에 자동 맵핑시키는 방식 - ORM을 지원하기 위한 인터페이스
    최소한의 SQL을 사용해서 데이터베이스를 사용하자.

    @Entity         객체를 테이블로 만들어라
    @ID             해당 필드를 키로 사용해라
    @GeneratedValue sequence 자동증가 필드
    @Column         테이블의 컬럼

    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "account")
        private String account;

        // 다른 필드와 getter/setter 생략
    }
    */
    @PostMapping("/insert")
    public String insertPost(LoginDto dto, Model model){
        System.out.println(dto);
        LoginEntity entitySaved = loginRepository.save(dto.toEntity());
        System.out.println(entitySaved);
        log.info("log");
        return "redirect:selectOne/"+entitySaved.getId();
    }
    //selectOne/1
    @GetMapping("/selectOne/{id}")
    public String selectOne(@PathVariable Integer id,Model model){
        //찾으면 찾은 데이터가 리턴, 못 찾으면 null이 리턴
        //optional  .orElse null처리를 함
        LoginEntity dto= loginRepository.findById(id).orElse(null);
        model.addAttribute("dto",dto);
        System.out.println(dto);
        return "selectOne";
    }
    @GetMapping("/selectAll")
    public String selectAll(Model model){
        ArrayList<LoginEntity> dtos = loginRepository.findAll();
        model.addAttribute("dtos",dtos);
        System.out.println(dtos);
        return "selectAll";
    }
    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Integer id, RedirectAttributes rttr){
        LoginEntity dto = loginRepository.findById(id).orElse(null);
        if(dto!=null){
            loginRepository.delete(dto);
            rttr.addFlashAttribute("msg","SUCCESS");
        }else{
            rttr.addFlashAttribute("msg", "fail");
        }
        return "redirect:/selectAll";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id,Model model){
        LoginEntity dto= loginRepository.findById(id).orElse(null);
        model.addAttribute("dto",dto);
        return "update";
    }
    @PostMapping("/update")
    public String update(LoginDto dto){
        LoginEntity entity = dto.toEntity();
        System.out.println(dto);
        loginRepository.save(entity);
        return "redirect:/selectOne/"+entity.getId();
    }
    @GetMapping("/all")
    public String getAllLogins(){
        LoginEntity entity = loginRepository.findById(1).orElse(null);
        System.out.println(entity);
        //이름에 특정문자가 포함된 로그인 정보 검색(like 검색)
        String nameContaining = "p";
        ArrayList<LoginEntity> loginContaining=
                loginRepository.findByNameContaining(nameContaining);
        System.out.println(loginContaining);
        return"selectAll";
    }
    @GetMapping("/findIdAndPassword")
    public String searchAccount(){
        Integer id = 1;
        String password="1234";
       ArrayList<LoginEntity> account = loginRepository.findByIdAndPassword(id,password);
       System.out.println(account);
       return "selectAll";
    }
    @GetMapping("/existName")
    public String existName(){
        String name = "p1";
        boolean existName = loginRepository.existsByName(name);
        System.out.println(existName);
        return "selectAll";
    }
    @GetMapping("/countAll")
    public String countAll(){
        Long countAll=loginRepository.countAll();
        System.out.println(countAll);
        return "selectAll";
    }
    @GetMapping("/greater")
    public String greater(){
        Integer id = 1;
        ArrayList<LoginEntity> greater = loginRepository.findByIdGreaterThan(id);
        return"selectAll";
    }
    @GetMapping("/searchName")
    public String searchName(){
        String name = "p1";
        ArrayList<LoginEntity> searchName = loginRepository.findByName(name);
        return "selectAll";
    }
    @GetMapping("/searchNameAndPassword")
    public String searchNameAndPassword(){
        String name ="p1";
        String password ="1234";
        LoginEntity searchNameAndPassword = loginRepository.findByNameAndPassword(name,password);
    }
}
