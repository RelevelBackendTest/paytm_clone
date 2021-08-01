package com.relevel.backend.paytm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaytmWalletController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

