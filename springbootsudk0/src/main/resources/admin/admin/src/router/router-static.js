import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yonghu from '@/views/modules/yonghu/list'
    import zhiyuanzhezhaopin from '@/views/modules/zhiyuanzhezhaopin/list'
    import messages from '@/views/modules/messages/list'
    import yonghuyingpin from '@/views/modules/yonghuyingpin/list'
    import xinwenleixing from '@/views/modules/xinwenleixing/list'
    import storeup from '@/views/modules/storeup/list'
    import pinkunhu from '@/views/modules/pinkunhu/list'
    import config from '@/views/modules/config/list'
    import remenxinwen from '@/views/modules/remenxinwen/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/zhiyuanzhezhaopin',
        name: '志愿者招聘',
        component: zhiyuanzhezhaopin
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/yonghuyingpin',
        name: '用户应聘',
        component: yonghuyingpin
      }
      ,{
	path: '/xinwenleixing',
        name: '新闻类型',
        component: xinwenleixing
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/pinkunhu',
        name: '贫困户',
        component: pinkunhu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/remenxinwen',
        name: '热门新闻',
        component: remenxinwen
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
