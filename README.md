p81————p100



# 注册中心与远程调用



由之前的步骤我们知道了：

nginx用于请求转发，请求统一请求9001端口，然后由nginx转发到 8201或者8202端口。



redis用于存储缓存



mongodb用于存储高并发的数据？？？



如今nacos用于处理不同服务之间的调用问题，如service_hosp服务要调用service_cmn需要用到注册中心和远程调用。

（注意：不同服务之间的调用不能通过引入依赖来解决，因为引入依赖只能使用那个模块里的类、方法等等，但是我们这里说的服务之间的调用是需要调用地址、端口等等）



注册中心有很多，如nginx、zookeeper、eureka都属于注册中心。



## 一、nacos



### 1.在service模块中引入nacos依赖



### 2.在service_hosp的配置文件中配置nacos的地址



### 3.在service_hosp的启动类上加上@EnableDiscoveryClient注解



### 4.重新启动服务后，拥有@EnableDiscoveryClient注解的服务便会在nacos中注册



### 5.同样的方法，把hosp_cmn服务也注册到nacos中



注册成功：

![image.png](https://s2.loli.net/2022/09/26/J52WShD1iQkMCYy.png)







## 二、Feign

1.新建maven模块service_client，再他的pom里引入

```
 <dependency>
            <groupId>com.atguigu</groupId>
            <artifactId>common_util</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.atguigu</groupId>
            <artifactId>model</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <scope>provided </scope>
        </dependency>

        <!-- 服务调用feign -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
            <scope>provided </scope>
        </dependency>

```

再在该模块下，创建service_cmn_client模块，





## 去前端









其实geteway用起来很简单，就新建一个模块，然后加入启动类、配置文件、配置类，结束。









