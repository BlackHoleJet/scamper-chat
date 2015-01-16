Scamper Chat
============

This is an IRC-like chat application consisting of a server, a command-line
client and some libraries for shared code.  It uses SCTP rather than TCP
in its wire protocol, and the 
[scamper](https://github.com/timboudreau/scamper) library that makes it easy
to write protocols using SCTP.

Features
--------

 * Multiple chat rooms, IRC-style, with similar commands
 * Ansi-colored shell client
 * End-to-end Blowfish encryption on password-protected rooms - meaning that the
server cannot decrypt the chat messages (the server does store a SHA-512 hash
of the password to reject access, but has no way to decrypt messages).

This project serves as a demo of how to write servers with Scamper, in addition
to being usable in its own right.


Subprojects
-----------

 * **Scamper Hub** - the server - build and run with `java -jar`
 * **Scamper Chat CLI** - command-line ansi-colored chat client featuring IRC-like commands (`/join`, `/who`, `/rooms`, etc.) - also build and run with `java -jar`

The rest are supporting projects for those:

 * **Scamper Chat Common** - POJO data types used in the wire protocol, and base
classes for clients
 * **Scamper Chat Message Types** - Defines the Scamper [MessageType](http://timboudreau.com/builds/job/scamper/lastSuccessfulBuild/artifact/scamper/target/apidocs/com/mastfrog/scamper/MessageType.html)s that
are used by client and server to choose handlers for particular kinds of messages
 * **Scamper Chat Client Base** - Base classes that provide a simple interface for
writing scamper-chat clients

Downloads And Builds
-----------------------

Building is as simple as cloning this repository and running `mvn install` (Maven 3.2.x or later and JDK 8 recommended).

 * The continuous build is [here](http://timboudreau.com/builds/job/scamper-chat/)
 * [Server JAR download](http://timboudreau.com/builds/job/scamper-chat/lastSuccessfulBuild/artifact/scamper-hub/target/scamper-hub-server.jar)
 * [Client JAR download](http://timboudreau.com/builds/job/scamper-chat/lastSuccessfulBuild/artifact/scamper-chat-cli/target/scamper-chat-client.jar)
 * Javadoc:
   * [Chat Client Base Javadoc](http://timboudreau.com/builds/job/scamper-chat/lastSuccessfulBuild/artifact/scamper-chat-client-base/target/apidocs/index.html)
   * [Scamper-Chat Common Javadoc](http://timboudreau.com/builds/job/scamper-chat/lastSuccessfulBuild/artifact/scamper-chat-common/target/apidocs/index.html)
   * [Scamper-Chat MessageTypes Javadoc](http://timboudreau.com/builds/job/scamper-chat/lastSuccessfulBuild/artifact/scamper-chat-messagetypes/target/apidocs/index.html)
