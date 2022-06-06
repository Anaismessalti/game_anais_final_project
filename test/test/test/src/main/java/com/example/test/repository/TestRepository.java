package com.example.test.repository;

import com.example.test.models.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestModel, Integer> {
}
