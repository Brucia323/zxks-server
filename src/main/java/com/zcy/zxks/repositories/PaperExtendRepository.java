package com.zcy.zxks.repositories;

import com.zcy.zxks.models.PaperExtend;
import com.zcy.zxks.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperExtendRepository
    extends JpaRepository<PaperExtend, Long> {
    void deleteByQuestion(Question question);
}
