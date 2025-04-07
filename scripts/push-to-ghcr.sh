set -u # or set -o nounset
: "$VERSION"

echo ${{ secrets.ACCESS_TOKEN }} | docker login practicumsruj.azurecr.io --username practicumsruj --password-stdin
docker push ghcr.io/rujul13/arithmetic-service:1
