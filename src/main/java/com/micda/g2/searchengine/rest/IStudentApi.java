package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micda.g2.searchengine.model.Student;

@RestController
@RequestMapping("/student")
public interface IStudentApi extends IEntityApi<Student>{

}
