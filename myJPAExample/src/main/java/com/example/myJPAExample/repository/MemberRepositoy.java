package com.example.myJPAExample.repository;

import com.example.myJPAExample.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepositoy extends JpaRepository<Member, Long> {

    List<Member> findByName(String name);

    List<Member> findByEmail(String name);

    List<Member> findByAgeGreaterThan(Integer age);
}
