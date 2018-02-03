# This Makefile helps on building the production container image

# Container name
container_name = identifiersorg/cloud-ws-httpstatus

# Default target
all: clean container_production_push

app_structure:
	@echo "<===|DEVOPS|===> [PACKAGE] Application"
	@mvn clean > /dev/null
	@mvn package
	@mkdir -p target/app/log
	@mkdir -p target/app/tmp
	@cp target/httpstatus-*.jar target/app/service.jar
