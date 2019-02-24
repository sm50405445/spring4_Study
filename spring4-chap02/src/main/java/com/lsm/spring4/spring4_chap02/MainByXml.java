package com.lsm.spring4.spring4_chap02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainByXml {

	public static void main(String[] args) {
		
		//스프링 컨테이너 생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:config.xml");
		
		AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
		
		runAuthAndCatchAuthEx(authSvc, "lsm1", "1111");
		runAuthAndCatchAuthEx(authSvc, "lsm1", "11111");
		runAuthAndCatchAuthEx(authSvc, "lsm1", "111111");
		
		try {
			authSvc.authenticate("lsm2", "1234");
		}catch(UserNotFoundException e) {
			
		}
		authSvc.authenticate("lsm1", "1234");
		PasswordChangeService pwChgSvc = ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("lsm1", "1234", "5678");
		runAuthAndCatchAuthEx(authSvc, "lsm1", "1234");
		authSvc.authenticate("lsm1", "5678");
		ctx.close();
	}
	
	private static void runAuthAndCatchAuthEx(
			AuthenticationService authSvc, String userId, String password) {
		try {
			authSvc.authenticate(userId, password);
		}catch(AuthException e) {
			
		}
	}
	
}
