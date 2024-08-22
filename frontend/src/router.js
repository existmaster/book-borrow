
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import BookBookManager from "./components/listers/BookBookCards"
import BookBookDetail from "./components/listers/BookBookDetail"

import BorrowBorrowManager from "./components/listers/BorrowBorrowCards"
import BorrowBorrowDetail from "./components/listers/BorrowBorrowDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/books/books',
                name: 'BookBookManager',
                component: BookBookManager
            },
            {
                path: '/books/books/:id',
                name: 'BookBookDetail',
                component: BookBookDetail
            },

            {
                path: '/borrows/borrows',
                name: 'BorrowBorrowManager',
                component: BorrowBorrowManager
            },
            {
                path: '/borrows/borrows/:id',
                name: 'BorrowBorrowDetail',
                component: BorrowBorrowDetail
            },



    ]
})
