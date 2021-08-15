package com.JPA.Perpustakaan2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Perpustakaan2.entity.Buku;
import com.JPA.Perpustakaan2.repository.BukuRepository;

@Service
public class ModelBuku implements ModelBukuInterface{
	
	@Autowired
	BukuRepository bukuRepo;
	
	@Override
	public List<Buku> getAllBuku() {
		// TODO Auto-generated method stub
		return (List<Buku>) this.bukuRepo.findAll();
	}

	@Override
	public Buku getBukuById(String id) {
		// TODO Auto-generated method stub
		return this.bukuRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteBuku(String id) {
		// TODO Auto-generated method stub
		this.bukuRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public List<Buku> getBukuByKodeBuku(int kodeBuku) {
		// TODO Auto-generated method stub
		return this.bukuRepo.getAllByKodeBuku(kodeBuku);
	}

	@Override
	public void deleteByKodeBuku(String kode_buku) {
		// TODO Auto-generated method stub
		this.bukuRepo.deleteByKodeBuku(kode_buku);
	}

	@Override
	public Buku addBuku(Buku buku) {
		// TODO Auto-generated method stub
		return this.bukuRepo.save(buku);
	}

	

}
