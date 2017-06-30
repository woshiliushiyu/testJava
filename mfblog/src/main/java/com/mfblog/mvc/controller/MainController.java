package com.mfblog.mvc.controller;

import com.google.gson.Gson;
import com.mfblog.domain.PostCustom;
import com.mfblog.domain.ResponseObj;
import com.mfblog.domain.TestNewUser;
import com.mfblog.service.newUser.NewUserServiceImpl;
import com.mfblog.service.post.PostService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Controller
@RequestMapping("/mfblog")
public class MainController {

    @Autowired
    private PostService postService;

    @Autowired
    private NewUserServiceImpl newUserService;

    @RequestMapping(value ="/index",method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    public @ResponseBody Object test(@Param("num") int num,@Param("size") int size){


        List<PostCustom> list = postService.findAllPublish(num,size);

        return new Gson().toJson(list);
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET,produces = {APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public Object createData(@Param("name") String name,@Param("address") String address,@Param("sex") String sex){

        TestNewUser testNewUser = null;
        if (name!=null&&address!=null&&sex!=null){
            testNewUser  = new TestNewUser(name,address,sex);
        }

        ResponseObj responseObj = new ResponseObj();

        try {
            if (testNewUser !=null){

                newUserService.add(testNewUser);
                responseObj.setCode(ResponseObj.OK);
                responseObj.setMsg("提交成功");
                responseObj.setData(newUserService.findAll());

            }
        } catch (Exception e){

            e.printStackTrace();
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg("提交失败");

        }

        return new Gson().toJson(responseObj);
    }

    @RequestMapping(value = "/html",method = RequestMethod.GET)
    public String createIndex(){

        return "login";
    }

}
