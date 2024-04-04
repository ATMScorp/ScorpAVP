package com.terentii.ScorpAHDSpring.repository;

import com.terentii.ScorpAHDSpring.model.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
