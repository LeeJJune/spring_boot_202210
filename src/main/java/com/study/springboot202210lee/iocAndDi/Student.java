package com.study.springboot202210lee.iocAndDi;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Builder
@Data

public class Student {
    private int studentId;
    private String studentName;

}