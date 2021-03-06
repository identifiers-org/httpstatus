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

container_production_build: app_structure
	@echo "<===|DEVOPS|===> [BUILD] Production container $(container_name)"
	@docker build -t $(container_name) .

container_production_push: container_production_build
	@echo "<===|DEVOPS|===> [PUBLISH]> Production container $(container_name)"
	@docker push $(container_name)

dev_container_build: clean container_production_build
	@echo "<===|DEVOPS|===> [DEV] Preparing local container"

clean:
	@echo "<===|DEVOPS|===> [CLEAN] Cleaning the space"
	@mvn clean > /dev/null

.PHONY: all clean app_structure container_production_build container_production_push dev_container_build
