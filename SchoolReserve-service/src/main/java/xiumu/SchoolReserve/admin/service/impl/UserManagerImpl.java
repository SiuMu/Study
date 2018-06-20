package xiumu.SchoolReserve.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xiumu.SchoolReserve.admin.dao.UserDao;
import xiumu.SchoolReserve.admin.domain.User;
import xiumu.SchoolReserve.base.service.impl.GenericManagerImpl;
import xiumu.SchoolReserve.admin.service.UserManager;

@Component
@Transactional
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager {

    UserDao userDao;

    @Override
    public User findbyUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        this.dao = this.userDao;
    }

}
