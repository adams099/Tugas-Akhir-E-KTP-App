<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9 ml-5">
            <Title></Title>
            <ListAnggota></ListAnggota>
        </div>
        <div class="col col-md-3"></div>
        <div class="col col-md-9">
            <Footer></Footer>
        </div>
    </div>
</template>

<script>
import Sidebar from "../components/SidebarComp.vue";
import Footer from "../components/FooterComp.vue";
import ListAnggota from "@/components/ListAnggotaComp.vue";
import Title from "@/components/TitleComp.vue";

export default {
    name: "DaftarAnggota",
    components: {
        Sidebar,
        Footer,
        ListAnggota,
        Title
    }
};
</script>

<style scoped>

</style>