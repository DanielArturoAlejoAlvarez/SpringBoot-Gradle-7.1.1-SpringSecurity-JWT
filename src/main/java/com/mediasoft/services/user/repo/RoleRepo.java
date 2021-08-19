package com.mediasoft.services.user.repo;

import com.mediasoft.services.user.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    public Role findByName(String name);
}
