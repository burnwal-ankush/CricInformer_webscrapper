package com.webscrapper.cricinformer.services;

import com.webscrapper.cricinformer.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getCWC2023PointTable();
}
