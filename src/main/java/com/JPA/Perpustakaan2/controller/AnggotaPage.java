package com.JPA.Perpustakaan2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.Perpustakaan2.entity.Anggota;
import com.JPA.Perpustakaan2.services.ModelAnggota;

@Controller
//@RestController
public class AnggotaPage {
	
	@Autowired
	ModelAnggota modelAnggota;
	
	@GetMapping("/anggota/view")
	public String viewDataAnggota(Model model) {
		model.addAttribute("listAnggota",modelAnggota.getAllAnggota());
		return "view_anggota";
	}
			
	@GetMapping("/anggota/add")
	public String viewAddAnggota(Model model) {
		model.addAttribute("anggotA", new Anggota());
		return "add_anggota";
	}
	
	
	@PostMapping("/anggota/view")
	public String addAnggota(@ModelAttribute Anggota anggota, Model model) {
		this.modelAnggota.addAnggota(anggota);
		model.addAttribute("listAnggota",modelAnggota.getAllAnggota());
		return "view_anggota";
		
	}
	
	@GetMapping ("/anggota/update/{id}")
	public String viewUpdateAnggota (@PathVariable String id, Model model) {
		Anggota anggota = modelAnggota.getAnggotaByIdAnggota(id);
		model.addAttribute("anggotA",anggota);
		return "add_anggota";
	}
	
	@GetMapping ("anggota/delete/{id}")
	public String viewDeleteAnggota (@PathVariable String id, Model model) {
		this.modelAnggota.deleteAnggota(id);
		model.addAttribute("listAnggota", modelAnggota.getAllAnggota());
		return "view_anggota";
	}
	
	
	//========= RestApi ============\\
	

	@GetMapping ("/API/anggota")
	public List<Anggota> getAll(){
		return (List<Anggota>) modelAnggota.getAllAnggota();
	}
	
	@PostMapping ("/API/anggota/add")
	public String addAnggota (@RequestBody Anggota anggota ) {
		modelAnggota.addAnggota(anggota);
		return "Insert Berhasil";
	}
	
	@GetMapping ("/API/anggota/cari/{kode}")
	public List<Anggota> getAllByKodeAnggota (@PathVariable String kode){
		System.out.println(kode);
		return modelAnggota.getAnggotaByKodeAnggota(kode);
	}
	
	@DeleteMapping ("/API/anggota/delete/{id}")
	public String deleteAnggota (@PathVariable String id) {
		modelAnggota.deleteAnggota(id);
		return "Delete Berhasil";
	}
	
	@PutMapping ("/API/anggota/update/{id}")
	public String updateAnggota (@PathVariable String id, @RequestBody Anggota anggota) {
		anggota.setIdAnggota(Long.parseLong(id));
		modelAnggota.addAnggota(anggota);
		return "Update Berhasil";
	}
}
