package com.JPA.Perpustakaan2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Perpustakaan2.entity.Peminjaman;
import com.JPA.Perpustakaan2.repository.PeminjamanRepository;

@Service
public class ModelPeminjaman implements ModelPeminjamanInterface {
	
	@Autowired
	PeminjamanRepository peminjamRepo;
	
	@Override
	public List<Peminjaman> getAllPeminjaman() {
		// TODO Auto-generated method stub
		return (List<Peminjaman>) this.peminjamRepo.findAll();
	}

	@Override
	public Peminjaman addPeminjaman(Peminjaman peminjaman) {
		// TODO Auto-generated method stub
		return this.peminjamRepo.save(peminjaman);
	}

	@Override
	public void deletePeminjaman(String id) {
		// TODO Auto-generated method stub
		this.peminjamRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public Peminjaman getAllPeminjamanById(String id) {
		// TODO Auto-generated method stub
		return this.peminjamRepo.findById(Long.parseLong(id)).get();
	}

}
