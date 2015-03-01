$(function() {
  loadGitVersion();
});

function loadGitVersion() {
  $.getJSON("/git", function(data) {
    $("#git_version").text(data.version);
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
    $("#debian_version").text(data.version);
  });
}
