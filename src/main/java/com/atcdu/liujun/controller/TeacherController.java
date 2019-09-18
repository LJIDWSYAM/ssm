package com.atcdu.liujun.controller;

import com.atcdu.liujun.bean.Teacher;
import com.atcdu.liujun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TeacherController {
    @Autowired
    TestService testService;
    @RequestMapping("/getTeacher")
    public Teacher getTeacher(@RequestParam(value = "id",defaultValue = "1") Integer id){
        return testService.getTeacherById(id);
    }
}
