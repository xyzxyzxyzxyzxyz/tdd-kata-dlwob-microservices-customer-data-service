package com.tdd.katas.dlwob.microservices.customerdataservice.service;

import com.tdd.katas.dlwob.microservices.customerdataservice.model.CustomerData;

public interface CustomerDataService {
    CustomerData getCustomerData(String customerId);
}
