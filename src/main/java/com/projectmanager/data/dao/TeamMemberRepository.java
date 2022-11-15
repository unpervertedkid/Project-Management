package com.projectmanager.data.dao;

import com.projectmanager.data.object.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMember, String> {

    public List<TeamMember> findAllByProjectId(String projectId);

    public TeamMember findTeamMemberById(String teamMemberId);

}

