package com.JPA.Perpustakaan2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Perpustakaan2.entity.Rak;
import com.JPA.Perpustakaan2.repository.RakRepository;

@Service
public class ModelRak implements ModelRakInterface {

	@Autowired
	RakRepository rakRepo;

	@Override
	public List<Rak> getAll() {
		// TODO Auto-generated method stub
		return (List<Rak>) rakRepo.findAll();
	}

	@Override
	public Rak addRak(Rak rak) {
		// TODO Auto-generated method stub
		return this.rakRepo.save(rak);
	}

	@Override
	public Rak getRakFindById(String id) {
		// TODO Auto-generated method stub
		return this.rakRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteRak(String id) {
		// TODO Auto-generated method stub
		this.rakRepo.deleteById(Long.parseLong(id));
	}
}
