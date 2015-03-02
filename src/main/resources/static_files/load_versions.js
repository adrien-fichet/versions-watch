$(function() {
  var singleVersions = ['git', 'debian', 'subversion'];
  var multipleVersions = [['jetbrains', ['youtrack', 'idea']]];
  createVersionTableRows(singleVersions, multipleVersions);
  loadSingleVersions(singleVersions, 0, [loadMultipleVersions, multipleVersions, null]);
});

function createVersionTableRows(singleVersions, multipleVersions) {
  for (var i=0; i < singleVersions.length; i++) {
    $('#versions').append(createVersionRow(singleVersions[i]));
  }
  for (var i=0; i < multipleVersions.length; i++) {
    for (var j=0; j < multipleVersions[i][1].length; j++) {
      $('#versions').append(createVersionRow(multipleVersions[i][1][j]));
    }
  }
}

function createVersionRow(name) {
  var formattedName = name.charAt(0).toUpperCase() + name.slice(1);
  return '<tr>' +
    '<td class="icon"><img src="/im/' + name + '.jpg"/></td>' +
    '<td>' + formattedName + '</td>' +
    '<td id="' + name + '">loading...</td>' +
    '</tr>';
}

function loadSingleVersions(versions, index, args) {
  $.getJSON('/' + versions[index], function(data) {
    $('#' + versions[index]).text(data[versions[index]]);
    if (index < versions.length - 1) {
      loadSingleVersions(versions, index + 1, args);
    } else {
      args[0](args[1], 0, args[2]);
    }
  });
}

function loadMultipleVersions(versions, index, args) {
  $.getJSON('/' + versions[index][0], function(data) {
    for (var i=0; i < versions[index][1].length; i++) {
      $('#' + versions[index][1][i]).text(data[versions[index][1][i]]);
    }
    if (index < versions.length - 1) {
      loadMultipleVersions(versions, index + 1, args);
    }
  });
}
