package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Teacher;
import com.zcy.zxks.repositories.TeacherRepository;
import com.zcy.zxks.services.TeacherService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherRepository repository;

    @Override
    public Optional<Teacher> getById(Long id) {
        return repository.findById(id);
    }
}
