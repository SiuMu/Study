package edu.zut.cs.javaee.dream.module.service;

import org.springframework.beans.factory.annotation.Autowired;

import xiumu.SchoolReserve.base.service.GenericManagerTestCase;
import xiumu.SchoolReserve.customer.domain.Customer;
import xiumu.SchoolReserve.customer.service.CustomerManager;

public class ModuleManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

    @Autowired
    ModuleManager moduleManager;

    public ModuleManagerTest() {
        super(Customer.class);
    }

}
