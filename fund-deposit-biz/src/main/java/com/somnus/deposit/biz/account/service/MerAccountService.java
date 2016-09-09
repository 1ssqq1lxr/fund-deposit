package com.somnus.deposit.biz.account.service;

import com.somnus.deposit.message.account.MerAccountQueryRequest;
import com.somnus.deposit.message.account.MerAccountQueryResponse;
import com.somnus.deposit.message.account.MeracctRequest;

public interface MerAccountService {
	
	/**
	 * 根据交易账户号查询交易账户
	 * @param acctCode
	 * @return
	 */
	MerAccountQueryResponse selectByAcctcode(MerAccountQueryRequest request);

	void createMeracct(MeracctRequest request) throws Exception;
	
}
