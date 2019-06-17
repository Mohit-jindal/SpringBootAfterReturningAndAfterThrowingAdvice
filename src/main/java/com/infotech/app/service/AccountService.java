package com.infotech.app.service;

import com.infotech.app.model.Account;

public interface AccountService {

	public abstract void updateAccountBalance(Account account, Long amount);
}
