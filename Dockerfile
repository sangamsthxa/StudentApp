FROM openjdk:25-oraclelinux8
ADD target/student-app.jar student-app.jar
ENTRYPOINT ["java","-jar","/student-app.jar"]