# website api

spring mvc ��module �����Ϳ��

-- ����db ���ӳء�����
-- ͳһ��־����
-- ͳһ�쳣����

## modules

- website.model��ʵ���� module
- website.dal�����ݷ���dal module
- website.service������service module
- website.controller�����Ʋ� controller module
- website.common�����ù��� module

## package

    mvn clean package -P{env} -Dmaven.test.skip=true
    {env} Ϊ���𻷾�������devָ����������testָ���Ի�����preָԤ�ݻ�����onlineָ���ϻ���

## deploy

    mvn tomcat:deploy