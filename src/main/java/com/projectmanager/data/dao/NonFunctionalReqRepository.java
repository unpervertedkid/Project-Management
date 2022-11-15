package com.projectmanager.data.dao;

import com.projectmanager.data.object.NonFunctionalRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NonFunctionalReqRepository extends JpaRepository<NonFunctionalRequirement, String> {

    public List<NonFunctionalRequirement> findAllByProjectId(String projectId);

    public NonFunctionalRequirement findNonFunctionalRequirementById(String id);

}
