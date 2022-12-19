import http from '../http-common';

class User {
   login(data){
        return http.post('/user/login',data)
    }
    register(data){
        return http.post('/user/register', data)
    }
}

export default new User();