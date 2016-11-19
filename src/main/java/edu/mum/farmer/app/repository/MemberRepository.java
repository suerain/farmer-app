package edu.mum.farmer.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import edu.mum.farmer.app.domain.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
	
	
	/*@Query("select m from member m join m.credentials a where a.username= :username")
	public Member findByUserame(@Param("username") String username);
	*/
	/*@Query("select u from USER u where u.accountNo = :accountNo")
	public User findByAccountNo(@Param("accountNo") String accountNo);*/
	
	
}
