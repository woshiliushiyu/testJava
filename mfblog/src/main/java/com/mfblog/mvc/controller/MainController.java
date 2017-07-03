package com.mfblog.mvc.controller;

import com.google.gson.Gson;
import com.mfblog.domain.PostCustom;
import com.mfblog.domain.ResponseObj;
import com.mfblog.domain.TestNewUser;
import com.mfblog.service.newUser.NewUserServiceImpl;
import com.mfblog.service.post.PostService;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;
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

    /**
     * 这是文件上传的方法
     *
     * @param file
     * @return
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST,produces = {APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public Object upload(MultipartFile file) throws IOException, ServletException {


        if (!file.isEmpty())
        {
            File file1 = new File("/Users/liushiyu/Desktop/upload/", file.getOriginalFilename());

            FileUtils.copyInputStreamToFile(file.getInputStream(),file1);


            System.out.println("这是这个方法-->getname"+file.getName());
            System.out.println("这是这个方法-->getOriginalFilename"+file.getOriginalFilename());
            System.out.println("这是这个方法-->getContentType"+file.getContentType());

            ResponseObj responseObj = new ResponseObj();
            responseObj.setCode(ResponseObj.OK);
            responseObj.setMsg("提交成功,图片地址是"+file1.getPath());

            return new Gson().toJson(responseObj);
        }
        ResponseObj responseObj = new ResponseObj();
        responseObj.setCode(ResponseObj.FAILED);
        responseObj.setMsg("提交失败");

        return new Gson().toJson(responseObj);
    }

    /**
     * 这是文件下载的方法
     *
     * @param name
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/download/{name}")
    public ResponseEntity<byte[]> download(@PathVariable("name") String name) throws IOException {

        File file = new File("/Users/liushiyu/Desktop/"+name+".png");
        HttpHeaders headers = new HttpHeaders();
//        String fileName = new String(name.getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", name);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);

    }

}
