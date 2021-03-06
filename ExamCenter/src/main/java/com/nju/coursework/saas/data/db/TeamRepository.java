package com.nju.coursework.saas.data.db;

import com.nju.coursework.saas.data.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    @Query("select t from Team t where t.userByUserId.id=?1")
    List<Team> findByTeacher(int userId);
}

