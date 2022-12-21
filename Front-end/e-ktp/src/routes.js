import LoginReg from './pages/LoginRegis.vue'
import Home from './pages/Home.vue'
import FormKk from './pages/FormAddKK.vue'
import Anggota from './pages/ListSeluruhAK.vue'
import DetailKK from './pages/DetailKK.vue'
import ListAnggota from './pages/ListAnggota.vue'
import FormDetailAk from './pages/DetailAkForm.vue'

export default [
    {
        path: '/',
        component: LoginReg
    },
    {
        path: '/home',
        component: Home
    },
    {
        path: `/addkk`,
        component: FormKk
    },
    {
        path: `/anggota`,
        component: Anggota
    },

    {
        name: "DetailKK",
        path: `/detailKK/:no_kk`,
        component: DetailKK
    },
    {
        name: "ListAnggota",
        path: `/detailKK/:no_kk/listAnggota`,
        component: ListAnggota
    },
    {
        name: "FormDetailAk",
        path: `/detailKK/:id/listAnggota/detailAnggota`,
        component: FormDetailAk,
    }
]