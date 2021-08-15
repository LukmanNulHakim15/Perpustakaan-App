package com.JPA.Perpustakaan2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Perpustakaan2.entity.Petugas;
import com.JPA.Perpustakaan2.repository.PetugasRepository;

@Service
public class ModelPetugas implements ModelPetugasInterface {
	
	@Autowired
	PetugasRepository petugasRepo;

	@Override
	public List<Petugas> getAll() {
		// TODO Auto-generated method stub
		return (List<Petugas>) petugasRepo.findAll();
	}

	@Override
	public Petugas addPetugas(Petugas petugas) {
		// TODO Auto-generated method stub
		return this.petugasRepo.save(petugas);
	}

	@Override
	public void deletePetugas(String id) {
		// TODO Auto-generated method stub
		this.petugasRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public Petugas getPetugasById(String id) {
		// TODO Auto-generated method stub
		return this.petugasRepo.findById(Long.parseLong(id)).get();
	}

}
