$(function() {
  loadGitVersion();
});

function loadGitVersion() {
  $.getJSON("/git", function(data) {
    $("#git_version").text(data.git);
    loadJetbrainsVersions();
  });
}

function loadJetbrainsVersions() {
  $.getJSON("/jetbrains", function(data) {
    $("#youtrack_version").text(data.youtrack);
    $("#idea_version").text(data.idea);
    loadDebianVersion();
  });
}

function loadDebianVersion() {
  $.getJSON("/debian", function(data) {
    $("#debian_version").text(data.debian);
    loadSubversionVersion();
  });
}

function loadSubversionVersion() {
  $.getJSON("/subversion", function(data) {
    $("#subversion_version").text(data.subversion);
  });
}
