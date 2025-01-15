package com.hos.hall_of_stats.service;

import com.hos.hall_of_stats.entity.Hitter;
import com.hos.hall_of_stats.entity.Pitcher;
import com.hos.hall_of_stats.repository.HitterRepository;
import com.hos.hall_of_stats.repository.PitcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PitcherService {
    @Autowired
    private PitcherRepository pitcherRepository;

    public List<Pitcher> getAllPitchers() {
        return pitcherRepository.findAll();
    }

    public Pitcher savePitcher(Pitcher pitcher) {
        return pitcherRepository.save(pitcher);
    }
}
