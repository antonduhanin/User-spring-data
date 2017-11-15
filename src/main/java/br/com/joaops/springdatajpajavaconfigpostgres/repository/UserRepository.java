package br.com.joaops.springdatajpajavaconfigpostgres.repository;

import br.com.joaops.springdatajpajavaconfigpostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ANTON on 12.11.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
