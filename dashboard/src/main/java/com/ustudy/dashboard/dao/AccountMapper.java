package com.ustudy.dashboard.dao;

import java.util.List;

import com.ustudy.dashboard.model.Account;

public interface AccountMapper {
	
	int insert(Account record);

	int deleteAccountById(Long id);

	Account getAccountById(Long id);

	int update(Account record);

	List<Account> findAccount(Account record);

}