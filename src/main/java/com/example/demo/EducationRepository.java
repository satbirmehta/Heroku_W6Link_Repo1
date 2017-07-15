package com.example.demo;



import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 6/30/17.
 */
public interface EducationRepository extends CrudRepository<Education,Long> {

    public List<Education> findAllBySchoolName(String schoolName);

    public List<Education> findAllByUserId(long userId);

    public List<Education> findTop10ByUserIdOrderByIdDesc(long userId);

}