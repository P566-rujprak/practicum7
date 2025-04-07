set -u
: "practicumsruj.azurecr.io"
: "1"
envsubst < ./scripts/kubernetes/deploy.yaml | kubectl apply -f -

