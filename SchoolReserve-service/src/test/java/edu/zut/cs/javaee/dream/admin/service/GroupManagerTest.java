package edu.zut.cs.javaee.dream.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import xiumu.SchoolReserve.admin.domain.Group;
import xiumu.SchoolReserve.base.service.GenericTreeManagerTestCase;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

    GroupManager groupManager;

    public GroupManagerTest() {
        super(Group.class);
    }

    @Autowired
    public void setGroupManager(GroupManager groupManager) {
        this.groupManager = groupManager;
        this.manager = this.groupManager;
    }

}
