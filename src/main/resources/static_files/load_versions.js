$(function() {
  var versions = [
    {
      "category": "IDEs",
      "items": [{
        "id": "idea",
        "name": "IntelliJ IDEA"
      }, {
        "id": "eclipse",
        "name": "Eclipse"
      }, {
        "id": "netbeans",
        "name": "Netbeans"
      }]
    }, {
      "category": "SCMs",
      "items": [{
        "id": "git",
        "name": "Git"
      }, {
        "id": "subversion",
        "name": "Subversion"
      }]
    }, {
      "category": "Languages",
      "items": [{
        "id": "php",
        "name": "PHP"
      }]
    }, {
      "category": "Web",
      "items": [{
        "id": "apache",
        "name": "Apache"
      }, {
        "id": "tomcat",
        "name": "Tomcat"
      }]
    }, {
      "category": "Others",
      "items": [{
        "id": "debian",
        "name": "Debian"
      }, {
        "id": "youtrack",
        "name": "YouTrack"
      }, {
        "id": "mysql",
        "name": "MySQL"
      }, {
        "id": "jenkins",
        "name": "Jenkins"
      }, {
        "id": "puppet",
        "name": "Puppet"
      }, {
        "id": "spring",
        "name": "Spring"
      }]
    }
  ];
  createVersionsTables(versions);
  for (var i=0; i < versions.length; i++) {
    loadVersionsItems(versions[i].items, 0);
  }
});

function createVersionsTables(versions) {
  for (var i=0; i < versions.length; i++) {
    $('#content').append('<table id="' + versions[i].category + '"><tr><th colspan="3">' + versions[i].category + '</th></tr></table>');
    for (var j=0; j < versions[i].items.length; j++) {
      $('#' + versions[i].category).append(createVersionRow(versions[i].items[j]));
    }
  }
}

function createVersionRow(item) {
  return '<tr><td class="icon"><img src="/im/' + item.id + '.png"/></td><td>' + item.name + '</td>' +
    '<td id="' + item.id + '">loading...</td></tr>';
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
