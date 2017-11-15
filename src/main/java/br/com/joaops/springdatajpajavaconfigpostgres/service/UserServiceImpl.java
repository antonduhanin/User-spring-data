package br.com.joaops.springdatajpajavaconfigpostgres.service;

import br.com.joaops.springdatajpajavaconfigpostgres.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.joaops.springdatajpajavaconfigpostgres.repository.UserRepository;

import java.util.List;

/**
 * Created by ANTON on 12.11.2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
      return userRepository.saveAndFlush(user);
    }

    public List<User> getAll() {
        return  userRepository.findAll();
    }
}
