package com.JPA.Perpustakaan2.services;

import java.util.List;

import com.JPA.Perpustakaan2.entity.Pengembalian;

public interface ModelPengembalianInterface {
	
	public List<Pengembalian> getAll();
	
	public void deletePengembalian (String id);
	
	public Pengembalian addPengembalian (Pengembalian pengembalian);
	
	public Pengembalian getPengembalianById (String id);
	
	
}
