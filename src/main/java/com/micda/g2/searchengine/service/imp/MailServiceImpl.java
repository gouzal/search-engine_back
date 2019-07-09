package com.micda.g2.searchengine.service.imp;

import com.micda.g2.searchengine.model.Professor;
import com.micda.g2.searchengine.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public class MailServiceImpl implements IMailService {


    @Autowired
    public ProfessorServiceImp professorServiceImp;

    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }



    public void sendEmail(int profID) throws MailException {

        /*
         * This JavaMailSender Interface is used to send Mail in Spring Boot. This
         * JavaMailSender extends the MailSender Interface which contains send()
         * function. SimpleMailMessage Object is required because send() function uses
         * object of SimpleMailMessage as a Parameter
         */

        Professor prof = professorServiceImp.getProfessor(profID);

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(prof.getEmail());
        mail.setSubject("New Publication");
        mail.setText("Hurray ! There is a New Publication");

        /*
         * This send() contains an Object of SimpleMailMessage as an Parameter
         */
        javaMailSender.send(mail);
    }
}
