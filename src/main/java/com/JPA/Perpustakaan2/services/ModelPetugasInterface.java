package com.JPA.Perpustakaan2.services;

import java.util.List;

import com.JPA.Perpustakaan2.entity.Petugas;

public interface ModelPetugasInterface {
	
	public List<Petugas> getAll();
	
	public Petugas addPetugas (Petugas petugas);
	
	public void deletePetugas (String id);
	
	public Petugas getPetugasById (String id);
}
