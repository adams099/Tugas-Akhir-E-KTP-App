<template>
    <div>
        <form action="" class="mt-3 p-4 shadow">
            <div class="d-flex">
                <div class="col-md-6 p-3">
                    <!-- Input KK -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="nik" class="col-form-label">NIK</label>
                        <input placeholder="Nomor Induk Keluarga" style="width: 50%" type="number" id="nik"
                            class="form-control" required />
                    </div>

                    <!-- Input KK -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="nama" class="col-form-label">Nama</label>
                        <input placeholder="Nama" style="width: 50%" type="text" id="nama" class="form-control"
                            required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="jenis_kelamin" class="col-form-label">Jenis Kelamin</label>
                        <input placeholder="Jenis Kelamin" style="width: 50%" type="text" id="jenis_kelamin"
                            class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="tempat_lahir" class="col-form-label">Tempat Lahir</label>
                        <input placeholder="Tempat Lahir" style="width: 50%" type="text" id="tempat_lahir"
                            class="form-control" required />
                    </div>

                </div>

                <div class="col-md-6 p-3">
                    <!-- Desa / Kelurahan -->
                    <div class="col-auto d-flex justify-content-between">
                        <label for="desa_kelurahan" class="col-form-label">Tanggal Lahir</label>
                        <input placeholder="Desa / Kelurahan" style="width: 50%" type="text" id="desa_kelurahan"
                            class="form-control" required />
                    </div>

                    <!-- Kecamatan -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kecamatan" class="col-form-label">Kecamatan</label>
                        <input placeholder="Kecamatan" style="width: 50%" type="text" id="kecamatan"
                            class="form-control" required />
                    </div>

                    <!-- Kabupaten / Kota -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kabupaten" class="col-form-label">Kabupaten / Kota</label>
                        <input placeholder="Kabupaten / Kota" style="width: 50%" type="text" id="kabupaten"
                            class="form-control" required />
                    </div>
                    <!-- Provinsi -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="provinsi" class="col-form-label">Provinsi</label>
                        <input placeholder="Provinsi" style="width: 50%" type="text" id="provinsi" class="form-control"
                            required />
                    </div>
                    <!-- Kode Pos -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kode_pos" class="col-form-label">Kode Pos</label>
                        <input placeholder="Kode Pos" style="width: 50%" type="number" id="kode_pos"
                            class="form-control" required />
                    </div>
                </div>
            </div>
            <!-- Button -->

            <button class="button-submit btn-success" type="submit">
                Update
            </button>
            <button class="button-submit" type="submit">
                Submit
            </button>
        </form>
    </div>
</template>

<script>
export default {
    name: "DetalFormAnggota",
    data() {
        return {
            anggotaData: {
                nik: null,
                agama: null,
                nama: null,
                jenis_kelamin: null,
                tempat_lahir: null,
                tanggal_lahir: null,
                pendidikan: null,
                kepala_keluarga: null,
                id_kk: null,
            }
        };
    },
}
</script>

<style>

</style>