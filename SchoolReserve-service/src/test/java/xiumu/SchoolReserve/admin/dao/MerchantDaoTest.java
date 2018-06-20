package xiumu.SchoolReserve.admin.dao;

import xiumu.SchoolReserve.admin.domain.Merchant;
import xiumu.SchoolReserve.base.dao.GenericTreeDaoTestCase;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MerchantDaoTest extends GenericTreeDaoTestCase<Long, Merchant, MerchantDao> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MerchantDaoTest.class);

	MerchantDao merchantDao;

	@Autowired
	public void setGroupDao(MerchantDao merchantDao) {
		this.merchantDao = merchantDao;
		this.dao = this.merchantDao;
	}

	@Test
	public void testGetRoot() {
		int root_size = 10;
		for (int i = 0; i < root_size; i++) {
			Merchant merchant = new Merchant();
			merchant.setName("merchant_" + i);
			for (int j = 0; j < 10; j++) {
				Merchant g = new Merchant();
				g.setName("merchant_" + i + "_" + j);
				g.setParent(merchant);
			}
			this.merchantDao.save(merchant);
		}

		List<Merchant> roots = this.merchantDao.getRoot();
		assertEquals(root_size, roots.size());

		if (logger.isInfoEnabled()) {
			logger.info("testGetRoot() - List<Merchant> roots=" + roots); //$NON-NLS-1$
		}
	}

}
