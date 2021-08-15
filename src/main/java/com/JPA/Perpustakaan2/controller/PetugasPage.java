package com.JPA.Perpustakaan2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.Perpustakaan2.entity.Petugas;
import com.JPA.Perpustakaan2.services.ModelPetugas;

@Controller
@RestController
public class PetugasPage {

		@Autowired
		ModelPetugas modelPetugas;
		
		@GetMapping("/API/petugas")
		public List<Petugas> getAll(){
			return (List<Petugas>) modelPetugas.getAll();
		}
		
		@PostMapping("/API/petugas/add")
		public String addPetugas(@RequestBody Petugas petugas) {
			modelPetugas.addPetugas(petugas);
			return "SImpan data anda berhasil";
			
		}
		
		@DeleteMapping("/API/petugas/delete/{id}")
		public String deletePetugas(@PathVariable String id) {
			modelPetugas.deletePetugas(id);
			return "Data anda berhasil dihapus";
		}
}
