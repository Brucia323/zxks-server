package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Question;
import com.zcy.zxks.repositories.QuestionRepository;
import com.zcy.zxks.services.QuestionService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private QuestionRepository repository;

    @Override
    public Optional<Question> getById(Long id) {
        return repository.findById(id);
    }
}
