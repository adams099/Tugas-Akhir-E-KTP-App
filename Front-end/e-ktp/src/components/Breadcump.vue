<template>
    <div>
        <h3 class="mt-4 shadow title" v-show="breadLink == '/home'">Homepage</h3>
        <h3 class="mt-4 title shadow" v-show="breadLink == '/addkk'">Tambah Kartu Keluarga</h3>
        <h3 class="mt-4 title shadow" v-show="breadLink == '/anggota'">Daftar Anggota Keluarga</h3>
    </div>
</template>

<script>
export default {
    name: 'breadCumpCom',

    data() {
        return {
            breadLink: this.$route.path
        }
    }
}
</script>

<style scope>
.title {
    padding: 10px 10px;
    border-radius: 15px;
    background-color: #c8b6ff;
    margin-left: 20px;
    color: aliceblue;
}
</style>