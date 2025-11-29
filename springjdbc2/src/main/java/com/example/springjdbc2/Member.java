package com.example.springjdbc2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/*
* Lombok 사용
* */
/* 이름이 DB와 다를때 직접 매핑해도 된다. */
@Table("Member") /* @Table 어노테이션 붙이면 해당 클래스는 데이터베이스와 연동되어있는 클래스라는것을 명시함 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    /* PK */
    @Id
    private Long id;

    @Column("name") /* 이름이 DB와 다를때 직접 매핑해도 된다. */
    private String name;
    private String email;
    private Integer age;
}

