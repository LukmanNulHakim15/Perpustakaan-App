package com.JPA.Perpustakaan2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Perpustakaan2.entity.Pengembalian;
import com.JPA.Perpustakaan2.repository.PengembalianRepository;

@Service
public class ModelPengembalian implements ModelPengembalianInterface {

	@Autowired
	PengembalianRepository pengembalianRepo;
	
	@Override
	public List<Pengembalian> getAll() {
		// TODO Auto-generated method stub
		return (List<Pengembalian>) this.pengembalianRepo.findAll();
	}

	@Override
	public void deletePengembalian(String id) {
		// TODO Auto-generated method stub
		this.pengembalianRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public Pengembalian addPengembalian(Pengembalian pengembalian) {
		// TODO Auto-generated method stub
		return this.pengembalianRepo.save(pengembalian);
	}

	@Override
	public Pengembalian getPengembalianById(String id) {
		// TODO Auto-generated method stub
		return this.pengembalianRepo.findById(Long.parseLong(id)).get();
	}

	
}
