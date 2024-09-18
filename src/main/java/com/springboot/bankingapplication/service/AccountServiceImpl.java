package com.springboot.bankingapplication.service;

import java.lang.StackWalker.Option;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bankingapplication.entity.Account;
import com.springboot.bankingapplication.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService  {
	
	@Autowired
	AccountRepository repo;
	
	@Override
	public Account createAccount(Account account) {
		Account account_saved = repo.save(account);
		return account_saved;
	}
	
	@Override
	public Account getAccountDeatilsByAccountNumber(Long accountNumber) {

	Optional<Account> account = repo.findById(accountNumber);
	if(account.isEmpty()) {
		throw new RuntimeException("Account is not present");
	}
		Account account_found = account.get();
		return account_found;
	}

	@Override
	public List<Account> getAllAccountDeatils() {
	 List <Account>listOfAccounts	= repo.findAll();
		return listOfAccounts;
	}

	@Override
	public Account depositAmount(Long accountNumber, Double amount) {
		Optional<Account> account = repo.findById(accountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account is not present");
		}
		Account accountPresent=account.get();
		Double totalBalance= accountPresent.getAccount_balance()+amount;
		accountPresent.setAccount_balance(totalBalance);
		repo.save(accountPresent);
		
		return accountPresent;
		
	
	}

	@Override
	public Account withdrwaAmount(Long accountNumber, Double amount) {
		 Optional<Account> account = repo.findById(accountNumber);
		 if(account.isEmpty()) {
			 throw new RuntimeException("Account is not present");
			 
		 }
		 Account accountPresent = account.get(); // logic to withdraw the money
		Double accountBalance =   accountPresent.getAccount_balance()-amount;
		accountPresent.setAccount_balance(accountBalance);
		repo.save(accountPresent);
		return accountPresent;
	}

	@Override
	public void closeAccount(Long accountNumber) {
		getAccountDeatilsByAccountNumber(accountNumber);
		repo.deleteById(accountNumber);
		
	}

}
