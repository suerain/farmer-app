package edu.mum.farmer.app.service;

import java.util.List;


import edu.mum.farmer.app.domain.Member;



public interface MemberService {
	
	/*//public void saveUser(User user);*/
	
	
	
	public void save(Member member);
	
	public Member findByUserName(String username);
  	
}
