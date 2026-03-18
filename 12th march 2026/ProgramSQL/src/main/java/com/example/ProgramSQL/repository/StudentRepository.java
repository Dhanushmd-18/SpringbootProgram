package com.example.ProgramSQL.repository;
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.ProgramSQL.entity.Studententity;     

public interface StudentRepository extends JpaRepository<Studententity, Long> {
    
}
