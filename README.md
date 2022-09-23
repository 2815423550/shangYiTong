阶段二

实现了查询表中所有记录的功能



1.导入实体类



2.service_hosp模块

​	2.1 创建mapper包，编写HospitalSetMapper接口

​	2.2 在mapper包里创建xml包，编写HospitalSetMapper.xml文件

​	2.3 创建service包，编写HospitalSetService接口

​	2.4 在service包里创建imp包，编写HospitalSetServiceImpl实现类

​	2.5 创建controller包，编写查询表中所有记录的业务

​	2.6 创建config包，编写HospConfig配置类



（在这里讲一下service、controller、mapper的关系；controller为前端提供的访问入口，service提供业务逻辑要用到的方法，
serviceImpl提供业务逻辑方法的实现，mapper为serviceImpl提供操作数据的方法，mapperXml提供操作数据库方法的实现）
