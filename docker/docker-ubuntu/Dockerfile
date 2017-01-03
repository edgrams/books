FROM ubuntu:16.04
MAINTAINER Ed Grams "edgramswork@gmail.com"
ENV REFRESHED_AT 2017-01-02

RUN apt-get update -yqq
RUN apt-get install -yqq apt-transport-https ca-certificates sudo

RUN apt-key adv --keyserver hkp://ha.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D

RUN echo "deb https://apt.dockerproject.org/repo ubuntu-xenial main" | sudo tee /etc/apt/sources.list.d/docker.list

RUN apt-get update -yqq
RUN apt-cache policy docker-engine

RUN apt-get update -yqq
RUN apt-get install -yqq linux-image-extra-$(uname -r) linux-image-extra-virtual

RUN apt-get update -yqq
RUN apt-get install -yqq docker-engine
