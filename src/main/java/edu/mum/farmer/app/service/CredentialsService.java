package edu.mum.farmer.app.service;

import java.util.List;

import edu.mum.farmer.app.domain.Credentials;



 
public interface CredentialsService {

	public void save(Credentials credentials);
	public List<Credentials> findAll();
 }
