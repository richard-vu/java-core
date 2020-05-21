## How to run this?
```bash
$ git clone https://github.com/richard-vu/java-core.git
$ cd java-core/programming-core-java/01-hello-world/
$ mvn package
$ java -jar target/01-hello-world.jar

//dockerize
// create a docker image
$ sudo docker build -t 01-hello-world:1.0 .
// run it
$ sudo docker run -t 01-hello-world:1.0
```