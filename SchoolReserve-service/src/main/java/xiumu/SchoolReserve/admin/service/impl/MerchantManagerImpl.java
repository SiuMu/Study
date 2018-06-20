package xiumu.SchoolReserve.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xiumu.SchoolReserve.admin.dao.MerchantDao;
import xiumu.SchoolReserve.admin.domain.Merchant;
import xiumu.SchoolReserve.base.service.impl.GenericTreeManagerImpl;
import xiumu.SchoolReserve.admin.service.MerchantManager;

@Service("groupManager")
@Transactional
public class MerchantManagerImpl extends GenericTreeManagerImpl<Merchant, Long> implements MerchantManager {

    MerchantDao merchantDao;

    @Autowired
    public void setGroupDao(MerchantDao merchantDao) {
        this.merchantDao = merchantDao;
        this.treeDao = this.merchantDao;
        this.dao = this.treeDao;
    }

}
