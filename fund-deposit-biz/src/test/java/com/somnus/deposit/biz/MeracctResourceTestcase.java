package com.somnus.deposit.biz;

import org.junit.Test;

import com.somnus.deposit.biz.account.resource.MerAccountResource;
import com.somnus.deposit.message.Message;
import com.somnus.deposit.message.account.MeracctRequest;
import com.somnus.deposit.support.holder.ApplicationContextHolder;
import com.somnus.rest.core.client.RESTfulJsonClientFactory;
import com.somnus.rest.core.support.JsonUtils;

public class MeracctResourceTestcase extends AbstractTestSupport {
	/*private static final String BASE_URL = "http://localhost:8080/fund-deposit/resource/";*/
	
	/*MeracctResource meracctResource = RESTfulJsonClientFactory.createClient(MeracctResource.class, BASE_URL);*/
	
	@Test
    public void createMeracct() throws Exception {
		MeracctRequest request = new MeracctRequest();
    	request.setSysCode("test");
    	request.setFrontNo("test");
    	request.setFrontTime("test");
    	
    	request.setAcctCode("1020550026");
    	request.setMerCode("100091");
    	request.setAcctName("开发环境T1-0427");
    	request.setCurrency("156");
    	request.setBankCode("1103");
    	request.setBankName("华夏银行");
    	request.setBankKey("11");
    	request.setBranchCode("1111");
    	request.setBranchName("陆家嘴支行");
    	request.setBankAcctNo("1103");
    	request.setBankAcctName("11111");
    	request.setStatus("1");
    	
    	System.out.println("个人开户请求>>>:"+ JsonUtils.toString(request));
    	MerAccountResource meracctResource = ApplicationContextHolder.getBean(MerAccountResource.class);
    	Message message = meracctResource.createMeracct(request);
        System.out.println("个人开户响应<<<:"+JsonUtils.toString(message));
    }
	
}
