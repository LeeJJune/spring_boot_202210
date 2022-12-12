package com.study.springboot202210lee.iocAndDi;

import org.springframework.stereotype.Component;

@Component

public class StudentServiceImp implements StudentService{

    @Override
    public void printStudentInfo(Student student){
        System.out.println("학번: "+student.getStudentId());
        System.out.println("이름: "+student.getStudentName());
    }
}
