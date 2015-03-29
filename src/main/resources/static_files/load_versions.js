$(function() {
  var versions = [
    {"category": "IDEs", "items": ['idea', 'eclipse']},
    {"category": "SCMs", "items": ['git', 'subversion']},
    {"category": "Others", "items": ['debian', 'apache', 'youtrack', 'mysql', 'jenkins', 'puppet']}
  ];
  createVersionsTables(versions);
  for (var i=0; i < versions.length; i++) {
    loadVersions(versions[i].items, 0);
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

function createVersionRow(name) {
  var formattedName = name.charAt(0).toUpperCase() + name.slice(1);
  return '<tr><td class="icon"><img src="/im/' + name + '.jpg"/></td><td>' + formattedName + '</td>' +
    '<td id="' + name + '">loading...</td></tr>';
}

function loadVersions(versions, index) {
  $.getJSON('/' + versions[index], function(data) {
    $('#' + versions[index]).text(data[versions[index]]);
    if (index < versions.length - 1) {
      loadVersions(versions, index + 1);
    }
  });
}
