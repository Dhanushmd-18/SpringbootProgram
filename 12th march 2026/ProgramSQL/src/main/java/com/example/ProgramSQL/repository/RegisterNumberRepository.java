package com.example.ProgramSQL.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProgramSQL.entity.RequestNumberEntity;

public interface RegisterNumberRepository extends JpaRepository<RequestNumberEntity, Long> {
    
}
