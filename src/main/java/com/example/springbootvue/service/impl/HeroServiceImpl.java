package com.example.springbootvue.service.impl;

import com.example.springbootvue.mapper.HeroMapper;
import com.example.springbootvue.pojo.Hero;
import com.example.springbootvue.service.HeroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("heroService")
public class HeroServiceImpl implements HeroService {

  @Autowired
  private HeroMapper heroMapper;

  @Override
  public int add(Hero hero) {
    return heroMapper.add(hero);
  }

  @Override
  public void delete(int id) {
    heroMapper.delete(id);
  }

  @Override
  public Hero get(int id) {
    return heroMapper.get(id);
  }

  @Override
  public int update(Hero hero) {
    return heroMapper.update(hero);
  }

  @Override
  public List<Hero> list() {
    return heroMapper.list();
  }
}
