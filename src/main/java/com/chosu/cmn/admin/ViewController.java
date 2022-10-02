package com.chosu.cmn.admin;

import com.chosu.cmn.admin.user.UserDto;
import com.chosu.cmn.admin.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ViewController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(UserDto userDto){
        System.out.println("userDto : "+ userDto);
        System.out.println("userDto : "+ userDto);
        System.out.println("userDto : "+ userDto);

        if(userDto.getEmail() != null) userService.insertUser(userDto);
        return "index";
    }

    @RequestMapping("/main")
    public ModelAndView main(UserDto userDto) {
        ModelAndView mv = new ModelAndView();
        System.out.println("userDto : "+ userDto);
        System.out.println("userDto : "+ userDto);
        System.out.println("userDto : "+ userDto);
        mv.addObject("userDto",userService.loginUser(userDto).get());
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("/cmnCode")
    public String cmnCode(){
        return "cmnCode";
    }

    @RequestMapping("/cmnLog")
    public String cmnLog(){
        return "cmnLog";
    }

    @RequestMapping("/boardExample")
    public String boardExample(){
        return "boardExample";
    }

    @RequestMapping("/crawling")
    public String crawling(){
        return "crawling";
    }

    @RequestMapping("/user/registUser")
    public String registUser(){
        return "/user/registUser";
    }
}
