package com.chosu.cmn.study.util;

import com.chosu.cmn.admin.user.User;
import com.chosu.cmn.study.support.BeanUtils;
import com.chosu.cmn.study.user.UserHistory;
import com.chosu.cmn.study.user.UserHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.PreUpdate;

public class UserEntityListener {

    @PreUpdate
    public void preUpdate(Object o){
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User)o;
        UserHistory userHistory = new UserHistory();
        userHistory.setUserId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);
    }
}
