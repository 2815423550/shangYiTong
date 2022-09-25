p73————p80  （忘记从哪里开始我就没继续写笔记了。。。总之基本上就是复制粘贴）



首先前往service_util里的com.atguigu.yygh.common.helper添加HttpRequestHelper类，然后去service_util里的pom添加依赖；

```
<dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
        </dependency>
```



然后去service_hosp的pom里添加依赖：

```
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb</artifactId>
        </dependency>
```

然后更改配置文件，添加：

```
#mongodb
spring.data.mongodb.uri=mongodb://172.17.0.1:27017/yygh_hosp
```





然后去service_hosp里复制粘贴repository的内容、添加service的内容
