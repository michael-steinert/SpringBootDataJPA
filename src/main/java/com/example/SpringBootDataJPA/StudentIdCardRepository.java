package com.example.SpringBootDataJPA;

import org.springframework.data.repository.CrudRepository;

public interface StudentIdCardRepository extends CrudRepository<StudentIdCard, Long> {
}
