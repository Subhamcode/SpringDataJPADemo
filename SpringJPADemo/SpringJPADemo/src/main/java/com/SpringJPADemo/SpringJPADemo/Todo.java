package com.SpringJPADemo.SpringJPADemo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
            @Column(nullable = false)
    Integer id;
    @Column
    String title;
    @Column
    Boolean completed;
}
