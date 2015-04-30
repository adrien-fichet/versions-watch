$(function() {
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
        { "id": "logstashforwarder", "name": "Logstash-forwarder" }
      ]
    }, {
      "category": { "id": "ide", "name": "IDEs / Text editors" },
      "items": [
        { "id": "idea", "name": "IntelliJ IDEA" },
        { "id": "eclipse", "name": "Eclipse" },
        { "id": "netbeans", "name": "Netbeans" },
        { "id": "sublime_text", "name": "Sublime Text" }
      ]
    }, {
      "category": { "id": "web", "name": "Web" },
      "items": [
        { "id": "apache", "name": "Apache" },
        { "id": "tomcat", "name": "Tomcat" },
        { "id": "extjs", "name": "ExtJS" },
        { "id": "nginx", "name": "Nginx" },
        { "id": "grunt", "name": "Grunt" }
      ]
    }, {
      "category": { "id": "languages", "name": "Languages" },
      "items": [
        { "id": "php", "name": "PHP" },
        { "id": "java", "name": "Java SE" },
        { "id": "javascript", "name": "Javascript" },
        { "id": "scala", "name": "Scala" }
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
        { "id": "proxmox", "name": "Proxmox VE" }
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
    },  {
      "category": { "id": "other", "name": "Others" },
      "items": [
        { "id": "youtrack", "name": "YouTrack"},
        { "id": "solr", "name": "Solr" },
        { "id": "maven", "name": "Maven" }
      ]
    }
  ];
  createVersionsTables(versions);
  for (var i=0; i < versions.length; i++) {
    loadVersionsItems(versions[i].items, 0);
  }
});

function createVersionsTables(versions) {
  for (var i=0; i < versions.length; i++) {
    var currentCategory = versions[i].category;
    $('#content').append('<table id="' + currentCategory.id + '"><tr><th colspan="3">' + currentCategory.name + '</th></tr></table>');
    for (var j=0; j < versions[i].items.length; j++) {
      $('#' + currentCategory.id).append(createVersionRow(versions[i].items[j]));
    }
  }
}

function createVersionRow(item) {
  return '<tr><td class="icon"><img src="/im/' + item.id + '.png"/></td><td class="name">' + item.name + '</td>' +
    '<td class="version" id="' + item.id + '"><img class="loading" src="/im/loading.gif" alt="loading..." /></td></tr>';
}

function loadVersionsItems(versionsItems, index) {
  var currentItemId = versionsItems[index].id;
  if (currentItemId == "gentoo") {
    $('#gentoo').html('<a href="https://www.youtube.com/watch?v=VjGSMUep6_4">install it</a>');
    if (index < versionsItems.length - 1) {
      loadVersionsItems(versionsItems, index + 1);
    }
  } else {
    $.getJSON('/' + currentItemId, function(data) {
      $('#' + currentItemId).text(data[currentItemId]);
      if (index < versionsItems.length - 1) {
        loadVersionsItems(versionsItems, index + 1);
      }
    }).fail(function() {
      $('#' + currentItemId).text('Unknown');
    });
  }
}
