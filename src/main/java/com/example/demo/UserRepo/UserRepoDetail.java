package com.example.demo.UserRepo;

import java.util.Arrays;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.example.demo.model.UserModel;
@Repository
public class UserRepoDetail {

	public UserModel findUserByUserName(String userName) {
		UserModel userModel = null;
		if(StringUtils.isEmpty(userName)) {
			userModel = null;
		} else if(userName.equals("user")) {
			userModel = new UserModel("user", "mypassword", Arrays.asList("USER") );
		} else if(userName.equals("admin")) {
			userModel = new UserModel("admin", "admin", Arrays.asList("USER", "ADMIN") );
		}
		return userModel;
	}
}
