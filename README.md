[![Build Status](https://api.travis-ci.org/sniksnp/versions-watch.svg?branch=master)](https://travis-ci.org/sniksnp/versions-watch)

### How to add a new version
```
If the new version can be retrieved using SimpleVersionParser :
  1.1 Add a new item to the 'configurations' map in src/main/java/main/Conf.java
  1.2 Add the expected version to the 'expectedVersions' map in 
      src/test/java/parsers/ExpectedVersions.java
  1.3 Launch src/test/java/TestFilesUpdate to update the HTML test files 
      (and download the new one)
  1.4 Launch tests and fix them
Else :
  1.1 Add a new VersionParser implementation in src/main/java/parsers
  1.2 Manually download the HTML test file
  1.2 Add a new version parser test in src/test/java/parsers
  1.3 Setup a new Route in src/main/java/main/Main.java
Then :
  2. Add a new version parser image in src/main/resources/static_files/im
  3. Add a new item to the 'versions' variable in 
     src/main/resources/static_files/load_versions.js, in the right category
```

### Versions list
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
- [x] proxmox ve
- [x] sqlite
- [x] grunt
- [x] emacs
- [x] python
- [x] vim
- [x] awesome
- [x] i3
- [x] linux kernel
- [x] xfce
- [x] elasticdump
- [x] jquery
- [x] nexus
- [x] google chrome
- [x] firefox
- [x] gnome shell
- [x] kde
- [x] docker
- [x] visual studio
- [x] bower
- [x] angularjs
- [x] curator
- [x] coreos
- [x] safari
- [x] drupal
- [x] foreman
- [x] wordpress
- [x] kali
- [x] internet explorer
- [x] nmap
- [x] edge
- [x] opera
- [x] postgresql
- [x] lighttpd
- [x] bootstrap
- [x] ruby
- [ ] lxc
- [ ] openvz
- [ ] nessus
- [ ] metasploit
- [ ] latex
- [ ] bash
- [ ] zsh
- [ ] css
- [ ] html
- [ ] perl
- [ ] lisp
- [ ] lua
- [ ] dart
- [ ] polymer
- [ ] react
- [ ] backbone
- [ ] emberjs
- [ ] openbox
- [ ] naxsi
- [ ] fail2ban
- [ ] memcached
- [ ] varnish
- [ ] openbsd
- [ ] dropbox
- [ ] wireshark
- [ ] ansible
- [ ] chef
- [ ] salt

### Ideas
- version numbers should also be links to versions websites
