package com.webscrapper.cricinformer.controllers;

import com.webscrapper.cricinformer.entities.Match;
import com.webscrapper.cricinformer.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/pointsTable")
    ResponseEntity<?> getTC20232025PointTable()
    {
        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(), HttpStatus.OK);
    }


}
