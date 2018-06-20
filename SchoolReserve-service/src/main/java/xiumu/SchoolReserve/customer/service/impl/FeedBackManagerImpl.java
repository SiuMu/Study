package xiumu.SchoolReserve.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xiumu.SchoolReserve.base.service.impl.GenericManagerImpl;
import xiumu.SchoolReserve.customer.dao.FeedBackDao;
import xiumu.SchoolReserve.customer.domain.FeedBack;
import xiumu.SchoolReserve.customer.service.FeedbackManager;

@Component
public class FeedBackManagerImpl extends GenericManagerImpl<FeedBack, Long> implements FeedbackManager {

    FeedBackDao feedBackDao;

    @Override
    public List<FeedBack> findByCustomer(String customerId) {
        List<FeedBack> all = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            all.add(feedback);
        }
        return all;
    }

    @Autowired
    public void setFeedBackDao(FeedBackDao feedBackDao) {
        this.feedBackDao = feedBackDao;
        this.dao = this.feedBackDao;
    }

}
