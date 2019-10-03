FROM ubuntu
MAINTAINER Argyrios Gatidis <Argyrios.gatidis@amdocs.com>

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy https://192.168.101.52:8080

RUN apt-get update && apt-get install -y nginx

CMD ["/usr/sbin/nginx", "-g","daemon off;"]
