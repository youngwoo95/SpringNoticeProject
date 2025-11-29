package com.example.springjdbc2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    /*
    * JDBC에서 지원하는 키워드를 써야함 ...? 이게맞나
    * */
    List<Member> findByName(String name);

    List<Member> findByEmail(String email);

    List<Member> findByNameAndEmail(String name, String email);

    List<Member> findByNameOrEmail(String name, String email);

    List<Member> findByAge(Integer age);

    List<Member> findByAgeGreaterThan(Integer age);

    List<Member> findByAgeLessThan(Integer age);

    List<Member> findByAgeBetween(Integer min, Integer max);
}
