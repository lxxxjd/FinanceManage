# git pull newest code
git pull

# build the new image
# docker build  . -t front:v1
docker build -f ../Dockerfile . -t front:v1

# delete the old image
# todo: delete runing cantainer
docker images|grep none|awk '{print $3}'|xargs docker rmi
