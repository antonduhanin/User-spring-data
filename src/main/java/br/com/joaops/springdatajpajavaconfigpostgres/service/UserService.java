package br.com.joaops.springdatajpajavaconfigpostgres.service;

import br.com.joaops.springdatajpajavaconfigpostgres.model.User;

import java.util.List;

/**
 * Created by ANTON on 12.11.2017.
 */
public interface UserService {

    User addUser (User user);
    List<User> getAll();
}
