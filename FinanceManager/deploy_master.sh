# master 节点的操作

# delete deploy and servce
kubectl delete rc webapp
kubectl delete svc webapp-tomcat

# deploy deployment and service
kubectl apply -f hack/webapp-rc-v2.yaml
kubectl apply -f hack/webapp-svc.yaml
