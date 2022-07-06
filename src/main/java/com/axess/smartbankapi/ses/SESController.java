package com.axess.smartbankapi.ses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axess.smartbankapi.SmartBankApiApplication;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/ses")
@Slf4j
public class SESController {

	@Autowired
	private EMailService mailService;
	private static final Logger LOGGER = LoggerFactory.getLogger(SmartBankApiApplication.class);
	@PostMapping("/send")
	public String sendEmail(@RequestBody Email email) {
		LOGGER.info("Email is being sent to: "+email.getTo());
		return mailService.sendEmail(email);
	}
}