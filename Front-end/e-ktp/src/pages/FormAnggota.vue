<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9 ml-5">
            <Breadcump></Breadcump>
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
import Breadcump from "@/components/Breadcump.vue";

export default {
    name: "FormS",
    components: {
        Sidebar,
        Breadcump,
        Footer,
    }
};
</script>

<style>

</style>