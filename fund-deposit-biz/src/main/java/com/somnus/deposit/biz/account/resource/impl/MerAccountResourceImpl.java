package com.somnus.deposit.biz.account.resource.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.somnus.deposit.biz.account.resource.MerAccountResource;
import com.somnus.deposit.biz.account.service.MerAccountService;
import com.somnus.deposit.message.Message;
import com.somnus.deposit.message.account.MerAccountQueryRequest;
import com.somnus.deposit.message.account.MerAccountQueryResponse;
import com.somnus.deposit.message.account.MeracctRequest;
import com.somnus.deposit.support.common.Constants;
import com.somnus.deposit.support.common.MessageUtil;
import com.somnus.deposit.support.exceptions.BizException;
import com.somnus.rest.core.support.JsonUtils;

@Path("/com.somnus.deposit.biz.account.resource.MerAccountResource")
@Validated
@Component
public class MerAccountResourceImpl implements MerAccountResource{
	
	private transient Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MerAccountService merAccountService;

	@Path("/selectByAcctcode")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public MerAccountQueryResponse selectByAcctcode(MerAccountQueryRequest request) {
		log.info(Constants.REQUEST_MSG, JsonUtils.toString(request));
		MerAccountQueryResponse response = new MerAccountQueryResponse();
		try {
			response = merAccountService.selectByAcctcode(request);
			//返回成功报文
            MessageUtil.createCommMsg(response);
		} catch (BizException e) {
			log.error(Constants.BUSINESS_ERROR, e);
			// 组织错误报文
			MessageUtil.errRetrunInAction(response,e);
		} catch (Exception ex) {
			log.error(Constants.EXCEPTION_ERROR, ex);
			// 组织错误报文
			MessageUtil.createErrorMsg(response);
		}
		log.info(Constants.REPONSE_MSG, JsonUtils.toString(response));
		return response;
	}
	
	@Path("/createMeracct")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Override
    public Message createMeracct(MeracctRequest request) {
        log.info(Constants.REQUEST_MSG, JsonUtils.toString(request));
        Message message = new Message();
        try {
        	merAccountService.createMeracct(request);
            //返回成功报文
            message = MessageUtil.createCommMsg();
        } catch (BizException e) {
            log.error(Constants.BUSINESS_ERROR, e);
            // 组织错误报文
            message = MessageUtil.errRetrunInAction(e);
        } catch (Exception ex) {
            log.error(Constants.EXCEPTION_ERROR, ex);
            // 组织错误报文
            message = MessageUtil.createErrorMsg();
        }
        log.info(Constants.REPONSE_MSG, JsonUtils.toString(message));
        return message;
    }

}
