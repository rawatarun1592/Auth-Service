package com.rawaru.userService.repository;

import com.rawaru.userService.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

    Session save(Session session);

}
