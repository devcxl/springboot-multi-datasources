package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author devcxl
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false,length = 300)
    private String name;
}
