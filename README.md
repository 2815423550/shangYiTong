首先，并没有node_module模块，下载后先npm install一下

阶段四



## 前端开发

### 一、初始化

```
npm install

npm run dev

```



## 二、目录介绍

### 1.package-lock.json

项目的依赖，执行npm install就是把这个文件里的依赖全部下载



### 2.webpack.base.conf.js

从webpack.base.conf.js的entry可以看出项目的入口文件为./src/main.js		



### 3.config\dev.env.js

BASE_API:指定访问后端的接口路径



### 4.config\index.js

```
	// 访问的ip地址
    host: 'localhost',
    // 访问的端口号
    port: 9528,
    // Eslint：检查代码格式的插件,false表示不使用
    useEslint: false,
    showEslintErrorsInOverlay: false,
```



### 5.src\api

这里设置接口的地址



### 6.src\assets\404_images

这里存放一些静态资源



### 7.src\components

第三方组件



### 8.src\icons

图标



### 9.src\router

路由



### 10.src\store

相关js文件



### 11.src\styles

样式



### 12.src\utils

工具类



### 13.src\views

视图，也就是页面





## 22

### 1.src\store\modules\user.js

这里是登录、退出的功能



### src\router\index.js

修改路由



### src\views下新建hospset文件夹

新建两个vue文件，测试上一步的路由是否设置成功



### config\dev.env.js

配置后端访问地址



### src\views\hospset\list.vue

编写方法



### src\utils\request.js

把res.code !== 20000 改成res.code !== 200



以上运行成功





## 33

前往[Element - 网站快速成型工具](https://element.eleme.cn/#/zh-CN)



### src\views\hospset\list.vue

修改src\views\hospset\list.vue的页面





src\views\hospset\list.vue 和src\api\hospset.js全部复制粘贴完毕后，再复制粘贴src\views\hospset\add.vue



然后前往src\views\layout\components\AppMain.vue 把   <router-view :key="key"></router-view>这行取消注释 ，以及取消注释下面这些代码

```
 key() {
   return this.$route.name !== undefined ? this.$route.name + +new Date() : this.$route + +new Date()
 } 
```

注意：这里是解决组件重用的方法（不懂也没关系，知道是解决组件重用就行）





前端阶段暂时结束

