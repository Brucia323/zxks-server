package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.PaperExtend;
import com.zcy.zxks.repositories.PaperExtendRepository;
import com.zcy.zxks.services.PaperExtendService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class PaperExtendServiceImpl implements PaperExtendService {

    @Resource
    private PaperExtendRepository repository;

    @Override
    public PaperExtend create(PaperExtend paperExtend) {
        return repository.save(paperExtend);
    }
}
