[![Build Status](https://api.travis-ci.org/sniksnp/versions-watch.svg?branch=master)](https://travis-ci.org/sniksnp/versions-watch)

### How to add a new version
1. Add a new SimpleVersionParserConfiguration to src/main/java/main/Conf.java OR add a new VersionParser
implementation in src/main/java/parsers
2. Add a new version parser test in src/test/java/parsers (based on a local test file instead of a remote website)
3. Setup a new Route in src/main/java/main/Main.java
4. Add a new version parser image in src/main/resources/static_files/im
5. Add a new item to the 'versions' variable in src/main/resources/static_files/load_versions.js, in the 
right category

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
- [x] sublime text
- [x] java
- [x] solr
- [x] junit
- [x] vagrant
- [x] extjs
- [x] maven
- [x] hibernate
- [x] javascript
- [x] ubuntu
- [x] nginx
- [x] elasticsearch
- [x] kibana
- [x] logstash
- [x] logstash-forwarder
- [x] openssl
- [x] openssh
- [x] zabbix
- [x] nagios
- [x] cobertura
- [x] gatling
- [x] scala
- [x] selenium
- [x] virtualbox
- [x] gentoo
- [x] windows
- [x] centos
- [x] fedora
- [ ] archlinux
- [ ] vim
- [ ] emacs
- [ ] gnome
- [ ] xfce
- [ ] linux kernel
- [ ] jquery
- [ ] grunt
- [ ] bower
- [ ] angularjs
- [ ] elasticdump
- [ ] curator
- [ ] coreos
- [ ] firefox
- [ ] google chrome
- [ ] chromium
- [ ] safari
- [ ] internet explorer
- [ ] opera
- [ ] drupal
- [ ] wordpress
