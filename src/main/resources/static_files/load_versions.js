$(function() {
  var versions = [
    {
      "category": { "id": "ide", "name": "IDEs / Text editors" },
      "items": [
        { "id": "idea", "name": "IntelliJ IDEA" },
        { "id": "eclipse", "name": "Eclipse" },
        { "id": "netbeans", "name": "Netbeans" },
        { "id": "sublime_text", "name": "Sublime Text" }
      ]
    }, {
      "category": { "id": "scm", "name": "SCMs" },
      "items": [
        { "id": "git", "name": "Git" },
        { "id": "subversion", "name": "Subversion" }
      ]
    }, {
      "category": { "id": "languages", "name": "Languages" },
      "items": [
        { "id": "php", "name": "PHP" },
        { "id": "java", "name": "Java SE" }
      ]
    }, {
      "category": { "id": "web", "name": "Web" },
      "items": [
        { "id": "apache", "name": "Apache" },
        { "id": "tomcat", "name": "Tomcat" },
        { "id": "extjs", "name": "ExtJS" }
      ]
    }, {
      "category": { "id": "ops", "name": "Ops" },
      "items": [
        { "id": "debian", "name": "Debian" },
        { "id": "jenkins", "name": "Jenkins" },
        { "id": "puppet", "name": "Puppet" },
        { "id": "vagrant", "name": "Vagrant" }
      ]
    }, {
      "category": { "id": "other", "name": "Others" },
      "items": [
        { "id": "youtrack", "name": "YouTrack"},
        { "id": "mysql", "name": "MySQL" },
        { "id": "spring", "name": "Spring" },
        { "id": "solr", "name": "Solr" },
        { "id": "junit", "name": "JUnit" },
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
