From openjdk:21
ADD ./docker-spring-boot.jar docker-spring-boot.jar
ENRTYPOINT ["java", ".jar", "docker-spring-boot.jar"]