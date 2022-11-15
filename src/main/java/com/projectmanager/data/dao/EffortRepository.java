package com.projectmanager.data.dao;

import com.projectmanager.data.object.Effort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EffortRepository extends JpaRepository<Effort, String> {

    public List<Effort> findAllByProjectId(String projectId);

    public Effort findEffortById(String id);

    public Effort findEffortByDate(Date date);

}

