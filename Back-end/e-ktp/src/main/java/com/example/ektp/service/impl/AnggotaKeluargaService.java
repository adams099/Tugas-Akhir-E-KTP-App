package com.example.ektp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ektp.model.AnggotaKeluarga;
import com.example.ektp.repository.IAnggotaKeluargaRepository;
import com.example.ektp.service.IAnggotaKeluargaService;

@Service
public class AnggotaKeluargaService implements IAnggotaKeluargaService {

    @Autowired
    IAnggotaKeluargaRepository anggotaKeluargaRepository;

    @Override
    public AnggotaKeluarga insertAnggotaKeluarga(AnggotaKeluarga anggotaKeluarga) {
        // TODO Auto-generated method stub
        return anggotaKeluargaRepository.insertAnggotaKeluarga(anggotaKeluarga);
    }

    @Override
    public List<AnggotaKeluarga> getAllAnggotaKeluarga() {
        // TODO Auto-generated method stub
        return anggotaKeluargaRepository.getAllAnggotaKeluarga();
    }

    @Override
    public AnggotaKeluarga updateAnggotaKeluarga(int id, AnggotaKeluarga anggotaKeluarga) {
        // TODO Auto-generated method stub
        return anggotaKeluargaRepository.updateAnggotaKeluarga(id, anggotaKeluarga);
    }

    @Override
    public AnggotaKeluarga deleteAnggotaKeluarga(int id) {
        // TODO Auto-generated method stub
        return anggotaKeluargaRepository.deleteAnggotaKeluarga(id);
    }

    @Override
    public AnggotaKeluarga getAnggotaKeluargaById(int id) {
        // TODO Auto-generated method stub
        return anggotaKeluargaRepository.getAnggotaKeluargaById(id);
    }

    @Override
    public List<AnggotaKeluarga> getAllAnggotaKeluargaByIdKK(int id_kk) {
        // TODO Auto-generated method stub
        return anggotaKeluargaRepository.getAllAnggotaKeluargaByIdKK(id_kk);
    }

}
