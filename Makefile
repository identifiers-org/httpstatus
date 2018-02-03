# This Makefile helps on building the production container image

# Container name
container_name = identifiersorg/cloud-ws-httpstatus

# Default target
all: clean container_production_push
