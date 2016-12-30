FROM edgrams/redis
MAINTAINER Ed Grams <edgramswork@gmail.com>
ENV REFRESHED_AT 2016-12-30

ENTRYPOINT [ "redis-server", "--logfile /var/log/redis/redis-replica.log", "--slaveof redis-primary 6379" ]
