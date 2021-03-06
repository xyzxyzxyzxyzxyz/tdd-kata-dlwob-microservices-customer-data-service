package com.tdd.katas.dlwob.microservices.customerdataservice.service;

import com.tdd.katas.dlwob.microservices.customerdataservice.model.CustomerData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MockCustomerDataServiceImplTest {

    @Test
    public void Contains_sample_data() {
        CustomerDataService mockCustomerDataService = new MockCustomerDataServiceImpl();

        CustomerData actualCustomerData = mockCustomerDataService.getCustomerData(MockServicesConstants.SAMPLE_CUSTOMER_ID);

        assertNotNull(actualCustomerData);
        assertEquals(MockServicesConstants.SAMPLE_CUSTOMER_ID, actualCustomerData.getId());
        assertEquals("Sergio", actualCustomerData.getName());
        assertEquals("Osuna Medina", actualCustomerData.getSurnames());
    }

}
