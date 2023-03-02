package com.zcy.zxks.services;

import com.zcy.zxks.models.Teacher;
import java.util.Optional;

public interface TeacherService {
    Optional<Teacher> getById(Long id);
}
