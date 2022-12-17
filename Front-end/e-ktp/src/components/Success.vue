<template>
    <div class="d-flex justify-content-around">
        <div class="cards shadow mt-5 text-center">
            <div class="card-body ">
                <h4 class="card-title mb-1">Success!</h4>
                <p class="card-text">Data Berhasil {{ propsAlert }} !</p>

                <router-link to="/home" v-if="propsAlert === 'Disubmit'">
                    <button class="back btn btn-primary mt-3">Back</button>
                </router-link>

                <router-link :to="{ path: '/detailKK/' + this.$route.params.no_kk + '/listAnggota/' }"
                    v-else-if="propsAlertt === 'Disubmit'">
                    <button class="back btn btn-primary mt-3" @click="RefreshFunc">Backk</button>
                </router-link>

                <router-link to="/home" v-else-if="propsAlert === 'Dihapus'">
                    <button class="back btn btn-primary mt-3" @click="RefreshFunc">Refles</button>
                </router-link>
                <router-link to="/home" v-elss>
                    <!-- <button class="back btn btn-primary mt-3" @click="RefreshFunc">Refles</button> -->
                </router-link>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "SuccesS",
    data() {
        return {
        }
    },
    methods: {
        RefreshFunc() {
            location.reload();
        },
    },
    props: [
        'propsAlert', 'propsAlertt'
    ],
}
</script>

<style scoped>
.cards {
    border: 1px solid #25AAE1;
    padding: 15px 15px;
    border-radius: 15px;
    margin-top: 15px;
    width: 50%;
}

.btn-primary {
    background-color: #25AAE1;
}
</style>