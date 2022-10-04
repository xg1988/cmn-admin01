package com.chosu.cmn.admin.querymethod;

import com.chosu.cmn.study.repository.TestOrderUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class QueryMethodTest3 {

    @Autowired
    TestOrderUserRepository testOrderUserRepository;

    @Test
    void select(){
        System.out.println("findTop1ByName: "+testOrderUserRepository.findTop1ByName("test3"));
        //System.out.println("findLast1ByName: "+testOrderUserRepository.findLast1ByName("test2"));
        System.out.println("findTop1ByNameOrderByIdDesc: "+testOrderUserRepository.findTop1ByNameOrderByIdDesc("test3"));
        System.out.println("findFirstByNameOrderByIdDescEmailAsc: "+testOrderUserRepository.findFirstByNameOrderByIdDescEmailAsc("test3"));
        System.out.println("findFirstByName: "+testOrderUserRepository.findFirstByName("test3", Sort.by(Sort.Order.desc("name"))));
        System.out.println("findFirstByName: "+testOrderUserRepository.findFirstByName("test3", getSort()));
    }

    private Sort getSort(){
        return Sort.by(
                Sort.Order.desc("name"),
                Sort.Order.desc("email"),
                Sort.Order.asc("createAt")
        );
    }
}
