package com.zcy.zxks.repositories;

import com.zcy.zxks.models.Examination;
import com.zcy.zxks.models.ExaminationExtend;
import com.zcy.zxks.models.Student;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExaminationExtendRepository
    extends JpaRepository<ExaminationExtend, Long> {
    boolean existsByExamination(Examination examination);

    Optional<List<ExaminationExtend>> findByStudentAndExamination(
        Student student,
        Examination examination
    );
}
