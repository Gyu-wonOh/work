package com.example.start01.repository;

import com.example.start01.model.entity.LoginEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface LoginRepository extends CrudRepository<LoginEntity,Integer> {
    @Override
    ArrayList<LoginEntity> findAll();//LoginEntity 테이블의 모든 데이터 검색
}
