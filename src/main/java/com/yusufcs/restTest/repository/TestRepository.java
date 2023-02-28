package com.yusufcs.restTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yusufcs.restTest.model.TestModel;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Long> {

}
