package com.virtualBank.accounts.services;

import com.virtualBank.accounts.dto.CustomerDto;

public interface IAccountsService {


    /**
     *
     * @param customerDto - CustomerDto Object
     * @return
     */
    void createAccount(CustomerDto customerDto);


    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean indicate if the update is successfully or not
     */
    boolean updateAccount(CustomerDto customerDto);





}
