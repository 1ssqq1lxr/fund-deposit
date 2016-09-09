package com.somnus.deposit.biz.account.service.impl;

import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.deposit.biz.account.dao.MerAccountDao;
import com.somnus.deposit.biz.account.service.MerAccountService;
import com.somnus.deposit.message.account.MerAccount;
import com.somnus.deposit.message.account.MerAccountQueryRequest;
import com.somnus.deposit.message.account.MerAccountQueryResponse;
import com.somnus.deposit.message.account.MeracctRequest;
import com.somnus.deposit.support.common.MsgCodeList;
import com.somnus.deposit.support.exceptions.BizException;

@Service
public class MerAccountServiceImpl implements MerAccountService{
	
	private transient Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MerAccountDao merAccountDao;
	
	@Autowired
	private MessageSourceAccessor msa;
	
	@Override
	public MerAccountQueryResponse selectByAcctcode(MerAccountQueryRequest request) {
		
		MerAccountQueryResponse response = new MerAccountQueryResponse();
		
		PageList<MerAccount> pagelist = merAccountDao.selectByAcctcode(request.getAcctCode(), 
				new PageBounds(request.getPageNum(),request.getPageSize()));
		
		if(pagelist == null) {
			throw new BizException(msa.getMessage(MsgCodeList.ERROR_505002, 
					new Object[]{request.getAcctCode()}));
		}
		
		int total = pagelist.getPaginator().getTotalCount();//总记录数
		response.setPageNum(request.getPageNum());
		response.setPageSize(request.getPageSize());
		response.setRowCount(total);
		response.setMerAccounts(pagelist);
		return response;
	}

	@Override
	@Transactional
	public void createMeracct(MeracctRequest request) throws Exception {
		String acctCode = request.getAcctCode();
		List<MerAccount> accounts = merAccountDao.selectByAcctcode(acctCode);// 查询交易账户号是否存在
		// 交易账户号已存在直接返回
		if (accounts != null && accounts.size() > 0) {
			log.warn(msa.getMessage(MsgCodeList.ERROR_305003,
					new Object[] { "merAccCode:".concat(acctCode) }));
			return;
		}

		// 新增交易账户
		MerAccount meraccount = new MerAccount();
		PropertyUtils.copyProperties(meraccount, request);
		
		merAccountDao.insert(meraccount);
	}

}
