package com.psc.spring_03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //SpringBoot에서 컨트롤러로 동작할거야 라고 지칭해주는 주석(어노테이션)

public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/Hello") //나는 웹서비스에서 사용할 길을 하나 만들거야. /Hello
    @ResponseBody
    public String helloString() {
        logger.info("hello URL 오픈!");
        //문제발생시 로그를 남길 떄
        logger.debug("디버그시 필요한 로그입니다");
        logger.trace("디버그시 필요한 로그입니다");

        logger.warn("경고표시 나타내는 로그입니다");
        logger.error("오류표시 나타내는 로그입니다");
        return "Hello SpringBoot!";
    }
}
