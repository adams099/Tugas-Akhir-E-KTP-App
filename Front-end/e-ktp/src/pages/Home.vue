<template>
  <div class="row">
    <div class="col col-md-3">
      <Sidebar></Sidebar>
    </div>
    <div class="col col-md-9 dashboard">
      <breadCump></breadCump>
      <Card></Card>
      <Dashboard></Dashboard>
    </div>
    <div class="col col-md-3"></div>
    <div class="col col-md-9">
      <Footer class="mt-3 shadow"></Footer>
    </div>
  </div>
</template>

<script>
import Sidebar from "../components/SidebarComp.vue";
import Dashboard from "../components/DashboardComp.vue";
import Footer from "../components/FooterComp.vue";
import breadCump from "../components/Breadcump.vue";
import Card from "../components/Card.vue";

export default {
  name: "DashboardS",
  components: {
    Sidebar,
    Dashboard,
    Footer,
    breadCump,
    Card,
  },
};
</script>

<style>

</style>