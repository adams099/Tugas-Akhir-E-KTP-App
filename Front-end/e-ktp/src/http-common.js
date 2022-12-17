import axios from 'axios';

export default axios.create({
    baseURL: 'http://localhost:8082/api',
    Headers: {
        "Content-type": "application/json",
    },
});