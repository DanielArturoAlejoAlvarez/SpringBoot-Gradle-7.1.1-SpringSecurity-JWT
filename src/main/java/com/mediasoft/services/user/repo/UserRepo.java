package com.mediasoft.services.user.repo;

import com.mediasoft.services.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
