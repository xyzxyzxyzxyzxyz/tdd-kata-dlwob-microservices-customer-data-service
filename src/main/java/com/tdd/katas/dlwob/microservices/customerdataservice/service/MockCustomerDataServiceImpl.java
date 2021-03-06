package com.tdd.katas.dlwob.microservices.customerdataservice.service;

import com.tdd.katas.dlwob.microservices.customerdataservice.model.CustomerData;
import org.springframework.stereotype.Service;

@Service
public class MockCustomerDataServiceImpl
        extends AbstractMockServiceImpl<CustomerData>
        implements CustomerDataService
{

    public MockCustomerDataServiceImpl() {
        super(CustomerData.class);
    }

    @Override
    public CustomerData getCustomerData(String customerId) {
        if (MockServicesConstants.SAMPLE_CUSTOMER_ID.equals(customerId)) {
            return dataObject;
        }
        else {
            return null;
        }
    }

}
