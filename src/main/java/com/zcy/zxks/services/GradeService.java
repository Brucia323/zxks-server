package com.zcy.zxks.services;

import com.zcy.zxks.models.Examination;
import org.springframework.scheduling.annotation.Async;

public interface GradeService {
    @Async
    void calculate(Examination examination);
}
