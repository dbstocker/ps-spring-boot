package com.coffeemetalcode.conferencedemo.repositories;

import com.coffeemetalcode.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
