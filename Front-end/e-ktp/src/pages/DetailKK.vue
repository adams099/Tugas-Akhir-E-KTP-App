<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9">
            <Title></Title>
            <FormKk></FormKk>
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
import FormKk from "../components/FormKkComp.vue";
import Title from "@/components/TitleComp.vue";

export default {
    name: "DtailKk",
    components: {
        Sidebar,
        Footer,
        FormKk,
        Title,
    }
};
</script>

<style scoped>
</style>