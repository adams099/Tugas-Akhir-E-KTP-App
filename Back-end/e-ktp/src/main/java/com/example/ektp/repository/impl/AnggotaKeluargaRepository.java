package com.example.ektp.repository.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ektp.model.AnggotaKeluarga;
import com.example.ektp.repository.IAnggotaKeluargaRepository;

@Repository
public class AnggotaKeluargaRepository implements IAnggotaKeluargaRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public AnggotaKeluarga insertAnggotaKeluarga(AnggotaKeluarga anggotaKeluarga) {
        // TODO Auto-generated method stub
        String query = "INSERT INTO tb_anggota_keluarga(agama, id_kk, jenis_kelamin, kepala_keluarga, nama, nik, pendidikan, tanggal_lahir, tempat_lahir) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query,
                new Object[] { anggotaKeluarga.getAgama(), anggotaKeluarga.getId_kk(),
                        anggotaKeluarga.getJenis_kelamin(), anggotaKeluarga.getKepala_keluarga(),
                        anggotaKeluarga.getNama(),
                        anggotaKeluarga.getNik(), anggotaKeluarga.getPendidikan(), anggotaKeluarga.getTanggal_lahir(),
                        anggotaKeluarga.getTempat_lahir() });
        return anggotaKeluarga;
    }

    @Override
    public List<AnggotaKeluarga> getAllAnggotaKeluarga() {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_anggota_keluarga ORDER BY id_kk ASC";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(AnggotaKeluarga.class));
    }

    @Override
    public AnggotaKeluarga updateAnggotaKeluarga(int id, AnggotaKeluarga anggotaKeluarga) {
        // TODO Auto-generated method stub
        String query = "UPDATE tb_anggota_keluarga SET agama  = ?, id_kk  = ?, jenis_kelamin  = ?, kepala_keluarga  = ?, nama  = ?, nik  = ?, pendidikan  = ?, tanggal_lahir  = ?, tempat_lahir  = ? WHERE id = ?";

        jdbcTemplate.update(query,
                new Object[] { anggotaKeluarga.getAgama(), anggotaKeluarga.getId_kk(),
                        anggotaKeluarga.getJenis_kelamin(), anggotaKeluarga.getKepala_keluarga(),
                        anggotaKeluarga.getNama(),
                        anggotaKeluarga.getNik(), anggotaKeluarga.getPendidikan(), anggotaKeluarga.getTanggal_lahir(),
                        anggotaKeluarga.getTempat_lahir(), id });

        return anggotaKeluarga;
    }

    @Override
    public AnggotaKeluarga deleteAnggotaKeluarga(int id) {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_anggota_keluarga WHERE id = ?";
        var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(AnggotaKeluarga.class), id);

        query = "DELETE FROM tb_anggota_keluarga WHERE id = ?";
        jdbcTemplate.update(query, id);

        return result;
    }

    @Override
    public AnggotaKeluarga getAnggotaKeluargaById(int id) {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_anggota_keluarga WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(AnggotaKeluarga.class), id);
    }

    @Override
    public List<AnggotaKeluarga> getAllAnggotaKeluargaByIdKK(int id_kk) {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_anggota_keluarga WHERE id_kk = ?";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(AnggotaKeluarga.class), id_kk);
    }

}
