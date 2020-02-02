package com.SPN.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SPN.model.entiteis.Role;
import com.SPN.model.entiteis.Users;


@Service
public class JwtUserDetailsService implements UserDetailsService{
	@Autowired 
	private i_UserSRV gestionuser;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users GU = gestionuser.findByUsername(username);
		if (GU != null) {
			return new User(GU.getUsername(),GU.getPassword(),getGrantedAuthorities(GU));
		} 
		
//		if (GU != null) {
//			return new User(GU.getUsername(),GU.getPassword(),
//					new ArrayList<>());
//		} 
//		if ("javainuse".equals(username)) {
//			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
//					new ArrayList<>());
//		} 
		else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}

	}
	private List<GrantedAuthority> getGrantedAuthorities(Users user)
	 {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		Role role = user.getRole();
		
			authorities.add(new SimpleGrantedAuthority(role.getLabel()));
		System.out.println(authorities);
		
		return authorities;
	}
}
