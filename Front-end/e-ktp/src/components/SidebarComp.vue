<template>
  <div>
    <div class="side">
      <div class="sidebar d-flex flex-column">
        <div>
          <h1 class="e-ktp d-flex justify-content-around py-3">
            <p class="pt-2">E-KTP</p>
          </h1>
        </div>

        <hr />

        <div class="menu">
          <router-link to="/home" class="nav-link">
            <div>
              <h6 class="text-white home d-flex">
                <span id="home">
                  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                    class="bi bi-ui-checks-grid" viewBox="0 0 16 16">
                    <path
                      d="M2 10h3a1 1 0 0 1 1 1v3a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1v-3a1 1 0 0 1 1-1zm9-9h3a1 1 0 0 1 1 1v3a1 1 0 0 1-1 1h-3a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1zm0 9a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h3a1 1 0 0 0 1-1v-3a1 1 0 0 0-1-1h-3zm0-10a2 2 0 0 0-2 2v3a2 2 0 0 0 2 2h3a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2h-3zM2 9a2 2 0 0 0-2 2v3a2 2 0 0 0 2 2h3a2 2 0 0 0 2-2v-3a2 2 0 0 0-2-2H2zm7 2a2 2 0 0 1 2-2h3a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2h-3a2 2 0 0 1-2-2v-3zM0 2a2 2 0 0 1 2-2h3a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V2zm5.354.854a.5.5 0 1 0-.708-.708L3 3.793l-.646-.647a.5.5 0 1 0-.708.708l1 1a.5.5 0 0 0 .708 0l2-2z" />
                  </svg>
                </span>
                <p class="pt-2">Home</p>
              </h6>
            </div>
          </router-link>

          <router-link to="/addkk" class="nav-link">
            <div>
              <h6 class="text-white tambah-kk d-flex">
                <span>
                  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                    class="bi bi-newspaper" viewBox="0 0 16 16">
                    <path
                      d="M0 2.5A1.5 1.5 0 0 1 1.5 1h11A1.5 1.5 0 0 1 14 2.5v10.528c0 .3-.05.654-.238.972h.738a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 1 1 0v9a1.5 1.5 0 0 1-1.5 1.5H1.497A1.497 1.497 0 0 1 0 13.5v-11zM12 14c.37 0 .654-.211.853-.441.092-.106.147-.279.147-.531V2.5a.5.5 0 0 0-.5-.5h-11a.5.5 0 0 0-.5.5v11c0 .278.223.5.497.5H12z" />
                    <path
                      d="M2 3h10v2H2V3zm0 3h4v3H2V6zm0 4h4v1H2v-1zm0 2h4v1H2v-1zm5-6h2v1H7V6zm3 0h2v1h-2V6zM7 8h2v1H7V8zm3 0h2v1h-2V8zm-3 2h2v1H7v-1zm3 0h2v1h-2v-1zm-3 2h2v1H7v-1zm3 0h2v1h-2v-1z" />
                  </svg>
                </span>
                <p class="pt-2">Tambah KK</p>
              </h6>
            </div>
          </router-link>

          <router-link to="/anggota" class="nav-link">
            <div>
              <h6 class="text-white daftar-anggota d-flex">
                <span>
                  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                    class="bi bi-person-video2" viewBox="0 0 16 16">
                    <path d="M10 9.05a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5Z" />
                    <path
                      d="M2 1a2 2 0 0 0-2 2v9a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V3a2 2 0 0 0-2-2H2ZM1 3a1 1 0 0 1 1-1h2v2H1V3Zm4 10V2h9a1 1 0 0 1 1 1v9c0 .285-.12.543-.31.725C14.15 11.494 12.822 10 10 10c-3.037 0-4.345 1.73-4.798 3H5Zm-4-2h3v2H2a1 1 0 0 1-1-1v-1Zm3-1H1V8h3v2Zm0-3H1V5h3v2Z" />
                  </svg>
                </span>
                <p class="pt-2">Daftar Anggota</p>
              </h6>
            </div>
          </router-link>
        </div>

        <div class="mt-auto mb-3">
          <router-link to="/" class="nav-link">
            <h4 class="text-white d-flex">
              <span id="logout">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                  class="bi bi-box-arrow-left" viewBox="0 0 16 16">
                  <path fill-rule="evenodd"
                    d="M6 12.5a.5.5 0 0 0 .5.5h8a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5h-8a.5.5 0 0 0-.5.5v2a.5.5 0 0 1-1 0v-2A1.5 1.5 0 0 1 6.5 2h8A1.5 1.5 0 0 1 16 3.5v9a1.5 1.5 0 0 1-1.5 1.5h-8A1.5 1.5 0 0 1 5 12.5v-2a.5.5 0 0 1 1 0v2z" />
                  <path fill-rule="evenodd"
                    d="M.146 8.354a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L1.707 7.5H10.5a.5.5 0 0 1 0 1H1.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3z" />
                </svg>
              </span>
              <p class="pt-3 pb-3">Logout</p>
            </h4>
          </router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "SidebarS",
};
</script>

<!-- CSS -->
<style scoped>
span {
  margin-right: 10px;
  padding-bottom: 5px;
}

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.sidebar {
  width: 300px;
  height: 95%;
  background: linear-gradient(-135deg, #c850c0, #4158d0);
  box-shadow: 0 4px 15px 0 rgba(66, 67, 67, 0.436);
  border-radius: 20px;
  margin-top: 25px;
  margin-left: 20px;
  position: fixed;
}


hr {
  background-color: rgb(255, 255, 255);
  padding: 5px;
  margin-top: 15px;
  margin-bottom: 10px;
  border: none;
}

svg {
  width: 50px;
  height: auto;
  margin-right: 10px;
}

.menu div {
  margin-left: 20px;
  margin-top: 30px;
}

h4 {
  margin-left: 20px;
}

svg {
  width: 30px;
  height: auto;
}

.home {
  padding: 5px 5px;
  border-radius: 10px 0px 0px 10px;
}

.home:hover {
  background-color: #5F9DF7;
  cursor: pointer;
}

.tambah-kk {
  padding: 5px 5px;
  border-radius: 10px 0px 0px 10px;
}

.tambah-kk:hover {
  background-color: #5F9DF7;
  cursor: pointer;
}

.daftar-anggota {
  padding: 5px 5px;
  border-radius: 10px 0px 0px 10px;
}

.daftar-anggota:hover {
  background-color: #5F9DF7;
  cursor: pointer;
}

.router-link-exact-active {
  background-color: #5F9DF7;
  border-radius: 10px 0px 0px 10px;
  cursor: pointer;
}

h4 .text-white mt-auto mb-3:hover {
  background-color: #5F9DF7;
  padding: 5px 5px 5px 5px;
  border-radius: 10px 0px 0px 10px;
}


div .mt-auto:hover {
  background-color: #5F9DF7;
  cursor: pointer;
}

/* Material Icon */
#home {
  font-size: 15px;
}

#logout {
  font-size: 40px;
}

.e-ktp {
  color: white;
}
</style>