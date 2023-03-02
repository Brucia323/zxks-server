package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Examination;
import com.zcy.zxks.models.Group;
import com.zcy.zxks.repositories.ExaminationRepository;
import com.zcy.zxks.services.ExaminationService;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ExaminationServiceImpl implements ExaminationService {

    @Resource
    private ExaminationRepository repository;

    @Override
    public Optional<Examination> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<List<Examination>> getByGroup(Group group) {
        return repository.findByGroup(group);
    }
}
