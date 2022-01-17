package com.alex.transfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.transfer.dto.Transfer;
import com.alex.transfer.model.Account;
import com.alex.transfer.service.TransferService;

@RestController
@RequestMapping("/transfers")
public class TransferController {
	
	@Autowired
	TransferService transferService;
	
	
	@PostMapping("/transferFund")
	public String transferFund(@RequestBody Transfer transfer) {
		return transferService.transferFund(transfer);
	}
	
	@GetMapping("/getAccounts")
	public List<Account> getAccounts(){
		return transferService.getAccounts();
		
	}
}
