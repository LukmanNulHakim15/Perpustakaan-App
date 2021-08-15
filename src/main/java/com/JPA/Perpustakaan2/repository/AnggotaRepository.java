package com.JPA.Perpustakaan2.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.JPA.Perpustakaan2.entity.Anggota;

public interface AnggotaRepository extends CrudRepository <Anggota, Long> {

	
//   public Anggota findByNama_Anggota(String nama_anggota);
//   public Anggota findByIdAnggota (Long id);
	
	List<Anggota>findByKodeAnggota (String kodeAnggota);
	public Anggota deleteByKodeAnggota (String kodeAnggota);

}
