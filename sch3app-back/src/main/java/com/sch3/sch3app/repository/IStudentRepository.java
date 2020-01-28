package com.sch3.sch3app.repository;

import com.sch3.sch3app.entity.Sch302StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Sch302StudentEntity, Long> {
}
