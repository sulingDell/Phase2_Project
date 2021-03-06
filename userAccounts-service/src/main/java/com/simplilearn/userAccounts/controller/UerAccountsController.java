package com.simplilearn.userAccounts.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.userAccounts.entity.UserAccount;
import com.simplilearn.userAccounts.exception.UserAccountAlreadyExist;
import com.simplilearn.userAccounts.exception.UserAccountNotFound;

@RestController
public class UerAccountsController {

	List<UserAccount> accounts = new ArrayList<UserAccount>();

	// get one account by id
	@GetMapping("/account/{id}")
	public UserAccount getOne(@PathVariable(value = "id") int id) {
		for (UserAccount account : accounts) {
			if (account.getId() == id) {
				return account;
			}
		}
		throw new UserAccountNotFound("account is not found with given id "+id);
	}

	// get one account by name
	@GetMapping("/account")
	public UserAccount getOne(@RequestParam(value = "name") String name) {
		for (UserAccount account : accounts) {
			if (account.getFirstName().equals(name)) {
				return account;
			}
		}
		throw new UserAccountNotFound("account is not found with given name "+name);
	}

	// get one account by name
	@GetMapping("/account/search")
	public UserAccount searchOne(@RequestParam(value = "name") String name) {
		for (UserAccount account : accounts) {
			if (account.getFirstName().contains(name)) {
				return account;
			}
		}
		throw new UserAccountNotFound("account is not found with given name "+name);
	}

	// get all accounts
	@GetMapping("/accounts")
	public List<UserAccount> getaccounts() {
		if (accounts.isEmpty()) {
			addDefaults();
		}
		return accounts;
	}

	// add account
	@PostMapping("/accounts")
	public List<UserAccount> addOne(@RequestBody UserAccount account) {
		for (UserAccount pt : accounts) {
			if (pt.getId()==account.getId()) {
				throw new UserAccountAlreadyExist("account is already available with given id "+account.getId());
			}
		}
		accounts.add(account);
		return accounts;
	}

	// update account
	@PutMapping("/accounts")
	public UserAccount updateOne(@RequestBody UserAccount account) {
		for (int index = 0; index < accounts.size(); index++) {
			if (account.getId() == accounts.get(index).getId()) {
				// set : replace user account
				accounts.set(index, account);
				return account;
			}
		}
		throw new UserAccountNotFound("account is not found with given id "+account.getId());
	}

	// delete account
	@DeleteMapping("/accounts/{id}")
	public List<UserAccount> deleteOne(@PathVariable(value = "id") int id) {
		for (int index = 0; index < accounts.size(); index++) {
			if (id == accounts.get(index).getId()) {
				// set : replace user account
				accounts.remove(index);
				return accounts;
			}
		}
		throw new UserAccountNotFound("account is not found with given id "+id);
	}

	// add default accounts
	private void addDefaults() {
		accounts.add(new UserAccount(8001, "john","smith", "john@123", "john@gmail.com", 12345, "20001225", "Penang", 1000, true, new Date()));
		accounts.add(new UserAccount(8002, "will","smith", "will@123", "will@gmail.com", 56789, "19980225", null, 1000, true, new Date()));
		accounts.add(new UserAccount(8003, "aria","smith", "aria@123", "aria@gmail.com", 34567, "19790103", null, 1000, false, new Date()));
		accounts.add(new UserAccount(8004, "marry","smith", "marry@123", "marry@gmail.com", 23457, "19860305", null, 1000, true, new Date()));
		accounts.add(new UserAccount(8005, "david","smith", "david@123", "david@gmail.com", 56743, "20030618", null, 1000, true, new Date()));
	}
}