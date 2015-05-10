var versions = [
  {
    "category": { "id": "os", "name": "Operating Systems" },
    "items": [
      { "id": "debian", "name": "Debian" },
      { "id": "ubuntu", "name": "Ubuntu" },
      { "id": "gentoo", "name": "Gentoo" },
      { "id": "windows", "name": "Windows NT" },
      { "id": "centos", "name": "CentOS" },
      { "id": "fedora", "name": "Fedora" }
    ]
  }, {
    "category": { "id": "elk", "name": "ELK" },
    "items": [
      { "id": "elasticsearch", "name": "Elasticsearch" },
      { "id": "kibana", "name": "Kibana" },
      { "id": "logstash", "name": "Logstash" },
      { "id": "logstashforwarder", "name": "Logstash-forwarder" },
      { "id": "elasticdump", "name": "Elasticdump" }
    ]
  }, {
    "category": { "id": "ide", "name": "IDEs / Text editors" },
    "items": [
      { "id": "idea", "name": "IntelliJ IDEA" },
      { "id": "eclipse", "name": "Eclipse" },
      { "id": "netbeans", "name": "Netbeans" },
      { "id": "sublimetext", "name": "Sublime Text" },
      { "id": "emacs", name: "Emacs" },
      { "id": "vim", "name": "Vim" }
    ]
  }, {
    "category": { "id": "web", "name": "Web" },
    "items": [
      { "id": "apache", "name": "Apache" },
      { "id": "tomcat", "name": "Tomcat" },
      { "id": "extjs", "name": "ExtJS" },
      { "id": "nginx", "name": "Nginx" },
      { "id": "grunt", "name": "Grunt" },
      { "id": "jquery", "name": "jQuery" }
    ]
  }, {
    "category": { "id": "browsers", "name": "Web browsers" },
    "items": [
      { "id": "googlechrome", "name": "Google Chrome" },
      { "id": "firefox", "name": "Firefox" }
    ]
  }, {
    "category": { "id": "languages", "name": "Languages" },
    "items": [
      { "id": "php", "name": "PHP" },
      { "id": "javase", "name": "Java SE" },
      { "id": "javascript", "name": "Javascript" },
      { "id": "scala", "name": "Scala" },
      { "id": "python", "name": "Python" }
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
      { "id": "vagrant", "name": "Vagrant" },
      { "id": "virtualbox", "name": "VirtualBox" },
      { "id": "proxmox", "name": "Proxmox VE" },
      { "id": "linux", "name": "Linux kernel" }
    ]
  }, {
    "category": { "id": "sec", "name": "Sec" },
    "items": [
      { "id": "openssl", "name": "OpenSSL" },
      { "id": "openssh", "name": "OpenSSH" }
    ]
  }, {
    "category": { "id": "frameworks", "name": "Java frameworks" },
    "items": [
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
      { "id": "sqlite", "name": "SQLite" }
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
      { "id": "gnomeshell", "name": "Gnome Shell" }
    ]
  }, {
    "category": { "id": "other", "name": "Others" },
    "items": [
      { "id": "youtrack", "name": "YouTrack"},
      { "id": "solr", "name": "Solr" },
      { "id": "maven", "name": "Maven" },
      { "id": "nexus", "name": "Nexus" }
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
