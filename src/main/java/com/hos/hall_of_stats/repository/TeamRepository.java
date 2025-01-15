package com.hos.hall_of_stats.repository;

import com.hos.hall_of_stats.entity.Pitcher;
import com.hos.hall_of_stats.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {


    @Query("SELECT t FROM Team t WHERE t.teamName = :name")
    List<Team> findByName(@Param("name") String name);

}
