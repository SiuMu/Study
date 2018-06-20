package xiumu.SchoolReserve.customer.service;

import java.util.List;

import xiumu.SchoolReserve.base.service.GenericManager;
import xiumu.SchoolReserve.customer.domain.FeedBack;

public interface FeedbackManager extends GenericManager<FeedBack, Long> {


    List<FeedBack> findByCustomer(String customerId);
}
