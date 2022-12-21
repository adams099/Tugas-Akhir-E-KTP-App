<template>
  <div>
    <div>
      <h5 class="mt-5 mb-2">Daftar Kartu Kelurga</h5>

      <!-- TABLE START -->
      <table class="table mt-3 table table-striped shadow">
        <thead>
          <tr>
            <th scope="col" class="text-center">No</th>
            <th scope="col">Nomor KK</th>
            <th scope="col">Alamat</th>
            <th scope="col">Kota</th>
            <th scope="col">Kode Pos</th>
            <th scope="col" class="text-center">Action</th>
          </tr>
        </thead>
        <tbody v-if="kartuKeluargaData.length > 0">
          <tr v-for="(item, index) in kartuKeluargaData" :key="index">
            <th scope="row" class="text-center">{{ index + 1 }}</th>
            <td>{{ item.nomor_kk }}</td>
            <td>{{ item.alamat }}</td>
            <td>{{ item.kabupaten_kota }}</td>
            <td>{{ item.kode_pos }}</td>
            <td class="text-center">
              <!-- BUTTON -->
              <router-link :to="{ path: '/detailKK/' + item.nomor_kk }">
                <button class="btn btn-success" type="submit">Detail</button>
              </router-link>

              <button class="btn btn-danger" type="submit" @click="deleteKK(item.nomor_kk)">
                Hapus
              </button>
            </td>
          </tr>
        </tbody>
        <tbody v-else>
          <tr class="msg-tr text-center">
            <td colspan="6" class="msg-null">
              <h3>Saat ini Tidak Ada Data Kartu Keluarga !</h3>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <!-- TABLE END -->

  </div>
</template>

<script>
import kartuKeluargaServices from "@/services/kkServices";
import anggotaKeluargaServices from '@/services/anggotaKeluargaServices';

export default {
  name: "DashboardS",

  data() {
    return {
      kartuKeluargaData: [],
      anggotaKeluargaData: [],
      textAlert: '',
    };
  },

  methods: {
    // METHOD GET ALL DATA KK
    getKK() {
      kartuKeluargaServices
        .getAll()
        .then((response) => {
          this.kartuKeluargaData = response.data;
          console.log(this.kartuKeluargaData);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    // METHOD DELETE KK Sweetalert
    deleteKK(nomor_kk) {
      let id_kk = nomor_kk;

      this.$swal({
        title: 'Delete',
        text: 'Apakah anda Yakin Menghapus data kartu Keluarga',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonText: "Yes Delete it!",
        cancelButtonText: "No, keep it!",
        showLoaderConfirm: true,

      }).then((result) => {
        if (result.value) {
          this.$swal(
            "Delete",
            "Berhasil Menghapus data Kartu Keluarga!"

          ).then(function () {
            window.location.reload();
          });
          kartuKeluargaServices
            .deleteKartuKeluargaByNoKk(nomor_kk)
            .then((response) => {
              console.log(response.data);
              anggotaKeluargaServices
                .deleteAnggotaKeluargaByNoKk(id_kk)
                .then((response) => {
                  console.log(response.data);
                })
                .catch((e) => {
                  console.log(e);
                });
            })
            .catch((e) => {
              console.log(e);
            });

        } else {
          this.$swal("Batal", "Hapus Dibatalkan!");
        }

      })
    },
  },

  mounted() {
    this.getKK();
  },
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

h2 {
  margin-left: 20px;
}

/* Button */
.btn-success {
  padding: 5px 11px;
  margin-right: 10px;
  background-color: #92faa4;
  border: none;
}

.btn-danger {
  padding: 5px 13px;
  margin-right: 10px;
  border: none;
  background-color: #EF7A85;
}

table {
  border: 1px solid #f2f2f2;
}

h5 {
  border-left: 5px solid #7955CA;
  padding-left: 3px;
}
</style>