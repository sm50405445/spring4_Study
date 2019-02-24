package com.lsm.spring4.spring4_chap02;

public class PasswordChangeService {

	private UserRepository userRepository;

	public PasswordChangeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void changePassword(String userId, String oldPassword,String newPassword) {
		User user = userRepository.findUserById(userId);
		if(user==null)
			throw new UserNotFoundException();
		user.changePassword(oldPassword , newPassword);
	}
}
