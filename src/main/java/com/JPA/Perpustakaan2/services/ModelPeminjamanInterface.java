package com.JPA.Perpustakaan2.services;

import java.util.List;

import com.JPA.Perpustakaan2.entity.Peminjaman;

public interface ModelPeminjamanInterface {
	
	public List<Peminjaman> getAllPeminjaman();
	
	public Peminjaman addPeminjaman (Peminjaman peminjaman);
	
	public void deletePeminjaman (String id);
	
	public Peminjaman getAllPeminjamanById (String id);

}
