package com.mailsondias.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mailsondias.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
