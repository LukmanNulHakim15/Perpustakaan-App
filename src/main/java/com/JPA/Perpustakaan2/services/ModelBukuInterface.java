package com.JPA.Perpustakaan2.services;

import java.util.List;

import com.JPA.Perpustakaan2.entity.Buku;

public interface ModelBukuInterface {
	
	public List<Buku> getAllBuku ();
	
	public Buku getBukuById (String id);
	
	public void deleteBuku (String id);
	
	public List<Buku> getBukuByKodeBuku (int kodeBuku);
	
	public void deleteByKodeBuku (String kode_buku);
	
	public Buku addBuku (Buku buku);

}
