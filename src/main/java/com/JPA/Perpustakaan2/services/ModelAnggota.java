package com.JPA.Perpustakaan2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Perpustakaan2.entity.Anggota;
import com.JPA.Perpustakaan2.repository.AnggotaRepository;

@Service
public class ModelAnggota implements ModelAnggotaInterface {
	@Autowired 
	AnggotaRepository AnggotaRepo;

	@Override
	public List<Anggota> getAllAnggota() {
		// TODO Auto-generated method stub
		return (List<Anggota>) this.AnggotaRepo.findAll();
	}

	@Override
	public Anggota getAnggotaByIdAnggota(String id) {
		// TODO Auto-generated method stub
		return this.AnggotaRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteAnggota(String id) {
		// TODO Auto-generated method stub
		this.AnggotaRepo.deleteById(Long.parseLong(id));
	}

	@Override
	public Anggota addAnggota(Anggota anggota) {
		// TODO Auto-generated method stub
		return this.AnggotaRepo.save(anggota);	
		}

	@Override
	public List<Anggota> getAnggotaByKodeAnggota(String kode_anggota) {
		// TODO Auto-generated method stub
		
		return this.AnggotaRepo.findByKodeAnggota(kode_anggota);
	}

	@Override
	public void deleteKodeAnggota(String KodeAnggota) {
		// TODO Auto-generated method stub
		this.AnggotaRepo.deleteByKodeAnggota(KodeAnggota);	
	}

	
	
//	@Override
//	public List<Anggota> getAllAnggota() {
//		// TODO Auto-generated method stub
//		return (List<Anggota>) this.AnggotaRepo.findAll() ;
//	}
//
//	@Override
//	public Anggota getAnggotaByNama_Anggota(String nama_anggota) {
//		// TODO Auto-generated method stub
//		return (Anggota)this.AnggotaRepo.findByNama_Anggota(nama_anggota);
//	}
//
//	@Override
//	public Anggota getAnggotaByIdAnggota(String id) {
//		// TODO Auto-generated method stub
//		return ((Anggota)this.AnggotaRepo.findByIdAnggota(Long.parseLong(id)));
//	}
//
//	@Override
//	public void deleteAnggota(String id) {
//		// TODO Auto-generated method stub
//		this.AnggotaRepo.deleteById(Long.parseLong(id));
//	}
//
//	@Override
//	public Anggota addAnggota(Anggota anggota) {
//		// TODO Auto-generated method stub
//		return this.AnggotaRepo.save(anggota);
//	}

}
