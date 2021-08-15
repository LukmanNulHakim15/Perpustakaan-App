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
@Table (name="pengembalian")
public class Pengembalian {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long idPengembalian;
	private String tanggalPengembalian;
	private int denda;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bukuId")
	private Buku buku;
	

}
