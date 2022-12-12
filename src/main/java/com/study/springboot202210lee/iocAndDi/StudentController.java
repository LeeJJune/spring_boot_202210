package com.study.springboot202210lee.iocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController{

    @Autowired
    private StudentService studentService;
    @Autowired
    private Test1 t1;
    @Autowired
    private Test2 t2;

    @ResponseBody
    @GetMapping("/student")
    public String printStudent(){
        Student student = Student.builder()
                .studentId(2001)
                .studentName("Kim")
                .build();

        studentService.printStudentInfo(student);

        t1.print();
        t2.print();
        return null;
    }
}
