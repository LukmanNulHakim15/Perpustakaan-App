package com.JPA.Perpustakaan2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.Perpustakaan2.entity.Peminjaman;
import com.JPA.Perpustakaan2.services.ModelPeminjaman;

@Controller
@RestController
public class PeminjamPage {

	@Autowired
	ModelPeminjaman modelPeminjam;
	
//	=== RestAPI ===
	
	@GetMapping ("/API/peminjaman/")
	public List<Peminjaman> getAll(){
		return (List<Peminjaman>) modelPeminjam.getAllPeminjaman();	
	}
	
	@PostMapping ("/API/peminjaman/add")
	public String addPeminjaman(@RequestBody Peminjaman peminjaman) {
		modelPeminjam.addPeminjaman(peminjaman);
		return "Data anda masuk";
	}
	
	@DeleteMapping ("/API/peminjaman/delete/{id}")
	public String deletePeminjaman(@PathVariable String id) {
		modelPeminjam.deletePeminjaman(id);
		return "Hapus data berhasil";
	}
	
	@GetMapping ("/API/peminjaman/cari/{id}")
	public List<Peminjaman> searchPeminjaman(@PathVariable String id) {
		System.out.println(id);
		return  (List<Peminjaman>) modelPeminjam.getAllPeminjamanById(id);
	}
	
	@PutMapping("/API/peminjaman/update/{id}")
	public String updatePeminjaman (@PathVariable String id, @RequestBody Peminjaman peminjaman) {
		peminjaman.setIdPeminjaman(Long.parseLong(id));
		modelPeminjam.addPeminjaman(peminjaman);
		return "Update data anda berhasil";
	}
}
