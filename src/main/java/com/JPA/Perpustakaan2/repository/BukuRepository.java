package com.JPA.Perpustakaan2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.Perpustakaan2.entity.Buku;

public interface BukuRepository extends JpaRepository<Buku, Long> {

	public List<Buku> getAllByKodeBuku (int kodeBuku);
	public Buku deleteByKodeBuku (String kodeBuku);
}
