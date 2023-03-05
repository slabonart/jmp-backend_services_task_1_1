package pl.slabonart.backend_services.task_1.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
@Builder
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String sureName;

    private Date birthDate;
}
