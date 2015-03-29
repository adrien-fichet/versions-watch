[![Build Status](https://api.travis-ci.org/sniksnp/versions-watch.svg?branch=master)](https://travis-ci.org/sniksnp/versions-watch)

### How to add a new version
1. Add a new SimpleVersionParserConfiguration to src/main/java/main/Conf.java OR add a new VersionParser
implementation in src/main/java/parsers
2. Add a new version parser test in src/test/java/parsers
3. Add a new version parser image in src/main/resources/static_files/im
4. Add the new version name to the 'versions' variable in src/main/resources/static_files/load_versions.js, in the 
right category
5. Setup a new Route in src/main/java/main/Main.java

### TODO
- [x] debian
- [x] git
- [x] subversion
- [x] youtrack
- [x] intellij idea
- [x] apache
- [x] mysql
- [x] eclipse
- [x] jenkins
- [x] puppet
- [x] spring
- [x] netbeans
- [x] php
- [x] tomcat
- [ ] solr
- [ ] junit
- [ ] vmware
- [ ] vagrant
- [ ] extjs
- [ ] java
- [ ] maven
- [ ] hibernate
- [ ] javascript
- [ ] ubuntu
- [ ] openssl
- [ ] openssh
- [ ] nginx
- [ ] zabbix
- [ ] elasticsearch
- [ ] kibana
- [ ] logstash
- [ ] logstash-forwarder
- [ ] nagios
- [ ] cobertura
- [ ] gatling
- [ ] scala
- [ ] selenium
- [ ] sublime text
