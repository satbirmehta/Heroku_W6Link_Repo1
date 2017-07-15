package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/30/17.
 */
public interface SkillRepository extends CrudRepository<Skill,Long> {

    public List<Skill> findAllBySkillName(String skillName);

    public List<Skill> findAllByUserId(long userId);

    public List<Skill> findTop4ByUserIdAndSkillNameOrderByPostingIdDesc(long userId, String skillName);
    public List<Skill> findAllByUserIdAndSkillNameOrderByPostingIdDesc(long userId, String skillName);

    public List<Skill> findTop20ByUserIdOrderByIdDesc(long userId);

}