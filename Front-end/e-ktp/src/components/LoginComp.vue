<template>
  <div class="bg-login">
    <div class="login-card">
      <div class="row">
        <div class="col">
          <img class="mt-5" src="../assets/e-ktp.png" alt="" />
        </div>
        <div class="col d-flex flex-column col-kanan">
          <h4 class="mt-5">Selamat Datang</h4>
          <label for="email" class="col-form-label mt-4 mb-1">Email</label>
          <div class="col-sm-8">
            <input type="email" class="form-control py-1" id="email" placeholder=" Masukkan Email" required />
          </div>
          <label for="password" class="col-sm-2 col-form-label mt-2">Password</label>
          <div class="col-sm-8">
            <input type="password" class="form-control py-1 mt-2" id="password" placeholder=" Masukkan Password"
              required />
          </div>
          <div class="button">
            <button type="submit" class="button text-white d-flex">
              Masuk
            </button>
          </div>
          <div class="mt-3 small">
            <p>Belum punya akun?</p>
            <router-link to="/register">
              <a href="">Silahkan Daftar</a>
            </router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "LoginS",
};
</script>
<style scoped>
/* Poppins Font */
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500&display=swap");

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

.bg-login {
  background-color: rgb(65, 67, 111);
  width: 100vw;
  height: 100vh;
  display: flex;
  justify-content: space-around;
  align-items: center;
}

.login-card {
  width: 50%;
  height: 70%;
  background-color: aliceblue;
  flex-direction: row;
  border-radius: 25px;
}

.col img {
  width: 100%;
  height: auto;
}

.row {
  display: flex;
  align-items: center;
}

button {
  background: rgb(39, 201, 63);
  border: none;
  margin-top: 20px;
  border-radius: 10px;
  padding: 7px 80px;
}

button:hover {
  background-color: rgb(52, 179, 71);
}

.col-kanan {
  margin-left: 30px;
}
</style>