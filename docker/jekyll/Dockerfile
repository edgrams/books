FROM ubuntu:16.04
MAINTAINER Ed Grams <edgramswork@gmail.com>
ENV REFRESHED_AT 2016-12-29

RUN apt-get -yqq update
RUN apt-get -yqq install ruby ruby-dev build-essential nodejs
RUN gem install --no-rdoc --no-ri jekyll -v 2.5.3

VOLUME /data
VOLUME /var/www/html
WORKDIR /data

ENTRYPOINT [ "jekyll", "build", "--destination=/var/www/html" ]
