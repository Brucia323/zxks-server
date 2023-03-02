package com.zcy.zxks.repositories;

import com.zcy.zxks.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository
    extends JpaRepository<Organization, Long> {}
