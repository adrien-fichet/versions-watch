var versions = [
  {
    "category": { "id": "os", "name": "Operating Systems" },
    "items": [
      { "id": "debian", "name": "Debian" },
      { "id": "ubuntu", "name": "Ubuntu" },
      { "id": "gentoo", "name": "Gentoo" },
      { "id": "windows", "name": "Windows NT" },
      { "id": "centos", "name": "CentOS" },
      { "id": "fedora", "name": "Fedora" },
      { "id": "kali", "name": "Kali" },
      { "id": "coreos", "name": "CoreOS" }
    ]
  }, {
    "category": { "id": "elk", "name": "ELK" },
    "items": [
      { "id": "elasticsearch", "name": "Elasticsearch" },
      { "id": "kibana", "name": "Kibana" },
      { "id": "logstash", "name": "Logstash" },
      { "id": "logstashforwarder", "name": "Logstash-forwarder" },
      { "id": "elasticdump", "name": "Elasticdump" },
      { "id": "curator", "name": "Curator" }
    ]
  }, {
    "category": { "id": "ide", "name": "IDEs / Text editors" },
    "items": [
      { "id": "idea", "name": "IntelliJ IDEA" },
      { "id": "eclipse", "name": "Eclipse" },
      { "id": "netbeans", "name": "Netbeans" },
      { "id": "sublimetext", "name": "Sublime Text" },
      { "id": "emacs", name: "Emacs" },
      { "id": "vim", "name": "Vim" },
      { "id": "visualstudio", "name": "Visual Studio" }
    ]
  }, {
    "category": { "id": "web_servers", "name": "Web servers" },
    "items": [
      { "id": "apache", "name": "Apache" },
      { "id": "nginx", "name": "Nginx" },
      { "id": "lighttpd", "name": "lighttpd" }
    ]
  }, {
    "category": { "id": "web_tools", "name": "Web tools" },
    "items": [
      { "id": "grunt", "name": "Grunt" },
      { "id": "bower", "name": "Bower" },
      { "id": "varnish", "name": "Varnish" },
      { "id": "memcached", "name": "Memcached" }
    ]
  }, {
    "category": { "id": "web_frameworks", "name": "Web frameworks" },
    "items": [
      { "id": "extjs", "name": "ExtJS" },
      { "id": "jquery", "name": "jQuery" },
      { "id": "angularjs", "name": "Angular JS" },
      { "id": "drupal", "name": "Drupal" },
      { "id": "wordpress", "name": "WordPress" },
      { "id": "bootstrap", "name": "Bootstrap" },
      { "id": "polymer", "name": "Polymer" },
      { "id": "react", "name": "React" },
      { "id": "backbone", "name": "Backbone" }
    ]
  }, {
    "category": { "id": "browsers", "name": "Web browsers" },
    "items": [
      { "id": "googlechrome", "name": "Google Chrome" },
      { "id": "firefox", "name": "Firefox" },
      { "id": "safari", "name": "Safari" },
      { "id": "internetexplorer", "name": "Internet Explorer" },
      { "id": "edge", "name": "Edge" },
      { "id": "opera", "name": "Opera" }
    ]
  }, {
    "category": { "id": "languages", "name": "Languages" },
    "items": [
      { "id": "php", "name": "PHP" },
      { "id": "javascript", "name": "Javascript" },
      { "id": "scala", "name": "Scala" },
      { "id": "python", "name": "Python" },
      { "id": "ruby", "name": "Ruby" },
      { "id": "go", "name": "Go" },
      { "id": "perl", "name": "Perl" },
      { "id": "latex", "name": "LaTeX" },
      { "id": "lua", "name": "Lua" },
      { "id": "dart", "name": "Dart" }
    ]
  }, {
    "category": { "id": "testing", "name": "Testing" },
    "items": [
      { "id": "junit", "name": "JUnit" },
      { "id": "cobertura", "name": "Cobertura" },
      { "id": "gatling", "name": "Gatling" },
      { "id": "selenium", "name": "Selenium" }
    ]
  }, {
    "category": { "id": "ops", "name": "Ops" },
    "items": [
      { "id": "jenkins", "name": "Jenkins" },
      { "id": "puppet", "name": "Puppet" },
      { "id": "linux", "name": "Linux kernel" },
      { "id": "foreman", "name": "Foreman" },
      { "id": "zsh", "name": "zsh" },
      { "id": "ansible", "name": "Ansible" },
      { "id": "bash", "name": "Bash" },
      { "id": "wireshark", "name": "Wireshark" }
    ]
  }, {
    "category": { "id": "virtualization", "name": "Virtualization" },
    "items": [
      { "id": "vagrant", "name": "Vagrant" },
      { "id": "virtualbox", "name": "VirtualBox" },
      { "id": "proxmox", "name": "Proxmox VE" },
      { "id": "docker", "name": "Docker" },
      { "id": "lxc", "name": "LXC" }
    ]
  }, {
    "category": { "id": "sec", "name": "Sec" },
    "items": [
      { "id": "openssl", "name": "OpenSSL" },
      { "id": "openssh", "name": "OpenSSH" },
      { "id": "nmap", "name": "Nmap" },
      { "id": "fail2ban", "name": "Fail2ban" },
      { "id": "metasploit", "name": "Metasploit Frwk" },
      { "id": "nessus", "name": "Nessus" },
      { "id": "naxsi", "name": "Naxsi" }
    ]
  }, {
    "category": { "id": "java", "name": "Java" },
    "items": [
      { "id": "javase", "name": "Java SE" },
      { "id": "tomcat", "name": "Tomcat" },
      { "id": "spring", "name": "Spring" },
      { "id": "hibernate", "name": "Hibernate" }
    ]
  }, {
    "category": { "id": "monitoring", "name": "Monitoring" },
    "items": [
      { "id": "zabbix", "name": "Zabbix" },
      { "id": "nagios", "name": "Nagios" }
    ]
  }, {
    "category": { "id": "scm", "name": "SCMs" },
    "items": [
      { "id": "git", "name": "Git" },
      { "id": "subversion", "name": "Subversion" }
    ]
  }, {
    "category": { "id": "databases", "name": "Databases" },
    "items": [
      { "id": "mysql", "name": "MySQL" },
      { "id": "sqlite", "name": "SQLite" },
      { "id": "postgresql", "name": "PostgreSQL"}
    ]
  }, {
    "category": { "id": "windowmanagers", "name": "Window managers" },
    "items": [
      { "id": "i3", "name": "i3" },
      { "id": "awesome", "name": "Awesome" }
    ]
  }, {
    "category": { "id": "desktopenvironments", "name": "Desktop environments" },
    "items": [
      { "id": "xfce", "name": "XFCE" },
      { "id": "gnomeshell", "name": "Gnome Shell" },
      { "id": "kde", "name": "KDE" }
    ]
  }, {
    "category": { "id": "other", "name": "Others" },
    "items": [
      { "id": "youtrack", "name": "YouTrack"},
      { "id": "solr", "name": "Solr" },
      { "id": "maven", "name": "Maven" },
      { "id": "nexus", "name": "Nexus" },
      { "id": "libreoffice", "name": "LibreOffice" },
      { "id": "audacity", "name": "Audacity" }
    ]
  }
];

