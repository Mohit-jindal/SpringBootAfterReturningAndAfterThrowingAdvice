package com.infotech.app.service.impl;

import org.springframework.stereotype.Service;

import com.infotech.app.aop.aspect.Auditable;
import com.infotech.app.aop.aspect.Auditable.AuditDestination;
import com.infotech.app.model.Account;
import com.infotech.app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Auditable(AuditDestination.FILE_SYSTEM)
	@Override
	public void updateAccountBalance(Account account, Long amount) 
	{
		System.out.println("Account No:" + account.getAccountNumber()+", Amount:"+amount);
	}

}
