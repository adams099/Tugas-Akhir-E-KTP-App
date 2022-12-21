<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9 ml-5">
            <Title></Title>
            <DetailAnggota></DetailAnggota>
        </div>
        <div class="col col-md-3">
        </div>
        <div class="col col-md-9">
            <Footer></Footer>
        </div>
    </div>
</template>

<script>
import DetailAnggota from "../components/FormDetailAnggotaComp.vue";
import Sidebar from "../components/SidebarComp.vue";
import Footer from "../components/FooterComp.vue"
import Title from "@/components/TitleComp.vue";

export default {
    name: "PageDetailAkForm",
    components: {
        DetailAnggota,
        Sidebar,
        Footer,
        Title,
    }
};
</script>

<style scoped>

</style>