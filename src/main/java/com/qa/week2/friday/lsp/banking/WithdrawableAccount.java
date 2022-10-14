package com.qa.week2.friday.lsp.banking;

public interface WithdrawableAccount extends Account {

	void withdraw(double amount);

}