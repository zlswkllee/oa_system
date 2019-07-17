package com.qf.service;

import com.qf.pojo.Score;

import java.util.List;

public interface ScoreService {

    public List<Score> getScore(int clid);
}
