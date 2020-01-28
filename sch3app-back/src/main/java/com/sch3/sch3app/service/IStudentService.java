package com.sch3.sch3app.service;

import com.sch3.sch3app.entity.Sch302StudentEntity;

import java.util.List;

public interface IStudentService {
    List<Sch302StudentEntity> getAll();

    Sch302StudentEntity get(long id);

    void save(Sch302StudentEntity studentEntity);

    void delete(long id);
}
