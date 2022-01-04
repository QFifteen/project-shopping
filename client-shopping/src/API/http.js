import axios from "axios";
import qs from "qs";

export function GET(url, params ) {
    return new Promise((resolve, reject) => {
        axios.get(url, {params: params})
            .then((response) => {
                resolve(response.data)
            })
            .catch((err) => {
                reject(err)
            })
    })
}


export function POST(url, params) {
    return new Promise((resolve, reject) => {
        axios.post(url,qs.stringify(params))
            .then(response => {
                resolve(response);
            })
            .catch(err => {
                reject(err)
            })
    });
}

export function PUT(url, params) {
    return new Promise((resolve, reject) => {
        axios.put(url,qs.stringify(params))
            .then(response => {
                resolve(response);
            })
            .catch(err => {
                reject(err)
            })
    });
}


export function Del(url, params ) {
    return new Promise((resolve, reject) => {
        axios.delete(url, {params: params})
            .then((response) => {
                resolve(response.data)
            })
            .catch((err) => {
                reject(err)
            })
    })
}

export function Dellist(url, params ) {
    return new Promise((resolve, reject) => {
        axios.post(url, qs.stringify(params,{arrayFormat:'repeat'}))
    .then((response) => {
                resolve(response.data)
            })
            .catch((err) => {
                reject(err)
            })
    })
}
