# 이미지 명
FROM openjdk:17-alpine
COPY build/libs/*.jar app.jar

# []에 입력한 세 줄짜리 도커 이미지가 생성됨
ENTRYPOINT ["java", "-jar", "app.jar"]