package com.example.springbootvue.mapper;

import com.example.springbootvue.pojo.Hero;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HeroMapper {

  public int add(Hero hero);

  public void delete(int id);

  public Hero get(int id);

  public int update(Hero hero);

  public List<Hero> list();
}
