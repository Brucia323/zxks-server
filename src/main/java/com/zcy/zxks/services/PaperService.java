package com.zcy.zxks.services;

import com.zcy.zxks.models.Paper;
import java.util.Optional;

public interface PaperService {
    Optional<Paper> getById(Long id);
}
