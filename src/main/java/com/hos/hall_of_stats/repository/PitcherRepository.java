package com.hos.hall_of_stats.repository;

import com.hos.hall_of_stats.entity.Pitcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PitcherRepository extends JpaRepository<Pitcher, String> {

    @Query("SELECT p FROM Pitcher p WHERE p.playerName = :name")
    Pitcher findByName(@Param("name") String name);
}
