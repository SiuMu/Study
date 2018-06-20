package xiumu.SchoolReserve.admin.service.impl;

import org.springframework.stereotype.Component;

import xiumu.SchoolReserve.admin.domain.Role;
import xiumu.SchoolReserve.base.service.impl.GenericManagerImpl;
import xiumu.SchoolReserve.admin.service.RoleManager;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}
