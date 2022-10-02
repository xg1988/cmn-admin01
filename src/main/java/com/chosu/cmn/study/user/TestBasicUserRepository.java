package com.chosu.cmn.study.user;

import com.chosu.cmn.admin.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 공부를 위한 테스트 리포지토리
 */
public interface TestBasicUserRepository extends JpaRepository<User, Long> {
    //User findByName(String name);
    List<User> findByName(String name);

    User findByEmail(String email);
    User getByEmail(String email);
    User readByEmail(String email);
    User queryByEmail(String email);
    User searchByEmail(String email);
    User streamByEmail(String email);

    User findSomethingByEmail(String email);

    //에러발생하지 않는다, 테스트 코드를 작성해야함- Warning 메서드 'findByByName(java.lang.String)'이(가) 한 번도 사용되지 않습니다
    //User findByByName(String name);

    User findEmailByName(String name);

    List<User> findFirst1ByName(String name);
    List<User> findTop1ByName(String name);

    List<User> findFirst2ByName(String name);
    List<User> findTop2ByName(String name);

    List<User> findLast1ByName(String name); // 인식하지 않는 키워드는 그냥 패스한다. last1없는 케이스랑 동일하게 나옴


}
