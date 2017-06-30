package com.mfblog.mvc.controller;

import com.google.gson.Gson;
import com.mfblog.domain.PostCustom;
import com.mfblog.service.post.PostService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mfblog")
public class MainController {

    @Autowired
    private PostService postService;

    @RequestMapping(value ="/index",method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    public @ResponseBody Object test(@Param("num") int num,@Param("size") int size){


        List<PostCustom> list = postService.findAllPublish(num,size);

        return new Gson().toJson(list);
    }
}
