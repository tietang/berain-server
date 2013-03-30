[Berain](https://github.com/fengfei1000/berain)
========


Berain is a simple high-performance coordination service for distributed applications
 
Features
---------
* HTTP Protocol & JSON
* A simple browsed UI, and the UI support Database or Zookeeper 3.4.x by configuration
* client & server support watchable event for database configuration.


[berain-server](https://github.com/fengfei1000/berain/tree/master/berain-server)
=========


Install [Play framework 1.2.5](https://github.com/playframework/play)
---------------
- [download play-1.2.5.zip](http://download.playframework.org/releases/play-1.2.5.zip)

- unzip play-1.2.5.zip -d /path/to/play-1.2.5
- Add PLAY_HOME  
 + Windows PLAY_HOME=c:\path\to\play PATH=%PLAY_HOME%;...
 + Linux
``` PLAY_HOME=/path/to/play 
    PATH=$PLAY_HOME:$PATH
    export PLAY_HOME PATH
```
run berain-server
---------------------

 - cd /path/to/berain-server
 + play run or play start
- Go to [http://localhost:8021](http://localhost:8021) and you’ll see the login page. default user name is "admin", password is "password"
