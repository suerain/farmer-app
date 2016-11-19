package edu.mum.farmer.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import edu.mum.farmer.app.domain.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
	
	
@Query("select m from Member m where m.credentials.username= :username")
	public Member findByUserame(@Param("username") String username);
	
	
	
}
