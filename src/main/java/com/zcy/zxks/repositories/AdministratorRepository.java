package com.zcy.zxks.repositories;

import com.zcy.zxks.models.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository
    extends JpaRepository<Administrator, Long> {}
