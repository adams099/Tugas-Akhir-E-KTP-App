package com.example.ektp.service;

import java.util.List;

import com.example.ektp.model.KartuKeluarga;

public interface IKartuKeluargaService {
    public KartuKeluarga insertKartuKeluarga(KartuKeluarga kartuKeluarga);

    public List<KartuKeluarga> getAllKartuKeluarga();

    public KartuKeluarga updateKartuKeluarga(int id, KartuKeluarga kartuKeluarga);

    public KartuKeluarga deleteKartuKeluarga(int id);

    public KartuKeluarga getKartuKeluargaById(int id);

    public KartuKeluarga getKartuKeluargaByNokk(int nomor_kk);
}
