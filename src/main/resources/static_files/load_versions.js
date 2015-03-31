$(function() {
  var versions = [
    {
      "category": { "id": "ops", "name": "Ops" },
      "items": [
        { "id": "jenkins", "name": "Jenkins" },
        { "id": "puppet", "name": "Puppet" },
        { "id": "vagrant", "name": "Vagrant" },
        { "id": "openssl", "name": "OpenSSL" },
        { "id": "openssh", "name": "OpenSSH" }
      ]
    }, {
      "category": { "id": "monitoring", "name": "Monitoring" },
      "items": [
        { "id": "elasticsearch", "name": "Elasticsearch" },
        { "id": "kibana", "name": "Kibana" },
        { "id": "logstash", "name": "Logstash" },
        { "id": "logstashforwarder", "name": "Logstash-forwarder" },
        { "id": "zabbix", "name": "Zabbix" }
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
        { "id": "nginx", "name": "Nginx" }
      ]
    }, {
      "category": { "id": "other", "name": "Others" },
      "items": [
        { "id": "youtrack", "name": "YouTrack"},
        { "id": "mysql", "name": "MySQL" },
        { "id": "solr", "name": "Solr" },
        { "id": "maven", "name": "Maven" }
      ]
    }, {
      "category": { "id": "languages", "name": "Languages" },
      "items": [
        { "id": "php", "name": "PHP" },
        { "id": "java", "name": "Java SE" },
        { "id": "javascript", "name": "Javascript" }
      ]
    }, {
      "category": { "id": "frameworks", "name": "Java frameworks" },
      "items": [
        { "id": "spring", "name": "Spring" },
        { "id": "junit", "name": "JUnit" },
        { "id": "hibernate", "name": "Hibernate" }
      ]
    }, {
      "category": { "id": "os", "name": "Operating Systems" },
      "items": [
        { "id": "debian", "name": "Debian" },
        { "id": "ubuntu", "name": "Ubuntu" }
      ]
    }, {
      "category": { "id": "scm", "name": "SCMs" },
      "items": [
        { "id": "git", "name": "Git" },
        { "id": "subversion", "name": "Subversion" }
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
  return '<tr><td class="icon"><img src="/im/' + item.id + '.png"/></td><td>' + item.name + '</td>' +
    '<td id="' + item.id + '"><img class="loading" src="/im/loading.gif" alt="loading..." /></td></tr>';
}

function loadVersionsItems(versionsItems, index) {
  var currentItemId = versionsItems[index].id;
  $.getJSON('/' + currentItemId, function(data) {
    $('#' + currentItemId).text(data[currentItemId]);
    if (index < versionsItems.length - 1) {
      loadVersionsItems(versionsItems, index + 1);
    }
  });
}
