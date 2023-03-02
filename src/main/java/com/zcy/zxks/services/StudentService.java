package com.zcy.zxks.services;

import com.zcy.zxks.models.Student;
import java.util.Optional;

public interface StudentService {
    Optional<Student> getById(Long id);
}
