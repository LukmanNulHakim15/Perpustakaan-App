package com.JPA.Perpustakaan2.services;

import java.util.List;

import com.JPA.Perpustakaan2.entity.Anggota;

public interface ModelAnggotaInterface {
	
	public List<Anggota> getAllAnggota();
	
	public Anggota getAnggotaByIdAnggota (String id);
	
	public void deleteAnggota (String id);
	
	public Anggota addAnggota (Anggota anggota);
	
	public List<Anggota> getAnggotaByKodeAnggota(String kode_anggota);
	
	public void deleteKodeAnggota (String KodeAnggota);
}
