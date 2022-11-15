package com.projectmanager.data.dao;

import com.projectmanager.data.object.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

    public Project findByName(String name);

    public Project findProjectById(String id);




}
