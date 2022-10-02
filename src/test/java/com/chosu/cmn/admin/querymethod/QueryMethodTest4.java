package com.chosu.cmn.admin.querymethod;

import com.chosu.cmn.study.user.TestOrderUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class QueryMethodTest4 {

    @Autowired
    TestOrderUserRepository testOrderUserRepository;

    @Test
    public void test(){
        System.out.println("findByNameWithPaging:"
                + testOrderUserRepository.findByName("david"
                , PageRequest.of(0,1, Sort.by(Sort.Order.desc("id"))))
                .getContent());
    }
}
