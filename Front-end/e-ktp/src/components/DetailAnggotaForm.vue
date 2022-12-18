<template>
    <div>
        <!-- Button -->
        <!-- <router-link :to="`/detailKK/${anggotaData.id}/listAnggota`">
            <button class="btn btn-success mt-3 shadow">Back</button>
        </router-link> -->

        <button class="btn btn-warning mt-3 mx-2 text-white" type="submit" @click.prevent="updateFunc()">
            Edit
        </button>


        <form action="" class="mt-3 p-4 shadow" @submit.prevent="updateAnggotaFunc">
            <div class="d-flex">
                <div class="col-md-6 p-3">
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="nik" class="col-form-label">NIK</label>
                        <input :disabled="isReadOnly" v-model="anggotaData.nik" placeholder="Nomor Induk Keluarga"
                            style="width: 50%" type="number" id="nik" class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="nama" class="col-form-label">Nama</label>
                        <input :disabled="isReadOnly" v-model="anggotaData.nama" placeholder="Nama" style="width: 50%"
                            type="text" id="nama" class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="tempat_lahir" class="col-form-label">Tempat Lahir</label>
                        <input :disabled="isReadOnly" v-model="anggotaData.tempat_lahir" placeholder="Tempat Lahir"
                            style="width: 50%" type="text" id="tempat_lahir" class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="jenis_kelamin" class="col-form-label">Jenis Kelamin</label>
                        <select :disabled="isReadOnly" class="form-control" id="jenis_kelamin"
                            v-model="anggotaData.jenis_kelamin">
                            <option>Laki-Laki</option>
                            <option>Perempuan</option>
                        </select>
                    </div>
                </div>

                <div class="col-md-6 p-3">
                    <div class="col-auto d-flex justify-content-between">
                        <label for="desa_kelurahan" class="col-form-label">Tanggal Lahir</label>
                        <input :disabled="isReadOnly" v-model="anggotaData.tanggal_lahir" placeholder="Desa / Kelurahan"
                            style="width: 50%" type="date" id="desa_kelurahan" class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="agama" class="col-form-label">Agama</label>
                        <input :disabled="isReadOnly" v-model="anggotaData.agama" placeholder="Agama" style="width: 50%"
                            type="text" id="agama" class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="pendidikan" class="col-form-label">Pendidikan</label>
                        <input :disabled="isReadOnly" v-model="anggotaData.pendidikan" placeholder="pendidikan"
                            style="width: 50%" type="text" id="pendidikan" class="form-control" required />
                    </div>

                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kepala_keluarga" class="col-form-label">Kepala Keluarga</label>
                        <select :disabled="isReadOnly" class="form-control" id="kepala_keluarga"
                            v-model="anggotaData.kepala_keluarga">
                            <option>Yes</option>
                            <option>No</option>
                        </select>
                    </div>
                </div>
            </div>
            <!-- Button -->
            <button class="button-submit" type="submit">
                Update
            </button>
        </form>
    </div>
</template>

<script>
import anggotaKeluargaServices from '@/services/anggotaKeluargaServices';

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
            },
            isReadOnly: true,
        };
    },

    methods: {
        getAnggotaKeluargaById() {
            let id = this.$route.params.id;
            anggotaKeluargaServices
                .getAnggotaKeluargaById(id)
                .then((response) => {
                    this.anggotaData = response.data;
                    console.log(this.anggotaData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },

        updateAnggotaFunc() {
            let data = this.anggotaData;
            let id = this.$route.params.id;
            anggotaKeluargaServices
                .updateAnggotaKeluarga(id, data)
                .then((response) => {
                    console.log(response.data);
                })
                .catch((e) => {
                    console.log(e);
                });
        },

        updateFunc() {
            let update = this.isReadOnly;
            if (update == true) {
                this.isReadOnly = false;
            } else {
                this.isReadOnly = true;
            }
        },
    },

    mounted() {
        this.getAnggotaKeluargaById();
    }

}
</script>

<style>

</style>