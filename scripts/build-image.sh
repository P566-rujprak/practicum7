set -u # or set -o nounset
: "$VERSION"

docker build -t ghcr.io/rujul13/arithmetic-service:1 .
