package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.login.login.model.Login_details;

@Repository  // Marks this as a Spring Data repository
public interface loginrepo extends JpaRepository<Login_details, Long> {
    // Inherits methods like save(), findById(), findAll() from JpaRepository
}













/*package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.login.model.Login_details;


@Repository
public interface loginrepo extends JpaRepository<Login_details,String> {

}*/



