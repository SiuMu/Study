package xiumu.SchoolReserve.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xiumu.SchoolReserve.admin.dao.ManagerDao;
import xiumu.SchoolReserve.admin.domain.Manager;
import xiumu.SchoolReserve.base.service.impl.GenericTreeManagerImpl;
import xiumu.SchoolReserve.admin.service.GroupManager;

@Service("groupManager")
@Transactional
public class GroupManagerImpl extends GenericTreeManagerImpl<Manager, Long> implements GroupManager {

    ManagerDao groupDao;

    @Autowired
    public void setGroupDao(ManagerDao groupDao) {
        this.groupDao = groupDao;
        this.treeDao = this.groupDao;
        this.dao = this.treeDao;
    }

}
