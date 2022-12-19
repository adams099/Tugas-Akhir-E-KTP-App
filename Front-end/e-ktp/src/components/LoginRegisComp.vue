<template>
    <div class="container">
        <div class="loginPage">
            <img src="@/assets/e-ktp.png" alt="" />
            <div class="main">
                <input type="checkbox" id="chk" aria-hidden="true" v-model="checkbox" />

                <div class="signup">
                    <form @submit.prevent="register">
                        <label for="chk" aria-hidden="true">Sign up</label>
                        <input type="text" name="txt" placeholder="Nama Lengkap" v-model="userRegister.nama"
                            required="" />
                        <input type="email" name="email" placeholder="Email" v-model="userRegister.email" required="" />
                        <input type="password" name="pswd" placeholder="Password" v-model="userRegister.password"
                            required="" />
                        <input type="password" name="pswd" placeholder="RePassword" required="" v-model="password2" />
                        <p v-if="registerValid">Password Tidak Sama</p>
                        <p v-if="emailValid">Email Sudah digunakan</p>
                        <button>Sign up</button>
                    </form>
                </div>

                <div class="login">
                    <form @submit.prevent="login">
                        <label for="chk" aria-hidden="true">Login</label>
                        <input type="email" name="email" placeholder="Email" v-model="userLogin.email" required="" />
                        <input type="password" name="pswd" placeholder="Password" v-model="userLogin.password"
                            required="" />
                        <p v-if="loginValid">Username atau Password Salah</p>
                        <p v-if="registerBerhasil">Berhasil mendaftar! Silahkan Login</p>
                        <button>Login</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import eKtpKKService from "@/services/userServices";
export default {
    data() {
        return {
            userLogin: {
                email: "",
                password: "",
            },
            userRegister: {
                nama: "",
                email: "",
                password: "",
            },
            loginValid: false,
            password2: "",
            registerValid: false,
            emailValid: false,
            registerBerhasil: false,
            checkbox: "",
        };
    },
    methods: {
        login() {
            console.log(this.userLogin);
            eKtpKKService
                .login(this.userLogin)
                .then((response) => {
                    if (response.status === 200) {
                        this.$router.push("/home");
                    }
                })
                .catch((e) => {
                    if (e.response.status === 500) {
                        this.loginValid = true;
                    }
                });
        },
        register() {
            this.registerValid = false;
            this.emailValid = false;
            let data = this.userRegister;
            let password2 = this.password2;
            if (data.password == password2) {
                eKtpKKService
                    .register(data)
                    .then((response) => {
                        console.log(response.data);
                        this.userRegister = {};
                        this.password2 = "";
                        this.registerBerhasil = true;
                        this.checkbox = true;
                    })
                    .catch((e) => {
                        // console.log(e);
                        if (e.response.data.status === 500) {
                            this.emailValid = true;
                        }
                    });
            } else {
                this.registerValid = true;
            }
        },
    },
};
</script>

<style lang="scss" scoped>
.loginPage {
    margin-top: 50px;
    border-radius: 10px;
    // margin: 0;
    padding: 70px;
    display: flex;
    justify-content: center;
    align-items: center;
    // min-height: 100vh;
    font-family: "Jost", sans-serif;
    background: linear-gradient(to bottom, #dba39a, #f0dbdb, #dba39a);
}

.main {
    width: 550px;
    height: 500px;
    background: red;
    overflow: hidden;
    background: #dba39a no-repeat center/ cover;
    border-radius: 10px;
    box-shadow: 5px 20px 50px #000;
}

#chk {
    display: none;
}

.signup {
    position: relative;
    width: 100%;
    height: 100%;
}

label {
    color: #fff;
    font-size: 2.3em;
    justify-content: center;
    display: flex;
    margin: 60px;
    font-weight: bold;
    cursor: pointer;
    transition: 0.5s ease-in-out;
}

input {
    width: 60%;
    height: 20px;
    background: #e0dede;
    justify-content: center;
    display: flex;
    margin: 20px auto;
    padding: 10px;
    border: none;
    outline: none;
    border-radius: 5px;
}

button {
    width: 60%;
    height: 40px;
    margin: 10px auto;
    justify-content: center;
    display: block;
    color: #fff;
    background: #573b8a;
    font-size: 1em;
    font-weight: bold;
    margin-top: 20px;
    outline: none;
    border: none;
    border-radius: 5px;
    transition: 0.2s ease-in;
    cursor: pointer;
}

button:hover {
    background: #6d44b8;
}

.login {
    height: 460px;
    background: #eee;
    border-radius: 60% / 10%;
    transform: translateY(-180px);
    transition: 0.8s ease-in-out;
}

.login label {
    color: #573b8a;
    transform: scale(0.6);
}

#chk:checked~.login {
    transform: translateY(-500px);
}

#chk:checked~.login label {
    transform: scale(1);
}

#chk:checked~.signup label {
    transform: scale(0.6);
}
</style>