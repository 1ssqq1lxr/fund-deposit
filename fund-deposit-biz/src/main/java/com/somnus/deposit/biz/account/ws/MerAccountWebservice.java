package com.somnus.deposit.biz.account.ws;

import javax.jws.WebService;
import javax.validation.Valid;

import com.somnus.deposit.message.Message;
import com.somnus.deposit.message.account.MerAccountQueryRequest;
import com.somnus.deposit.message.account.MerAccountQueryResponse;
import com.somnus.deposit.message.account.MeracctRequest;

@WebService
public interface MerAccountWebservice {
	
	MerAccountQueryResponse selectByAcctcode(@Valid MerAccountQueryRequest request);
	
	Message createMeracct(@Valid MeracctRequest request);
}
