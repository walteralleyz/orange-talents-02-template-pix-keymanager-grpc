FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /exec/
EXPOSE 50051
ENV BCB_URI=http://bcb:8082
ENV ITAU_URI=http://erp-itau:9091
ENV JPA_URI=jdbc:h2:mem:devDb
ENV JPA_DRIVER=org.h2.Driver
ENV JPA_USER=sa
ENV JPA_PASS=teste
ENV JPA_DIALECT=H2
ENTRYPOINT java -jar /exec/*.jar
