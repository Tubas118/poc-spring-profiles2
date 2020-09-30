# Mapping Maven profiles to Spring Boot profiles<br/>(poc-spring-profiles2)

This POC has the following mapping defined in the `pom.xml` file between Maven and Spring Boot profiles:

| Maven | Spring Boot | Property Files | Command and Results |
| ----- | ----- | ----- | ----- |
| dev (default) | local | application.properties<br/>application-local.properties | ``mvn spring-boot:run``<br/>``[port=8082, environment=local, other=none]`` |
| prod | prod,alt | application.properties<br/>application-prod.properties<br/>application-alt.properties | ``mvn spring-boot:run -P prod``<br/>``[port=8080, environment=prod, other=alt]`` |

IMPORTANT: `application-local.properties` is not checked into the project. If it doesn't exist the first time that the project is built, it is created using `application-local.template`. This allows the developer to make any local changes to their properties without fear of accidentally checking the change into source control.
