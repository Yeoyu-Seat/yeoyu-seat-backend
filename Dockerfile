## 1. Java 17이 설치된 슬림한 이미지 사용
#FROM openjdk:17-jdk-slim
#
## 2. 빌드된 JAR 파일을 컨테이너 안으로 복사
## 기존
##ARG JAR_FILE=build/libs/*.jar
##COPY ${JAR_FILE} app.jar
#
## 수정
#COPY yeoyu-seat-be-0.0.1-SNAPSHOT.jar app.jar
#
## 3. JAR 실행 명령어 설정
#ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM openjdk:17-jdk-slim

# JAR 파일 복사 (EC2에 이미 app.jar라는 이름으로 있음)
COPY app.jar app.jar

# JAR 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]

