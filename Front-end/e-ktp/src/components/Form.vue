<template>
    <div class="form-add">
        <!-- Button -->
        <router-link to="/home" v-show="!success">
            <button class="btn btn-success mt-3 shadow">Back</button>
        </router-link>

        <button class="btn btn-warning mt-3 mx-2 text-white" type="submit"
            v-show="Butns == `/detailKK/${kartuKeluargaData.nomor_kk}`" @click.prevent="updateFunc()">
            Edit
        </button>

        <router-link :to="`/detailKK/${kartuKeluargaData.nomor_kk}/listAnggota`">
            <button class="btn btn-primary mt-3" v-show="Butns == `/detailKK/${kartuKeluargaData.nomor_kk}`">
                {{ btnDetail }}
            </button>
        </router-link>
        <!-- END BUTTON -->

        <!-- START FORM -->
        <form action="" class="mt-3 p-4 shadow" @submit.prevent="inputKartuKeluarga" v-show="!success">
            <div class="d-flex">
                <div class="col-md-6 p-3">
                    <!-- Input KK -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="nomorkk" class="col-form-label">Nomor Kartu Keluarga</label>
                        <input :disabled="kkNo" v-model="kartuKeluargaData.nomor_kk" placeholder="Nomor Kartu Keluarga"
                            style="width: 50%" type="number" id="nomorkk" class="form-control" required />
                    </div>

                    <!-- Alamat -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="textarea" class="col-form-label">Alamat</label>
                        <textarea :disabled="isReadOnly" v-model="kartuKeluargaData.alamat" placeholder="Alamat"
                            style="width: 50%" type="textarea" id="textarea" class="form-control" required />
                    </div>

                    <!-- RT -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="rt" class="col-form-label">RT</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.rt" placeholder="RT" style="width: 50%"
                            type="number" id="rt" class="form-control" required />
                    </div>

                    <!-- RW -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="rW" class="col-form-label">RW</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.rw" placeholder="RW" style="width: 50%"
                            type="number" id="rW" class="form-control" required />
                    </div>
                </div>
                <div class="col-md-6 p-3">
                    <!-- Desa / Kelurahan -->
                    <div class="col-auto d-flex justify-content-between">
                        <label for="desa_kelurahan" class="col-form-label">Desa / Kelurahan</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.desa_kelurahan"
                            placeholder="Desa / Kelurahan" style="width: 50%" type="text" id="desa_kelurahan"
                            class="form-control" required />
                    </div>

                    <!-- Kecamatan -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kecamatan" class="col-form-label">Kecamatan</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.kecamatan" placeholder="Kecamatan"
                            style="width: 50%" type="text" id="kecamatan" class="form-control" required />
                    </div>

                    <!-- Kabupaten / Kota -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kabupaten" class="col-form-label">Kabupaten / Kota</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.kabupaten_kota"
                            placeholder="Kabupaten / Kota" style="width: 50%" type="text" id="kabupaten"
                            class="form-control" required />
                    </div>
                    <!-- Provinsi -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="provinsi" class="col-form-label">Provinsi</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.provinsi" placeholder="Provinsi"
                            style="width: 50%" type="text" id="provinsi" class="form-control" required />
                    </div>
                    <!-- Kode Pos -->
                    <div class="col-auto d-flex justify-content-between my-3">
                        <label for="kode_pos" class="col-form-label">Kode Pos</label>
                        <input :disabled="isReadOnly" v-model="kartuKeluargaData.kode_pos" placeholder="Kode Pos"
                            style="width: 50%" type="number" id="kode_pos" class="form-control" required />
                    </div>
                </div>
            </div>
            <!-- Button -->
            <button class="button-submit" type="submit" v-show="Butns == '/addkk'">
                {{ buttonValue }}
            </button>
            <button class="button-submit" type="submit" v-show="Butns == `/detailKK/${kartuKeluargaData.nomor_kk}`">
                {{ buttonValue }}
            </button>
        </form>
        <!-- END FORM -->

        <!-- Alert Sucess Submit -->
        <div class="" v-show="success">
            <Success :propsAlert="textAlert"></Success>
        </div>
    </div>
</template>

<script>
import kartuKeluargaService from "../services/kkServices";
import Success from "../components/Success.vue";
export default {
    name: "FormS",
    components: {
        Success,
    },
    data() {
        return {
            kartuKeluargaData: {
                alamat: null,
                desa_kelurahan: null,
                kabupaten_kota: null,
                kecamatan: null,
                kode_pos: null,
                nomor_kk: null,
                provinsi: null,
                rt: null,
                rw: null,
            },
            Butns: this.$route.path,
            buttonValue: "Submit",
            success: false,
            isReadOnly: true,
            kkNo: true,
            btnDetail: 'Tambah',
            showBtn: false,
            textAlert: '',
        };
    },
    methods: {
        inputKartuKeluarga() {
            let data = this.kartuKeluargaData;
            let id = this.kartuKeluargaData.id;
            let route = this.$route.fullPath;
            if (route === "/addkk") {
                kartuKeluargaService
                    .create(data)
                    .then((response) => {
                        console.log(response.data);
                        this.success = true;
                        this.textAlert = 'Disubmit';
                    })
                    .catch((e) => {
                        console.log(e);
                    });
            } else {
                kartuKeluargaService
                    .updateKartuKeluarga(id, data)
                    .then((response) => {
                        console.log(response.data);
                        this.success = true;
                        this.textAlert = 'Diupdate';
                    })
                    .catch((e) => {
                        console.log(e);
                    });
            }
        },
        updateFunc() {
            let update = this.isReadOnly;
            if (update == true) {
                this.isReadOnly = false;
            } else {
                this.isReadOnly = true;
            }
        },
        getKartuKelurgaByNokk() {
            let nomor_kk = this.$route.params.no_kk;
            if (nomor_kk > 0) {
                this.buttonValue = "Update";
            }
            kartuKeluargaService
                .getKartuKelurgaByNokk(nomor_kk)
                .then((response) => {
                    this.kartuKeluargaData = response.data;
                    console.log(this.kartuKeluargaData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },
    },
    mounted() {
        if (this.$route.params.no_kk > 0) {
            this.getKartuKelurgaByNokk();
            this.btnDetail = 'Lihat Anggota'
        } else if (this.btnDetail == 'Tambah') {
            this.isReadOnly = false;
            this.kkNo = false;
        }
    },
};
</script>

<style scoped>
form {
    border: 1px solid #8e94f2;
    border-radius: 20px;
}

.btn-success {
    background-color: #8e94f2;
    padding: 6px 10px;
    border-radius: 7px;
    border: none;
}

.button-submit {
    background-color: #8e94f2;
    color: aliceblue;
    border: none;
    border-radius: 7px;
    padding: 7px 10px;
}

.form-add {
    margin-left: 20px;
}
</style>