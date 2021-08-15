package com.JPA.Perpustakaan2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.Perpustakaan2.entity.Peminjaman;

public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {

	
}
