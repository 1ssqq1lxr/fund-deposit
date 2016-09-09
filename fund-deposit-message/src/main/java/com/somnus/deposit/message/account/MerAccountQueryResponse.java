package com.somnus.deposit.message.account;

import java.util.List;

import com.somnus.deposit.message.Message;


public class MerAccountQueryResponse extends Message {
	
	private static final long serialVersionUID = 1L;
	
	/**当前页码*/
	private int pageNum;
	/**每页大小*/
	private int pageSize;
	/**总条数*/
	private int rowCount;
	/**查询结果*/
	private List<MerAccount> merAccounts;
	
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

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public List<MerAccount> getMerAccounts() {
		return merAccounts;
	}

	public void setMerAccounts(List<MerAccount> merAccounts) {
		this.merAccounts = merAccounts;
	}
	
}
