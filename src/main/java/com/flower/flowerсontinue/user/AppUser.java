package com.flower.flowerсontinue.user;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
@Entity
@Table(name = "app_userss")
public class AppUser {
    @Column(nullable = false, unique = true)
    String email;

    @Transient
    int age;

    LocalDate dob;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public AppUser(String email, int age, LocalDate dob) {
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
}