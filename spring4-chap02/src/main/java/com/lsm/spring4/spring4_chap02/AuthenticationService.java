package com.lsm.spring4.spring4_chap02;

public class AuthenticationService {

	private UserRepository userRepository;
	private AuthFailLogger authFailLogger;
	
	public AuthInfo authenticate(String id, String password) {
		User user = userRepository.findUserById(id);
		if(user == null)
			throw new UserNotFoundException();
		
		if(!user.matchPassword(password)) {
			authFailLogger.insertBadPw(id, password);
			throw new AuthException();
		}
		
		return new AuthInfo(user.getId());
			
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void setAuthFailLogger(AuthFailLogger authFailLogger) {
		this.authFailLogger = authFailLogger;
	}
	
	
}
