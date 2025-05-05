package com.example.demoproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="first_name" )
    private String firstname;

    @Column(name ="middle_name" )
    private String middlename;

    @Column(name ="last_name" )
    private String lastname;

    @Column(name ="email_id" ,nullable=false ,unique=true)
    private String email;


}
