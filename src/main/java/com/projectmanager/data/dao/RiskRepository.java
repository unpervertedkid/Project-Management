package com.projectmanager.data.dao;

import com.projectmanager.data.object.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiskRepository extends JpaRepository<Risk, String> {

    public List<Risk> findAllByProjectId(String projectId);

    public Risk findRiskById(String id);

}
