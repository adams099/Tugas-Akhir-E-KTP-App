<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9 ml-5">
            <h3 class="mt-4 title shadow">Detail Anggota Keluarga</h3>
            <DetailAnggota ml-4></DetailAnggota>
        </div>
        <div class="col col-md-3">
        </div>
        <div class="col col-md-9">
            <Footer></Footer>
        </div>
    </div>
</template>

<script>
import DetailAnggota from "../components/DetailAnggotaForm.vue";
import Sidebar from "../components/SidebarComp.vue";
import Footer from "../components/FooterComp.vue"
export default {
    name: "FormS",
    components: {
        DetailAnggota,
        Sidebar,
        Footer,
    }
};
</script>

<style scoped>
.title {
    padding: 10px 10px;
    border-radius: 15px;
    background-color: #c8b6ff;
    margin-left: 20px;
    color: aliceblue;
}
</style>