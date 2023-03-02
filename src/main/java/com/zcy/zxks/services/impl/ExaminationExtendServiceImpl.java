package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Examination;
import com.zcy.zxks.models.ExaminationExtend;
import com.zcy.zxks.models.Student;
import com.zcy.zxks.repositories.ExaminationExtendRepository;
import com.zcy.zxks.services.ExaminationExtendService;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ExaminationExtendServiceImpl implements ExaminationExtendService {

    @Resource
    private ExaminationExtendRepository repository;

    @Override
    public boolean isExamined(Examination examination) {
        return repository.existsByExamination(examination);
    }

    @Override
    public Optional<List<ExaminationExtend>> getByStudentAndExamination(
        Student student,
        Examination examination
    ) {
        return repository.findByStudentAndExamination(student, examination);
    }
}
