package com.zcy.zxks.services;

import com.zcy.zxks.models.Question;
import java.util.Optional;

public interface QuestionService {
    Optional<Question> getById(Long id);
}
