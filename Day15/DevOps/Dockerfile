FROM ubuntu
MAINTAINER Argyrios Gatidis <Argy.gatidis@hotmail.gr>

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy http://192.168.101.52:8080
ENV no_proxy_hosts localhost,127.0.0.1,10.236.52.188
ENV ALL_PROXY=http://192.168.101.52:8080

RUN apt-get update && apt-get install default-jdk git maven -y

RUN apt-get update && apt-get install default-jdk git -y
RUN apt-get install maven -y

COPY apache-maven-3.6.1-bin.tar.gz /root/apache-maven-3.6.1-bin.tar.gz 

