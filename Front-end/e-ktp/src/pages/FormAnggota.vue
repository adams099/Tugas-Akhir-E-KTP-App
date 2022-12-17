<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9 ml-5">
            <Breadcump></Breadcump>
            <Anggota></Anggota>
            <Footer></Footer>
        </div>
    </div>
</template>

<script>
import Anggota from "../components/AnggotaComp.vue";
import Sidebar from "../components/SidebarComp.vue";
import Footer from "../components/FooterComp.vue";
import Breadcump from "@/components/Breadcump.vue";

export default {
    name: "FormS",
    components: {
        Anggota,
        Sidebar,
        Breadcump,
        Footer,
    }
};
</script>

<style>

</style>