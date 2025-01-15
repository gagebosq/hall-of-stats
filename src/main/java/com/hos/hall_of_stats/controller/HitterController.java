package com.hos.hall_of_stats.controller;

import com.hos.hall_of_stats.entity.Hitter;
import com.hos.hall_of_stats.service.HitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/hitters")
    public class HitterController {

        @Autowired
        private HitterService hitterService;

        @GetMapping
        public List<Hitter> getAllHitters() {
            return hitterService.getAllHitters();
        }

        @GetMapping("/{name}")
        public ResponseEntity<Hitter> getHitterByName(@PathVariable String name) {
        return ResponseEntity.ok(hitterService.getHitterByName(name));
    }

        @PostMapping
        public Hitter createHitter(@RequestBody Hitter hitter) {
            return hitterService.saveHitter(hitter);
        }
}
