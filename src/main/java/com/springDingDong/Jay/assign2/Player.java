package com.springDingDong.Jay.assign2;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String team;

    private String Position;

    private Long Salary;

}