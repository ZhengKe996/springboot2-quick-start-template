# SpringBoot2 Quick Start Template

## 主流框架 & 特性
- Spring Boot 2.7.6
- Spring MVC
- MyBatis + MyBatis Plus 数据访问（开启分页）
- Spring Boot 调试工具和项目处理器
- Spring AOP 切面编程
- Spring 事务注解
- ## 数据存储

- MySQL 数据库
- Redis 内存数据库

## 工具类

- Hutool 工具库
- Apache Commons Lang3 工具类
- Lombok 注解


## 业务特性

- Spring Session Redis 分布式登录
- 全局请求响应拦截器（记录日志）
- 全局异常处理器
- 自定义错误码
- 封装通用响应类
- Swagger + Knife4j 接口文档（暂定 考虑同步到 Apifox）
- 自定义权限注解 + 全局校验
- 全局跨域处理
- 长整数丢失精度解决
- 多环境配置

## 业务功能

- 提供示例 SQL（用户、POST、POST点赞、POST收藏表）
- 用户登录、注册、注销、更新、检索、权限管理
- POST创建、删除、编辑、更新、数据库检索
- POST点赞、取消点赞
- POST收藏、取消收藏、检索已收藏POST

## 架构设计

- 合理分层

## 快速开始

`TODO 位置、TEMPLATE位置处，需要改为自己的配置`

### MySQL 数据库

1）修改 `application.yml` 的数据库配置为你自己的：

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/TEMPLATE
    username: root
    password: 123456
```

2）执行 `sql/create_table.sql` 中的数据库语句，自动创建库表

### Redis 分布式登录

```yml
spring:
  data:
    redis:
      { database: 1, host: localhost, port: 6379,password: xxxxxx, timeout: 5000 }
```

2）修改 `application.yml` 中的 session 存储方式：

```yml
spring:
  session:
    store-type: redis
```


## OPENAPI 默认接口地址
`http://Your_ip: Your_prot/api/v2/api-docs`