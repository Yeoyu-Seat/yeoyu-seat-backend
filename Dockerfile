# 1. Java 17이 설치된 슬림한 이미지 사용
FROM openjdk:17-jdk-slim

# 2. 빌드된 JAR 파일을 컨테이너 안으로 복사
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar
COPY yeoyu-seat-be-0.0.1-SNAPSHOT.jar app.jar

# 3. JAR 실행 명령어 설정
ENTRYPOINT ["java", "-jar", "/app.jar"]
