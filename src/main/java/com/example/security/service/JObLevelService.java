package com.example.security.service;

import com.example.security.mapper.JObLevelMapper;
import com.example.security.model.JObLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class JObLevelService {
    @Resource
    JObLevelMapper jObLevelMapper;

    public List<JObLevel> getAllJObLevel() {
        return jObLevelMapper.selectAllJobLevel();
    }

    public Integer addJObLevel(JObLevel jObLevel) {
        jObLevel.setEnabled(true);
        jObLevel.setCreateDate(new Date());
        return jObLevelMapper.insertSelective(jObLevel);
    }

    public Integer updateJObLevel(JObLevel jObLevel) {
        return jObLevelMapper.updateByPrimaryKeySelective(jObLevel);
    }

    public Integer deleteJObLevel(Integer id) {
        return jObLevelMapper.deleteByPrimaryKey(id);
    }
    public Integer deleteJObLevel(Integer[] ids) {
        return jObLevelMapper.deleteByIds(ids);
    }
}