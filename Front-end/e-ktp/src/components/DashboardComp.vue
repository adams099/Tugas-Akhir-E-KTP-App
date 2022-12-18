<template>
  <div>
    <!-- TABLE START -->
    <table class="table mt-3 table table-striped shadow" v-show="!success">
      <thead>
        <tr>
          <th scope="col">No</th>
          <th scope="col">Nomor KK</th>
          <th scope="col">Alamat</th>
          <th scope="col">Kota</th>
          <th scope="col">Kode Pos</th>
          <th scope="col">Action</th>
        </tr>
      </thead>
      <tbody v-if="kartuKeluargaData.length > 0">
        <tr v-for="(item, index) in kartuKeluargaData" :key="index">
          <th scope="row">{{ index + 1 }}</th>
          <td>{{ item.nomor_kk }}</td>
          <td>{{ item.alamat }}</td>
          <td>{{ item.kabupaten_kota }}</td>
          <td>{{ item.kode_pos }}</td>
          <td>
            <!-- BUTTON -->
            <router-link :to="{ path: '/detailKK/' + item.nomor_kk }">
              <button class="btn btn-success" type="submit">Detail</button>
            </router-link>

            <button class="btn btn-danger" type="submit" @click="deleteKK(item.id)">
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
    <!-- TABLE END -->
    <div v-show="success">
      <Success :propsAlert="textAlert"></Success>
    </div>
  </div>
</template>

<script>
import kartuKeluargaServices from "@/services/kkServices";
import Success from "./Success.vue";

export default {
  name: "DashboardS",
  data() {
    return {
      kartuKeluargaData: [],
      anggotaKeluargaData: [],
      success: false,
      textAlert: '',
    };
  },
  components: {
    Success
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

    // METHOD DELETE KK
    deleteKK(id) {
      if (confirm(`Yakin Ingin menghapus data ini ?`)) {
        kartuKeluargaServices
          .deleteKartuKeluarga(id)
          .then((response) => {
            console.log(response.data);
            this.textAlert = 'Dihapus';
            this.success = true;
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
        alert("Hapus Dibatalkan");
      }
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
  background-color: #ef7a85;
}

.card-1 {
  background-color: aquamarine;
  margin-right: 50px;
  width: 200px;
  height: 100px;
  padding: 10px 10px;
  color: rgb(130, 130, 130);
  border-radius: 20;
}

.card-2 {
  background-color: rgb(255, 189, 46);
  width: 200px;
  height: 100px;
  padding: 10px 10px;
  color: aliceblue;
}

table {
  border: 1px solid #f2f2f2;
  margin-left: 20px;
}
</style>