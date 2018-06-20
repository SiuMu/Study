package xiumu.SchoolReserve.customer.service;

import java.util.List;

import xiumu.SchoolReserve.base.service.GenericManager;
import xiumu.SchoolReserve.customer.domain.Customer;

public interface CustomerManager extends GenericManager<Customer, Long> {

    /**
     * 
     * @param fullname
     * @return
     */
	List<Customer> findByFullname(String fullname);

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<Customer> findByPostcode(String postcode);
}
