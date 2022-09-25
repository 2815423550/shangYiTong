p65————p73

# 启动nginx

下载nginx并安装后，前往D:\nginx-1.18.0\conf下的nginx.conf文件，打开并在http里添加如下代码：

```
# 这里是做尚医通项目时修改的
server {
   listen       9001;
   server_name  localhost;

    location ~ /hosp/ {
       proxy_pass   http://127.0.0.1:8201;
    }

    location ~ /cmn/ {
       proxy_pass   http://127.0.0.1:8202;
    }
}
```

然后保存退出



在D:\nginx-1.18.0目录下cmd打开，并输出命令nginx.exe，完成启动nginx



然后前往前端config\dev.env.js修改BASE_API的路径为"http://localhost:9001"，然后重新启动前端，即可同时访问8201端口以及8202端口的数据。





# 启动docker

安装docker，docker只能安装在linux环境下，所以需要先安装虚拟机，随后在虚拟机上安装docker

安装docker教程[Docker安装教程（超详细） - Java大师- - 博客园 (cnblogs.com)](https://www.cnblogs.com/dalaba/p/14759831.html#:~:text=我们通常所下载的docker为docker ce社区版的 1、运行下面命令，下载并安装docker sudo yum -y,install docker-ce 2、运行 docker version，查看docker ce是否安装成功，打印以下信息即为安装成功！)



docker安装完成之后，依次执行以下命令：

```
//启动docker
systemctl start docker
//查看docker状态
systemctl status docker
//设置docker开机自启动
systemctl enable docker
```







# 启动mongodb

首先拉取mongodb镜像

```
#拉取镜像 
docker pull mongo:latest
```

然后查看mongodb镜像是否拉取成功

```
docker images
```

如果出现以下，则说明mongodb镜像拉取成功

![image-20220925093649514](C:\Users\28154\AppData\Roaming\Typora\typora-user-images\image-20220925093649514.png)



然后创建和启动mongodb容器 

```
#创建和启动容器 
docker run -d --restart=always -p 27017:27017 --name mymongo -v /data/db:/data/db -d mongo
```

随后执行：

```
docker ps
```

如果出现以下情况则说明成功创建和启动mongodb容器 

![image-20220925094057793](C:\Users\28154\AppData\Roaming\Typora\typora-user-images\image-20220925094057793.png)



第三，执行命令进入容器

```
#进入容器 
docker exec -it mymongo /bin/bash 
```

如果出现以下情况则说明成功

![image-20220925094400972](C:\Users\28154\AppData\Roaming\Typora\typora-user-images\image-20220925094400972.png)



然后。。。。。。。。。





复制粘贴hospital-manage模块，修改redis的ip地址以及数据库的密码，然后执行

















