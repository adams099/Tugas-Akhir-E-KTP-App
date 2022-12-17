package com.example.ektp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ektp.model.AnggotaKeluarga;
import com.example.ektp.service.IAnggotaKeluargaService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/anggotakeluarga")
public class AnggotaKeluargaController {

    @Autowired
    IAnggotaKeluargaService anggotaKeluargaService;

    @PostMapping("/insert")
    public AnggotaKeluarga insertAnggotaKeluarga(@RequestBody AnggotaKeluarga anggotaKeluarga) {
        return anggotaKeluargaService.insertAnggotaKeluarga(anggotaKeluarga);
    }

    @GetMapping("/getAll")
    public List<AnggotaKeluarga> getAllAnggotaKeluarga() {
        return anggotaKeluargaService.getAllAnggotaKeluarga();
    }

    @PutMapping("/update/{id}")
    public AnggotaKeluarga updateAnggotaKeluarga(@PathVariable int id, @RequestBody AnggotaKeluarga anggotaKeluarga) {
        return anggotaKeluargaService.updateAnggotaKeluarga(id, anggotaKeluarga);
    }

    @DeleteMapping("/delete/{id}")
    public AnggotaKeluarga deleteAnggotaKeluarga(@PathVariable int id) {
        return anggotaKeluargaService.deleteAnggotaKeluarga(id);
    }

    @GetMapping("/getData/{id}")
    public AnggotaKeluarga getAnggotaKeluargaById(@PathVariable int id) {
        return anggotaKeluargaService.getAnggotaKeluargaById(id);
    }

    @GetMapping("/get/{id_kk}")
    public List<AnggotaKeluarga> getAllAnggotaKeluargaByIdKK(@PathVariable int id_kk) {
        return anggotaKeluargaService.getAllAnggotaKeluargaByIdKK(id_kk);
    }

}
