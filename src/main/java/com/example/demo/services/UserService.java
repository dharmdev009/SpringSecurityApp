package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepo.UserRepoDetail;
import com.example.demo.model.UserModel;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	UserRepoDetail userRepoDetail;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserModel userDetail = userRepoDetail.findUserByUserName(username);
		
		if(Objects.isNull(userDetail)) {
			throw new UsernameNotFoundException("UserName not found");
		}
		
		List<String> roleList =  new ArrayList<>();
		return new User(userDetail.getUserName(), userDetail.getPassword(), AuthorityUtils.createAuthorityList(roleList.toArray(new String[roleList.size()])));
		
	}

}
