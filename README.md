# docker-kotlin-gradle-hello-world
Minimal setup for having working docker image with Kotlin code

To build fully executable jar invoke command: 
```
$ gradle build
```
Jar library might be run by using command:
```
java -jar build/libs/kotlin-docker-gradle-app.jar
```
To create docker image:
```
$ docker image -t image_name .
```

To start docker container with Kotlin application:
```
$ docker run --rm image_name
Hello, world!
Sum:  0
$ docker run --rm image_name 1 2 3 4 5
Hello, world!
Sum:  15
```
