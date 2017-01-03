FROM ubuntu:16.04
MAINTAINER Ed Grams <edgramswork@gmail.com>
ENV REFRESHED_AT 2017-01-01

RUN apt-get -qqy update
RUN apt-get -qqy install curl unzip

ADD https://releases.hashicorp.com/consul/0.7.2/consul_0.7.2_linux_amd64.zip /tmp/consul.zip
RUN cd /usr/sbin; unzip /tmp/consul.zip; chmod +x /usr/sbin/consul; rm /tmp/consul.zip

RUN mkdir -p /webui/
ADD https://releases.hashicorp.com/consul/0.7.2/consul_0.7.2_web_ui.zip /webui/webui.zip
RUN cd /webui; unzip webui.zip; rm webui.zip

ADD consul.json /config/

EXPOSE 53/udp 8300 8301 8301/udp 8302 8302/udp 8400 8500

VOLUME [ "/data" ]

ENTRYPOINT [ "/usr/sbin/consul", "agent", "-config-dir=/config" ]
CMD []
