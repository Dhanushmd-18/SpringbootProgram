package com.example.ProgramSQL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;  
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="student")
public class Studententity {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
    
   @OneToOne
   @JoinColumn(name="register_id")
   private RequestNumberEntity registerNumberEntity;
   
   @Column(name="name")
   private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public RequestNumberEntity getRequestNumberEntity() {
        return registerNumberEntity;
    }
    public void setRequestNumberEntity(RequestNumberEntity registerNumberEntity) {
        this.registerNumberEntity = registerNumberEntity;
    }

}
