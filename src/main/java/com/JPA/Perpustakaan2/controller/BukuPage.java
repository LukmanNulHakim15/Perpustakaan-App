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

import com.JPA.Perpustakaan2.entity.Buku;
import com.JPA.Perpustakaan2.services.ModelBuku;

@Controller
//@RestController // Digunakan pada saat untuk pengecekan melalu postman
public class BukuPage {
	
	@Autowired
	ModelBuku modelBuku;
	
	@GetMapping ("/buku/view")
	public String viewBuku(Model model) {
		model.addAttribute("listBuku", modelBuku.getAllBuku());
		return "view_buku";
	}
	
	@GetMapping ("/buku/add")
	public String viewAddBuku(Model model) {
		model.addAttribute("bukU", new Buku());
		return "add_buku";
	}
	
	@PostMapping ("/buku/view")
	public String addBuku (@ModelAttribute Buku buku, Model model) {
		this.modelBuku.addBuku(buku);
		model.addAttribute("listBuku",modelBuku.getAllBuku());
		return "view_buku";
	}
	
	@GetMapping ("/buku/update/{id}")
	public String viewUpdateBuku (@PathVariable String id, Model model) {
		Buku buku = modelBuku.getBukuById(id);
		model.addAttribute("bukU",buku);
		return "add_buku";
	}
	
	@GetMapping ("/buku/delete/{id}")
	public String viewDeleteBuku (@PathVariable String id, Model model) {
		this.modelBuku.deleteBuku(id);
		model.addAttribute("listBuku",modelBuku.getAllBuku());
		return "view_buku";
	}
	
//							=== RestAPI ===
	
	@GetMapping ("/API/buku")
	public List<Buku> getAll(){
		return (List<Buku>)modelBuku.getAllBuku();
	}
	
	@PostMapping ("/API/buku/add")
	public String addBuku(@RequestBody Buku buku) {
		modelBuku.addBuku(buku);
		return "Data berhasil di simpan";
	}
	
	@PutMapping ("/API/buku/edit/{id}")
	public String UpdateBuku (@PathVariable String id, @RequestBody Buku buku) {
		buku.setIdBuku(Long.parseLong(id));
		modelBuku.addBuku(buku);
		return "Update data berhasil";
	}
	
	@DeleteMapping("/API/buku/delete/{id}")
	public String deleteBuku (@PathVariable String id) {
		modelBuku.deleteBuku(id);
		return "Hapus data berhasil";
	}
	
	@GetMapping("/API/buku/cari/{kode_buku}")
	public List<Buku> getBukuByKodeBuku(@PathVariable int kodeBuku) {
		System.out.println(kodeBuku);
		return modelBuku.getBukuByKodeBuku(kodeBuku);
	}
}
