
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"
import OrderDbManager from "./components/listers/OrderDbCards"
import OrderDbDetail from "./components/listers/OrderDbDetail"

import OrderStView from "./components/OrderStView"
import OrderStViewDetail from "./components/OrderStViewDetail"
import PayDbManager from "./components/listers/PayDbCards"
import PayDbDetail from "./components/listers/PayDbDetail"


import DelveryManager from "./components/listers/DelveryCards"
import DelveryDetail from "./components/listers/DelveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },
            {
                path: '/orderDbs',
                name: 'OrderDbManager',
                component: OrderDbManager
            },
            {
                path: '/orderDbs/:id',
                name: 'OrderDbDetail',
                component: OrderDbDetail
            },

            {
                path: '/orderSts',
                name: 'OrderStView',
                component: OrderStView
            },
            {
                path: '/orderSts/:id',
                name: 'OrderStViewDetail',
                component: OrderStViewDetail
            },
            {
                path: '/payDbs',
                name: 'PayDbManager',
                component: PayDbManager
            },
            {
                path: '/payDbs/:id',
                name: 'PayDbDetail',
                component: PayDbDetail
            },


            {
                path: '/delveries',
                name: 'DelveryManager',
                component: DelveryManager
            },
            {
                path: '/delveries/:id',
                name: 'DelveryDetail',
                component: DelveryDetail
            },



    ]
})
