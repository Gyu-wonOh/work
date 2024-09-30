package com.example.start01.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자
@ToString
@Getter
@Setter
@SequenceGenerator(
        name="LOGIN_ID_SEQ_GEN",//시퀀스 제너레이터 이름
        sequenceName="LOGIN_ID_SEQ",//시퀀스 이름
        initialValue=1,//시작값
        allocationSize=1//메모리를 통해 할당할 범위 사이즈
)
public class LoginEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String password;
}
