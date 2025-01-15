package com.hos.hall_of_stats.repository;

import com.hos.hall_of_stats.entity.Pitcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PitcherRepository extends JpaRepository<Pitcher, String> {
}
