package com.JPA.Perpustakaan2.services;

import java.util.List;

import com.JPA.Perpustakaan2.entity.Rak;

public interface ModelRakInterface {
	public List<Rak> getAll();
	
	public Rak addRak (Rak rak);
	
	public Rak getRakFindById(String id);
	
	public void deleteRak (String id);
}
