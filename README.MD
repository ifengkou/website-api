# website api

spring mvc 多module 基础型框架

-- 数据db 连接池、缓存
-- 统一日志管理
-- 统一异常处理

## modules

- website.model：实体类 module
- website.dal：数据访问dal module
- website.service：服务service module
- website.controller：控制层 controller module
- website.common：公用工具 module

## package

    mvn clean package -P{env} -Dmaven.test.skip=true
    {env} 为部署环境参数，dev指开发环境，test指测试环境，pre指预演环境，online指线上环境

## deploy

    mvn tomcat:deploy
