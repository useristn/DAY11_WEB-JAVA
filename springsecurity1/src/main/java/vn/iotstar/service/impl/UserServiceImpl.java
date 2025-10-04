package vn.iotstar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vn.iotstar.entity.Users;
import vn.iotstar.repository.UserRepository;

@Service
public class UserServiceImpl {
	@Autowired
	private UserRepository userRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepository.getUserByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("Could not found");
		}
		
		return new MyUserService(user);
	}
}
