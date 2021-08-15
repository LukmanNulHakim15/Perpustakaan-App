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
@Table(name="anggota")
public class Anggota {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long idAnggota;
	private String kodeAnggota;
	private String namaAnggota;
	private String jkAnggota;
	private String jurusanAnggota;
	private String noTelpAnggota;
	private String alamat;
	
@OneToMany (cascade=CascadeType.ALL)
@JoinColumn(name="anggota_id", referencedColumnName="idAnggota")	
private List<Pengembalian> lstPengembalian = new ArrayList<Pengembalian>();

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="anggota_id", referencedColumnName="idAnggota")
private List<Peminjaman> lstPeminjaman = new ArrayList<Peminjaman>();
}
