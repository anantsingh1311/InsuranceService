package com.synergy.service;

import com.synergy.dto.EmailDetails;

public interface EmailService {
	public String sendSimpleMail(EmailDetails email);
	public String sendMailwithAttachment(EmailDetails email);

}
