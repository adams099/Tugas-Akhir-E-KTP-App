<template>
  <div>
    <div v-show="!success">
      <!-- Button -->
      <router-link :to="{ path: '/detailKK/' + anggotaData.id_kk + '/listAnggota' }">
        <button class="btn btn-primary mt-3 shadow">Back</button>
      </router-link>

      <button class="btn btn-warning mt-3 mx-2 text-white" type="submit" @click.prevent="updateFunc()">
        Edit
      </button>

      <!-- Start Form Detail Anggota -->
      <form action="" class="mt-3 p-4 shadow" @submit.prevent="updateAnggotaFunc">
        <div class="d-flex">
          <!-- INPUT KIRI -->
          <div class="col-md-6 p-3">
            <!-- NIK -->
            <div class="col-auto d-flex justify-content-between my-3">
              <label for="nik" class="col-form-label">NIK</label>
              <input disabled v-model="anggotaData.nik" placeholder="Nomor Induk Keluarga" style="width: 50%"
                type="number" id="nik" class="form-control input-field" required />
            </div>

            <!-- NAMA -->
            <div class="col-auto d-flex justify-content-between my-3">
              <label for="nama" class="col-form-label">Nama</label>
              <input :disabled="isReadOnly" v-model="anggotaData.nama" placeholder="Nama" style="width: 50%" type="text"
                id="nama" class="form-control" required />
            </div>

            <!-- TEMPAT LAHIR -->
            <div class="col-auto d-flex justify-content-between my-3">
              <label for="tempat_lahir" class="col-form-label">Tempat Lahir</label>
              <input :disabled="isReadOnly" v-model="anggotaData.tempat_lahir" placeholder="Tempat Lahir"
                style="width: 50%" type="text" id="tempat_lahir" class="form-control" required />
            </div>

            <!-- JENIS KELAMIN -->
            <div class="d-flex justify-content-between">
              <label for="jenis_kelamin" class="col-form-label">Jenis Kelamin</label>
              <select :disabled="isReadOnly" class="form-control jenis_kelamin" id="jenis_kelamin"
                v-model="anggotaData.jenis_kelamin">
                <option>Laki-Laki</option>
                <option>Perempuan</option>
              </select>
            </div>
          </div>

          <!--INPUT KANAN  -->
          <div class="col-md-6 p-3 mt-2">
            <!-- TANGGAL LAHIR -->
            <div class="col-auto d-flex justify-content-between">
              <label for="desa_kelurahan" class="col-form-label">Tanggal Lahir</label>
              <input :disabled="isReadOnly" v-model="anggotaData.tanggal_lahir" placeholder="Desa / Kelurahan"
                style="width: 50%" type="date" id="desa_kelurahan" class="form-control" required />
            </div>

            <!-- AGAMA -->
            <div class="col-auto d-flex justify-content-between my-3">
              <label for="agama" class="col-form-label">Agama</label>
              <select :disabled="isReadOnly" class="form-control agama" id="jenis_kelamin" v-model="anggotaData.agama">
                <option>Islam</option>
                <option>Kristen</option>
                <option>Katolik</option>
                <option>Hindu</option>
                <option>Budha</option>
                <option>Konghucu</option>
              </select>
            </div>

            <!-- PENDIDIKAN -->
            <div class="col-auto d-flex justify-content-between my-3">
              <label for="pendidikan" class="col-form-label">Pendidikan</label>
              <input :disabled="isReadOnly" v-model="anggotaData.pendidikan" placeholder="pendidikan" style="width: 50%"
                type="text" id="pendidikan" class="form-control" required />
            </div>

            <!-- KEPALA KELUARGA -->
            <div class="d-flex justify-content-between">
              <label for="kepala_keluarga" class="col-form-label">Kepala Keluarga</label>
              <select :disabled="isReadOnly" class="form-control kepala_keluarga" id="kepala_keluarga"
                v-model="anggotaData.kepala_keluarga">
                <option>Yes</option>
                <option>No</option>
              </select>
            </div>
          </div>
        </div>

        <!-- Button -->
        <button class="button-update" type="submit" v-show="btnUpdate">
          Update
        </button>
      </form>
    </div>
    <!-- End Form Detail Anggota -->

    <div v-show="success">
      <Success :propsAlert="textAlert"></Success>
    </div>
  </div>
</template>

<script>
import anggotaKeluargaServices from "@/services/anggotaKeluargaServices";
import Success from "./Success.vue";

export default {
  name: "DetalFormAnggota",

  components: {
    Success,
  },

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
      success: false,
      textAlert: "",
      btnUpdate: false,
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
          this.success = true;
          this.textAlert = "Diupdate ";
        })
        .catch((e) => {
          console.log(e);
        });
    },

    updateFunc() {
      let update = this.isReadOnly;
      if (update == true) {
        this.isReadOnly = false;
        this.btnUpdate = true;
      } else {
        this.isReadOnly = true;
        this.btnUpdate = false;
      }
    },
  },

  mounted() {
    this.getAnggotaKeluargaById();
  },
};
</script>

<style scoped>
form {
  border-radius: 25px;
}

.btn-primary {
  background-color: #25AAE1;
  border: none;
}

.button-update {
  background-color: #25aae1;
  border: none;
  border-radius: 5px;
  color: white;
  padding: 7px 7px 7px 7px;
}

.jenis_kelamin,
.agama,
.kepala_keluarga {
  width: 257px;
  height: 38px;
}
</style>
