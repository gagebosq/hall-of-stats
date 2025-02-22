package com.hos.hall_of_stats.repository;

import com.hos.hall_of_stats.entity.Hitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HitterRepository extends JpaRepository<Hitter, String> {

    @Query("SELECT h FROM Hitter h WHERE h.playerName = :name")
    Hitter findByName(@Param("name") String name);
}
