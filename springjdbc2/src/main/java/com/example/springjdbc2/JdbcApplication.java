package com.example.springjdbc2;

import lombok.Lombok;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class JdbcApplication implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        memberRepository.save(Member.builder()
//                        .name("정수빈")
//                        .email("SubinJung@hanbit.co.kr")
//                        .age(10).build());
//
//        memberRepository.save(Member.builder()
//                .name("윤지웅")
//                .email("JieungYoon@hanbit.co.kr")
//                .age(10).build());
//
//        var members = memberRepository.findAll();
//        log.info("{}", members);

//        var members = memberRepository.findByName("윤서준");
//        log.info("{}",members);

        var members = memberRepository.findByAgeGreaterThan(20);
        log.info("{}",members);


    }

}
