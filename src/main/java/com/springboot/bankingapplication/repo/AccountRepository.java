package com.springboot.bankingapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bankingapplication.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
