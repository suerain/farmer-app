package edu.mum.farmer.app.serviceImpl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import edu.mum.farmer.app.domain.Member;
import edu.mum.farmer.app.repository.MemberRepository;
import edu.mum.farmer.app.service.CredentialsService;
import edu.mum.farmer.app.service.MemberService;



@Service
@Transactional

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository;
	@Autowired
	CredentialsService credentialsService;

	

	@Override
	public void save(Member member) {
		// TODO Auto-generated method stub
		
		credentialsService.save(member.getCredentials());
		memberRepository.save(member);

	}



	@Override
	public Member findByUserName(String username) {
		// TODO Auto-generated method stub
		return memberRepository.findByUserame(username);
		//return null;
	}

	

	
}
