package com.atcdu.liujun.service;

import com.atcdu.liujun.bean.Teacher;
import com.atcdu.liujun.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TeacherDao teacherDao;
    public Teacher getTeacherById(Integer id){
        return teacherDao.getTeacherById(id);
    }
}
