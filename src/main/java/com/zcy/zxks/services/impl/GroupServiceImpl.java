package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Group;
import com.zcy.zxks.repositories.GroupRepository;
import com.zcy.zxks.services.GroupService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

    @Resource
    private GroupRepository repository;

    @Override
    public Optional<Group> getById(Long id) {
        return repository.findById(id);
    }
}