var nbOfItemImagesLoaded = 0;
var nbOfItems = [].concat.apply([], $.map(versions, function(version) { return version.items; })).length;

function incrementNbOfItemImagesLoaded() {
  nbOfItemImagesLoaded++;
  if (nbOfItemImagesLoaded == nbOfItems) {
    $.each(versions, function(index, version) {
      loadVersionsItems(version.items, 0)
    });
  }
}

$(function() {
  $.each(versions, function(index, version) {
    $('#content').append('<table id="' + version.category.id + '"><tr><th colspan="3">' + version.category.name + '</th></tr></table>');
    $.each(version.items, function(index, item) {
      $('#' + version.category.id).append(createVersionRow(item));
    });
  });
});

function createVersionRow(item) {
  return '<tr>' +
    '<td class="icon"><img src="/im/' + item.id + '.png" onload="incrementNbOfItemImagesLoaded()" /></td>' +
    '<td class="name">' + item.name + '</td>' +
    '<td class="version" id="' + item.id + '">' +
    '<img class="loading" src="/im/loading.gif" alt="loading..." />' +
    '</td>' +
    '</tr>';
}

function loadVersionsItems(versionsItems, index) {
  var currentItemId = versionsItems[index].id;
  if (currentItemId == "gentoo") {
    $('#gentoo').html('<a href="https://www.youtube.com/watch?v=VjGSMUep6_4">install it</a>');
    loadNextVersionItem(versionsItems, index);
  } else {
    $.getJSON('/' + currentItemId, function(data) {
      $('#' + currentItemId).text(data[currentItemId]);
    }).fail(function() {
      $('#' + currentItemId).text('Unknown');
    }).always(function() {
      loadNextVersionItem(versionsItems, index);
    });
  }
}

function loadNextVersionItem(versionsItems, index) {
  if (index < versionsItems.length - 1) {
    loadVersionsItems(versionsItems, index + 1);
  }
}
