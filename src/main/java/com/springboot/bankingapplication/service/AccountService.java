package com.springboot.bankingapplication.service;

import java.util.List;

import com.springboot.bankingapplication.entity.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	public Account getAccountDeatilsByAccountNumber(Long accountNumber);
	public List<Account> getAllAccountDeatils();
	public Account depositAmount(Long accountNumber,Double amount);
	public Account withdrwaAmount(Long accountNumber,Double amount);
	public void closeAccount(Long accountNumber);
	

}
