package com.example.ektp.service;

import java.util.List;

import com.example.ektp.model.AnggotaKeluarga;

public interface IAnggotaKeluargaService {
    public AnggotaKeluarga insertAnggotaKeluarga(AnggotaKeluarga anggotaKeluarga);

    public List<AnggotaKeluarga> getAllAnggotaKeluarga();

    public AnggotaKeluarga updateAnggotaKeluarga(int id, AnggotaKeluarga anggotaKeluarga);

    public AnggotaKeluarga deleteAnggotaKeluarga(int id);

    public AnggotaKeluarga getAnggotaKeluargaById(int id);

    public List<AnggotaKeluarga> getAllAnggotaKeluargaByIdKK(int id_kk);
}
