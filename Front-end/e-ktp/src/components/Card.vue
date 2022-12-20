<template>
    <div class="cards">
        <div class="jkk shadow">
            <p class="text mt-2">Jumlah Kartu Keluarga</p>
            <p class="angka mt-2">{{ kartuKeluargaData.length }}</p>
        </div>

        <div class="jsw shadow">
            <p class="text mt-2">Jumlah Seluruh Warga</p>
            <p class="angka mt-2">{{ anggotaKeluargaData.length }}</p>
        </div>
    </div>
</template>

<script>
import kartuKeluargaServices from '@/services/kkServices'
import anggotaKeluargaServices from '@/services/anggotaKeluargaServices';

export default {
    name: "cardCom",

    data() {
        return {
            kartuKeluargaData: [],
            anggotaKeluargaData: [],
        };
    },

    methods: {
        // METHOD GET ALL DATA KK
        getKK() {
            kartuKeluargaServices.getAll()
                .then((response) => {
                    this.kartuKeluargaData = response.data;
                    console.log(this.kartuKeluargaData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },

        // METHOD GET ALL ANGGOTA
        getAnggota() {
            anggotaKeluargaServices.getAll()
                .then((response) => {
                    this.anggotaKeluargaData = response.data;
                    console.log(this.anggotaKeluargaData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },

    },

    mounted() {
        this.getKK();
        this.getAnggota()
    },
}
</script>

<style scoped>
.cards {
    display: flex;
    flex-direction: row;
    margin-top: 25px;
    justify-content: flex-start;
    margin-left: 10px;
}

.jkk {
    background: linear-gradient(-135deg, #FF8066, #D65DB1);
    color: rgb(59, 59, 59);
    margin-right: 20px;
    width: 270px;
    height: 150px;
    padding: 20px 20px;
    border-radius: 20px;
    color: aliceblue;
}

.jsw {
    background: linear-gradient(-135deg, #FF9671, #D65DB1);
    color: aliceblue;
    width: 270px;
    height: 150px;
    padding: 20px 20px;
    border-radius: 20px;
}

.jsa {
    background-color: rgb(65, 67, 111);
    color: aliceblue;
    width: 270px;
    height: 150px;
    padding: 20px 20px;
    border-radius: 20px;
}

.text {
    font-size: 20px;
}

.angka {
    font-size: 50px;
}
</style>