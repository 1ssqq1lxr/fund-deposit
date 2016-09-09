package com.somnus.deposit.message.account;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.somnus.deposit.message.Message;


public class MerAccountQueryRequest extends Message {

	private static final long serialVersionUID = 1L;
	
    @NotEmpty
    private String acctCode;
    
    /**当前页码*/
    @NotNull
	private int pageNum;
    
	/**每页大小*/
    @NotNull
	private int pageSize;
    
	public String getAcctCode() {
		return acctCode;
	}
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
