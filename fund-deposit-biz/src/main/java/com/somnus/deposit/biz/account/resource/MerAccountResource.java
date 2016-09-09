package com.somnus.deposit.biz.account.resource;

import javax.validation.Valid;

import com.somnus.deposit.message.Message;
import com.somnus.deposit.message.account.MerAccountQueryRequest;
import com.somnus.deposit.message.account.MerAccountQueryResponse;
import com.somnus.deposit.message.account.MeracctRequest;

public interface MerAccountResource {
	
	MerAccountQueryResponse selectByAcctcode(@Valid MerAccountQueryRequest request);
	
	Message createMeracct(@Valid MeracctRequest request);
}
