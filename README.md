阶段三



整合swagger

​	在common包的service_util包中创建config包，在该包下创建Swagger2Config配置类





定义统一返回结果

​	1.在common/common-util中创建result包，创建Result类作为统一返回结果，创建ResultCodeEnum枚举，作为响应状态码

​	2.修改业务处理方法的返回值类型

​	

逻辑删除医院、条件查询带分页、添加医院设置、根据id获取医院设置、修改医院设置、批量删除医院设置接口  功能的开发

​	1.前往common/service_util里的utils添加MD5工具类

​	2.一路往前



统一系统异常处理

​	全局异常：（系统有的异常，如算术异常）

​	1.前往common/common_util里创建exception包

​	2.在exception包下创建全局异常处理类GlobalExceptionHandler

​	

​	自定义异常：

​	 1.在exception包下创建YyghException自定义异常处理类
