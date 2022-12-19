<template>
    <div>
        <LoginRegis></LoginRegis>
        <Footer></Footer>
    </div>
</template>

<script>
import LoginRegis from "@/components/LoginRegisComp.vue";
import Footer from "@/components/FooterComp.vue";
export default {
    name: "registerPage",
    components: {
        LoginRegis,
        Footer,
    },
};
</script>

<style>

</style>