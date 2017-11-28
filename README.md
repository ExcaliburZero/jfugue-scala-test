# jfugue-scala-test
A test of using JFugue, a jvm music library, in Scala.

## Setup
```
$ sudo apt install fluidsynth
$ mkdir lib
$ curl http://www.jfugue.org/jfugue-5.0.9.jar > lib/jfugue-5.0.9.jar
```

## Usage
```
$ make server &
$ sbt assembly
$ java -jar target/scala-2.12/jfuguetest-assembly-1.0.jar
```
