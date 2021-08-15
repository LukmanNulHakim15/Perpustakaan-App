package com.JPA.Perpustakaan2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Peminjaman {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long idPeminjaman;
	private String tanggalPinjaman;
	private String tanggalKembali;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bukuId")
	private Buku buku;
}
