package com.JPA.Perpustakaan2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="petugas")
public class Petugas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPetugas;
	private String namaPetugas;
	private String jabatanPetugas;
	private String noTelpPetugas;
	private String alamatPetugas;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="petugasId", referencedColumnName="idPetugas")
	private List<Pengembalian> lstPengembalian = new ArrayList<Pengembalian>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="petugasId", referencedColumnName="idPetugas")
	private List<Peminjaman> lstPeminjaman = new ArrayList<Peminjaman>();
}
