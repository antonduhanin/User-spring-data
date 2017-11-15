/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.springdatajpajavaconfigpostgres;


import br.com.joaops.springdatajpajavaconfigpostgres.model.User;
import br.com.joaops.springdatajpajavaconfigpostgres.service.UserService;
import br.com.joaops.springdatajpajavaconfigpostgres.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author João
 */
public class Application {
    
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(br.com.joaops.springdatajpajavaconfigpostgres.configuration.DataConfiguration.class)) {
            UserServiceImpl service = context.getBean(UserServiceImpl.class);
            List<User> users = service.getAll();
            for (User u : users) {
                System.out.println(u.toString());
            }
        }
    }
    
}