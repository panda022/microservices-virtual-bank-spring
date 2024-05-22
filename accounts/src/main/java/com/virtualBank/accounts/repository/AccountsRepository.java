package com.virtualBank.accounts.repository;


import com.virtualBank.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    // if the method will modify the data, run the query in the transactional
    // if there is some error happens at the runtime, any partial change of data that is resulted due to the queries
    // will be rolled back because the entire transaction will be rolled back by the spring data JPA
    @Transactional
    //tell the JPA framework that the method will modify the data
    @Modifying
    void deleteByCustomerId(Long customerId);

}