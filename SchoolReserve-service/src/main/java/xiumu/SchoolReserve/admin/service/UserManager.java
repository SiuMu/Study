package xiumu.SchoolReserve.admin.service;

import java.util.List;

import xiumu.SchoolReserve.admin.domain.User;
import xiumu.SchoolReserve.base.service.GenericManager;

public interface UserManager extends GenericManager<User, Long> {

    List<User> findAll();

    User findbyUsername(String username);
}
