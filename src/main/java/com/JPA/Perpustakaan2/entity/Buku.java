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
@Table(name="buku")
public class Buku {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idBuku;
	private int kodeBuku;
	private String judulBuku;
	private String penulisBuku;
	private String penerbitBuku;
	private String tahunPenerbit;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="bukuId", referencedColumnName="idBuku")
	private List<Rak> lstRak = new ArrayList<Rak>();

}
