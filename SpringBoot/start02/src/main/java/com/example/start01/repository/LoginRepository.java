package com.example.start01.repository;

import com.example.start01.model.entity.LoginEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface LoginRepository extends CrudRepository<LoginEntity,Integer> {
    @Override
    ArrayList<LoginEntity> findAll();//LoginEntity 테이블의 모든 데이터 검색
    //시그니처 메소드들
    //Optional<LoginEntity> findById(Integer id);

    //이름에 특정문자가 포함된 로그인 정보 검색(like 검색)
    ArrayList<LoginEntity> findByNameContaining(String name);

    // ID와 비밀번호로 사용자 검색
    @Query("SELECT l FROM LoginEntity l WHERE l.id = :id AND l.password = :password")
    ArrayList<LoginEntity> findByIdAndPassword(@Param("id") Integer id, @Param("password") String password);

    // 특정 이름을 가진 사용자가 존재하는지 확인하는 메서드
    boolean existsByName(String name);

    // ID가 주어진 값보다 큰 로그인 정보 검색
    ArrayList<LoginEntity> findByIdGreaterThan(Integer id);

    // 모든 로그인 정보의 수를 세는 메서드
    @Query("SELECT count(l) FROM LoginEntity l")
    long countAll();

    // 이름으로 로그인 정보를 검색하기
    ArrayList<LoginEntity> findByName(String name);

    // 이름과 비밀번호로 로그인 정보 검색
    @Query("SELECT l FROM LoginEntity l WHERE l.name = :name AND l.password = :password")
    LoginEntity findByNameAndPassword(@Param("name") String name, @Param("password") String password);

    // ID와 이름으로 로그인 정보가 존재하는지 확인
    @Query("SELECT count(l.id) FROM LoginEntity l WHERE l.name = :name AND l.id = :id")
    int existsQuery(@Param("name") String name, @Param("id") Integer id);

    // 이름으로 로그인 정보를 검색하는 메서드
    @Query("SELECT l FROM LoginEntity l WHERE l.name = ?1 ORDER BY l.name ASC")
    ArrayList<LoginEntity> findByNameOrderByAsc(String name);

    // 비밀번호로 로그인 정보를 검색하는 메서드
    ArrayList<LoginEntity> findByPassword(String password);

    // JPQL을 사용하여 모든 로그인 정보 검색
    @Query("SELECT l FROM LoginEntity l")
    ArrayList<LoginEntity> findAllLogins();

    // 일반 SQL 쿼리
    @Query(value = "SELECT * FROM login_entity l WHERE l.name LIKE %:searchKeyword%", nativeQuery = true)
    ArrayList<LoginEntity> selectAllSQL(@Param("searchKeyword") String searchKeyword);

}
