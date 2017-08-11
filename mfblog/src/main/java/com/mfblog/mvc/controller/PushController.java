package com.mfblog.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Created by liushiyu on 2017/7/4.
 */
@Controller
@RequestMapping("/push")
public class PushController {

    @RequestMapping(value = "/set",method = RequestMethod.GET,produces = APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String setup(){

        return "老鼠你不懂爱";

    }

}
