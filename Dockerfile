FROM gradle:5.6.2-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src

ENTRYPOINT ["gradle","bootRun"]