package com.micda.g2.searchengine.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import com.micda.g2.searchengine.model.Department;

@RequestMapping("/department")
public interface IDepartmentApi extends IEntityApi<Department> {

}
