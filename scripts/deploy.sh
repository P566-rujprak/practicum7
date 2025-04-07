set -u
: "practicumsruj.azurecr.io"
: "1"
envsubst < ./deploy.yaml | kubectl apply -f -
