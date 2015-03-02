$(function() {
  var versions = ['git', 'debian', 'subversion', 'youtrack', 'idea'];
  createVersionTableRows(versions);
  loadVersions(versions, 0);
});

function createVersionTableRows(versions) {
  for (var i=0; i < versions.length; i++) {
    $('#versions').append(createVersionRow(versions[i]));
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
