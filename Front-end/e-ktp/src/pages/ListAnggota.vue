<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9 ml-5">
            <Title></Title>
            <Anggota></Anggota>
        </div>
        <div class="col col-md-3"></div>
        <div class="col col-md-9">
            <Footer></Footer>
        </div>
    </div>
</template>

<script>
import Anggota from "../components/AnggotaComp.vue";
import Sidebar from "../components/SidebarComp.vue";
import Footer from "../components/FooterComp.vue";
import Title from "@/components/TitleComp.vue";

export default {
    name: "ListAnggota",
    components: {
        Anggota,
        Sidebar,
        Footer,
        Title,
    }
};
</script>

<style scoped>

</style>