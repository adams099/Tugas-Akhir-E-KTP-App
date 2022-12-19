<template>
    <div class="row">
        <div class="col col-md-3">
            <Sidebar></Sidebar>
        </div>
        <div class="col col-md-9">
            <h3 class="mt-4 title shadow">Detail Kartu Keluarga</h3>
            <Form></Form>
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
import Form from "../components/Form.vue";

export default {
    name: "DtailKk",
    components: {
        Sidebar,
        Footer,
        Form,
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