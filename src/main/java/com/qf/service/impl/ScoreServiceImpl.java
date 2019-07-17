package com.qf.service.impl;

import com.qf.mapper.ScoreMapper;
import com.qf.pojo.Score;
import com.qf.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> getScore(int clid) {

        List<Score> scoreList = scoreMapper.getScore(clid);

        return scoreList;
    }
}
