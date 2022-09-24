后端



前往service模块新建service_cmn模块

模仿service_hosp模块，创建配置文件、mapper、controller、service、config









前端



模仿之前做法，先src\router\index.js创建路由，再创建页面src\views\dict\list.vue，然后配置访问路径src\api\dict.js





。。。。。。。。。。。。。。。。。。。。。。。。。。。。。

我写到哪了？？？？？





数据字典后端复制粘贴，前端复制粘贴



然后redis再service_util里添加redis依赖，在com.atguigu.yygh.common.config里添加redis的配置类



在service_cmn里的配置文件中加入redis的配置



然后去com.atguigu.yygh.cmn.service.impl的DictServiceImpl中的findChildData方法上面添加@Cacheable(value = "dict",keyGenerator = "keyGenerator")注解，同时也给importDictData方法添加@CacheEvict(value = "dict", allEntries=true)注解



开启redis服务，步骤是：

1.去D盘找到redis文件夹，里面有startup.bat双击

2.在C:\Windows\System32\cmd.exe文件夹里cmd，输入redis-cli.exe -h 127.0.0.1 -p 6379 -a 123456

3.输入keys *

4.去浏览器刷新，然后再回来输入keys *

5.需要注意的是，如果按照以上方法操作都报错的话，去检查一下配置文件，看看有没有漏掉这句代码：

```
spring.redis.password=123456
```
