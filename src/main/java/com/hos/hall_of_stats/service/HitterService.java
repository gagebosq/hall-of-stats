package com.hos.hall_of_stats.service;

import com.hos.hall_of_stats.entity.Hitter;
import com.hos.hall_of_stats.entity.Pitcher;
import com.hos.hall_of_stats.repository.HitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HitterService {

    @Autowired
    private HitterRepository hitterRepository;

    public List<Hitter> getAllHitters() {
        return hitterRepository.findAll();
    }

    public Hitter saveHitter(Hitter hitter) {
        return hitterRepository.save(hitter);
    }

    public Hitter getHitterByName(String name) {
        return hitterRepository.findByName(name);
    }
}
