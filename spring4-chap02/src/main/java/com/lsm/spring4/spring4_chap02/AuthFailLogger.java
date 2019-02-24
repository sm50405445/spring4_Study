package com.lsm.spring4.spring4_chap02;

public class AuthFailLogger {

	private int threshold;
	private int failCounts;
	
	public void insertBadPw(String userId, String inputPw) {
		System.out.printf("AuthFail [type=badPw, userId=%s, pw=%s]",userId,inputPw);
		failCounts++;
		if(threshold>0 && failCounts>threshold) {
			notifyTooManyFail();
			failCounts = 0;
		}
	}
	
	public void notifyTooManyFail() {
		System.out.println("너무 많은 로그인 시도 실패");
	}
	
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
}
