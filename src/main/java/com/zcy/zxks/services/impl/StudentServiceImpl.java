package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Student;
import com.zcy.zxks.repositories.StudentRepository;
import com.zcy.zxks.services.StudentService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository repository;

    @Override
    public Optional<Student> getById(Long id) {
        return repository.findById(id);
    }
}
