package com.example.ektp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ektp.model.KartuKeluarga;
import com.example.ektp.repository.IKartuKeluargaRepository;
import com.example.ektp.service.IKartuKeluargaService;

@Service
public class KartuKeluargaService implements IKartuKeluargaService {
    @Autowired
    IKartuKeluargaRepository kartuKeluargaRepository;

    @Override
    public KartuKeluarga insertKartuKeluarga(KartuKeluarga kartuKeluarga) {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.insertKartuKeluarga(kartuKeluarga);
    }

    @Override
    public List<KartuKeluarga> getAllKartuKeluarga() {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.getAllKartuKeluarga();
    }

    @Override
    public KartuKeluarga updateKartuKeluarga(int id, KartuKeluarga kartuKeluarga) {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.updateKartuKeluarga(id, kartuKeluarga);
    }

    @Override
    public KartuKeluarga deleteKartuKeluarga(int id) {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.deleteKartuKeluarga(id);
    }

    @Override
    public KartuKeluarga getKartuKeluargaById(int id) {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.getKartuKeluargaById(id);
    }

    @Override
    public KartuKeluarga getKartuKeluargaByNokk(int nomor_kk) {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.getKartuKeluargaByNokk(nomor_kk);
    }

    @Override
    public KartuKeluarga deleteKartuKeluargaByNoKk(int nomor_kk) {
        // TODO Auto-generated method stub
        return kartuKeluargaRepository.deleteKartuKeluargaByNoKk(nomor_kk);
    }
}
