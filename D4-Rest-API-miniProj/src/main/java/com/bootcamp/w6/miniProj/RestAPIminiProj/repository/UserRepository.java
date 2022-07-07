package com.bootcamp.w6.miniProj.RestAPIminiProj.repository;

import com.bootcamp.w6.miniProj.RestAPIminiProj.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
