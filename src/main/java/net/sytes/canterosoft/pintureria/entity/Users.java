package net.sytes.canterosoft.pintureria.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_users")
@Data
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_users;
    @Column(name = "username")
    private String user;
    private String name;
    private String last_name;
    private String phone;
    private String email;
    @Column(name = "password")
    private String pass;
    private String status;
    private String level;
}
