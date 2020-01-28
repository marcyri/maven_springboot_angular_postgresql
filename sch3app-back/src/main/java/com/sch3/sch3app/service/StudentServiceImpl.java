package com.sch3.sch3app.service;

import com.sch3.sch3app.entity.Sch302StudentEntity;
import com.sch3.sch3app.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository sRepo;

    @Override
    public List<Sch302StudentEntity> getAll() {
        return sRepo.findAll();
    }

    @Override
    public Sch302StudentEntity get(long id) {
        return sRepo.findById(id).get();
    }

    @Override
    public void save(Sch302StudentEntity studentEntity) {
        sRepo.save(studentEntity);
    }

    @Override
    public void delete(long id) {
        sRepo.deleteById(id);
    }
}
