package com.example.jpademo.repository;

import com.example.jpademo.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer> {

    Emp findById(Integer id);


}
