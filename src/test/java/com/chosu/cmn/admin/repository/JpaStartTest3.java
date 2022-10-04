package com.chosu.cmn.admin.repository;

import com.chosu.cmn.study.repository.TestBasicUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaStartTest3 {

    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    public void crud(){
        /*userTestRepository.save(new User("new test", "newtest@fastcampus.com"));

        userTestRepository.flush();

        userTestRepository.findAll().forEach(System.out::println);*/

        //userTestRepository.saveAndFlush(new User("new test", "newtest@fastcampus.com"));
        // db 반영 시점 조절 flush

        long count = testBasicUserRepository.count();
        System.out.println(count);

        // count query execute
        boolean exists = testBasicUserRepository.existsById(10L);
        System.out.println(exists);


        //delete reference
        //userTestRepository.delete(userTestRepository.findById(10L).orElse(null));
        //userTestRepository.delete(userTestRepository.findById(10L).orElseThrow(RuntimeException::new));
        //userTestRepository.deleteById(11L);
        //userTestRepository.findAll().forEach(System.out::println);
        //userTestRepository.deleteAll(); 갯수대로 쿼리실행 deleteInBatch를 사용해야함
        //userTestRepository.deleteAll(userTestRepository.findAllById(Lists.newArrayList(12L, 13L)));
        //userTestRepository.deleteAllInBatch();
        //userTestRepository.deleteAllInBatch(userTestRepository.findAllById(Lists.newArrayList(12L, 13L)));


    }
}
