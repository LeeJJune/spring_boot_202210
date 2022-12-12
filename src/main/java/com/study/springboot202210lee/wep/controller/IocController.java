package com.study.springboot202210lee.wep.controller;

import com.study.springboot202210lee.iocAndDi.UserService;
import com.study.springboot202210lee.iocAndDi.UserServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IocController {
    @Autowired
    @Qualifier("usi3")
    // @Autowired 는 2개 이상 사용하면 에러가 발생함으로
    // 2개 이상 사용시 @Component("변수명") 작성 후 @Qualifier("변수명") 으로 사용한다.
    // @Qualifier 도 마찬가지로 2개 이상 사용 불가하다

    private UserService userService;

    /*
    위에 @Autowired 때문에 아래 메모리 지정을 따로 해줄 필요 없다
    @Autowired 자동으로 메모리를 찾아서 생성한다
    public void UserServiceImpl2(UserServiceImpl2 userService) {
        this.userService = userService;
    }
    */
    @ResponseBody
    @GetMapping("/ioc")
    public String iocTest(){
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();

        return null;
    }

}
