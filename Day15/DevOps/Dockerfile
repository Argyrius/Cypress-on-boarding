FROM ubuntu:latest
MAINTAINER Argyrios Gatidis <Argy.gatidis@hotmail.gr>

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy http://192.168.101.52:8080
ENV no_proxy_hosts localhost,127.0.0.1,10.236.52.188
#ENV ALL_PROXY=http://192.168.101.52:8080
ENV JAVA_HOME /usr/lig/jvm/java-11-openjdk-amd64
ENV M2_HOME /root apache-maven-3.6.1
ENV PATH "$PATH:$JAVA_HOME/bin:$M@_HOME/bin"

RUN apt-get update && apt-get install default-jdk git -y

COPY apache-maven-3.6.1-bin.tar.gz /root/apache-maven-3.6.1-bin.tar.gz 
