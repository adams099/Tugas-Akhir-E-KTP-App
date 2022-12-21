<template>
    <div class="d-flex justify-content-around">
        <div class="cards shadow mt-5 text-center">
            <div class="card-body ">
                <h4 class="card-title mb-1 text-white">Success!</h4>
                <p class="card-text text-white">Data Berhasil {{ propsAlert }} !</p>

                <router-link to="/home" v-if="propsAlert === 'Disubmit'">
                    <button class="btn btn-primary mt-3">Back</button>
                </router-link>

                <router-link to="/home" v-else-if="propsAlert === 'Diupdate'">
                    <button class="btn btn-primary mt-3">Back</button>
                </router-link>

                <router-link :to="{ path: '/detailKK/' + this.$route.params.no_kk + '/listAnggota/' }"
                    v-else-if="propsAlert === 'Disubmit '">
                    <button class="btn btn-primary mt-3" @click="RefreshFunc">Back</button>
                </router-link>

                <router-link :to="{ path: '/detailKK/' + this.$route.params.id + '/listAnggota/detailAnggota' }"
                    v-else-if="propsAlert === 'Diupdate '">
                    <button class="btn btn-primary mt-3" @click="RefreshFunc">Back</button>
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
        'propsAlert'
    ],
}
</script>

<style scoped>
.cards {
    border-radius: 15px;
    border: 10px solid transparent;
    background: linear-gradient(45deg, red, blue) border-box;
    -webkit-mask-composite: xor;

    mask-composite: exclude;
    margin-top: 15px;
    width: 90%;
}

.btn-primary {
    background-color: #5F9DF7;
    border: none;
}
</style>