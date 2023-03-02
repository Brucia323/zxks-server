package com.zcy.zxks.services;

import com.zcy.zxks.models.Group;
import java.util.Optional;

public interface GroupService {
    Optional<Group> getById(Long id);
}
