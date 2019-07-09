package com.micda.g2.searchengine.rest.Imp;

import com.google.common.base.Preconditions;
import com.micda.g2.searchengine.exception.ResourceNotFoundException;
import com.micda.g2.searchengine.model.Employee;
import com.micda.g2.searchengine.service.imp.MailServiceImpl;
import com.micda.g2.searchengine.service.imp.ProfessorServiceImp;
import com.micda.g2.searchengine.util.RestPreconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public class NotificatonApiImp {

    @Autowired
    MailServiceImpl mailService;

    @Autowired
    ProfessorServiceImp professorServiceImp;


    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @PutMapping("/notify/{id}")
    public void sendNotification(@PathVariable("id") int id) {

        try {
            RestPreconditions.checkFound(professorServiceImp.getProfessor(id));
            mailService.sendEmail(id);
        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
    }








}
