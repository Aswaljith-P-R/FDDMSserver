package com.login.login.model;

import jakarta.persistence.*;

@Entity  // Marks this class as an entity for JPA
@Table(name = "login_details")  // Specifies the table name in the database
public class Login_details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates the primary key

    @Column(name = "id")  // Maps to the 'id' column in the table
    private Long id;
    
    @Column(name = "email")
    private String email;
    @Column(name = "password")  // Maps to the 'password' column in the table
    private String password;

    @Column(name = "username")  // Maps to the 'username' column in the table
    private String username;

    // Default constructor
    public Login_details() {}

    // Getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}























/*package com.login.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Login_details {
    @Id
    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    public Login_details(){
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Login_details save(Login_details login_details) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
*/