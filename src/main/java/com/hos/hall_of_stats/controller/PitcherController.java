package com.hos.hall_of_stats.controller;
import com.hos.hall_of_stats.entity.Pitcher;
import com.hos.hall_of_stats.service.PitcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pitchers")
public class PitcherController {

    @Autowired
    private PitcherService pitcherService;

    @GetMapping
    public List<Pitcher> getAllPitchers() {
        return pitcherService.getAllPitchers();
    }

    @PostMapping
    public Pitcher createPitcher(@RequestBody Pitcher pitcher) {
        return pitcherService.savePitcher(pitcher);
    }
}