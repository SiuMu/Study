package xiumu.SchoolReserve.module.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xiumu.SchoolReserve.base.service.impl.GenericTreeManagerImpl;
import xiumu.SchoolReserve.module.dao.ModuleDao;
import xiumu.SchoolReserve.module.domain.Module;
import xiumu.SchoolReserve.module.service.ModuleManager;

@Component
public class ModuleManagerImpl extends GenericTreeManagerImpl<Module, Long> implements ModuleManager {

    ModuleDao moduleDao;

    @Autowired
    public void setModuleDao(ModuleDao moduleDao) {
        this.moduleDao = moduleDao;
        this.dao = this.moduleDao;
        this.treeDao = this.moduleDao;
    }

}
