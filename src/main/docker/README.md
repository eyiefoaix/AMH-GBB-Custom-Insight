# 安装docker环境


deepin 是类似ubuntu的基于debian的系统,因此ubuntu安装类似

1.安装
```
sudo apt update
sudo apt install docker.io -y
```
2.配置链接
```
sudo ln -sf /usr/bin/docker.io /usr/local/bin/docker
sudo sed -i '$acomplete -F _docker docker' /etc/bash_completion.d/docker.io
```
3.配置服务

```
sudo systemctl unmask docker.service
sudo systemctl unmask docker.socket
```
4.启动服务
```
sudo service docker start
或者
sudo systemctl start docker
```
5.运行hello world
```
sudo docker pull hello-world
sudo docker run hello-world
```

6.将应用打包
```
sudo mvn package docker:build -DskipTests
```

7.在本地8080端口起服务
```
#通过终端展示调试信息
sudo docker run -p 8080:8080 -t jimersylee/spring-boot-api-project-seed
#不展示信息
sudo docker run -p 8080:8080 jimersylee/spring-boot-api-project-seed

```

