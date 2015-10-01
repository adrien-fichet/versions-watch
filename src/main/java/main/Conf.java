package main;

import parsers.VersionParserConfiguration;

import java.util.HashMap;
import java.util.Map;

public class Conf {
    private Map<String, VersionParserConfiguration> configurations;
    
    public Conf() {
        configurations = new HashMap<String, VersionParserConfiguration>();
        configurations.put("git", new VersionParserConfiguration(
                "http://git-scm.com/",
                "span.version",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("apache", new VersionParserConfiguration(
                "https://httpd.apache.org/download.cgi",
                "#apcontents > ul:nth-child(7)",
                "(([0-9]+\\.){2}[0-9]+) \\(released ([0-9]+-){2}[0-9]+\\)"
        ));
        configurations.put("debian", new VersionParserConfiguration(
                "https://www.debian.org/releases/",
                "#content dl dd:eq(1) p:eq(2)",
                "its latest update, version ([0-9]+\\.[0-9]+), was released"
        ));
        configurations.put("subversion", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Apache_Subversion",
                ".infobox tr:eq(4)",
                "Stable release (([0-9]+\\.){2}[0-9]+) \\("
        ));
        configurations.put("eclipse", new VersionParserConfiguration(
                "http://www.eclipse.org/downloads",
                "#descriptionText",
                "Eclipse [a-zA-Z]+ \\(([0-9]+\\.[0-9]+)\\) Release"
        ));
        configurations.put("mysql", new VersionParserConfiguration(
                "https://dev.mysql.com/doc/",
                "#rowid-0 > td:nth-child(2)",
                "([0-9]+\\.[0-9]+)"
        ));
        configurations.put("jenkins", new VersionParserConfiguration(
                "https://jenkins-ci.org",
                "#release > dl > dd:nth-child(2) > div:nth-child(1) > a > strong",
                "Latest and greatest \\(([0-9]+\\.[0-9]+)\\)"
        ));
        configurations.put("puppet", new VersionParserConfiguration(
                "http://docs.puppetlabs.com/references/stable/",
                "#content > div > div > div h1",
                "(([0-9]+\\.){2}[0-9]+) References"
        ));
        configurations.put("netbeans", new VersionParserConfiguration(
                "https://netbeans.org/community/releases/roadmap.html",
                "#middle > table > tbody > tr > td:nth-child(1) > div.f-page-auto-cell > center > table > tbody > tr:nth-child(4) > td:nth-child(1)",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("php", new VersionParserConfiguration(
                "https://php.net/downloads.php",
                "#layout-content",
                "Current Stable PHP (([0-9]+\\.){2}[0-9]+) \\(Changelog\\)"
        ));
        configurations.put("tomcat", new VersionParserConfiguration(
                "https://tomcat.apache.org/whichversion.html",
                "#content > div:nth-child(3) > table > tbody > tr:nth-child(3) > td:nth-child(6)",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("sublimetext", new VersionParserConfiguration(
                "https://www.sublimetext.com/",
                "#download-container > p",
                "Version (([0-9]+\\.){2}[0-9]+), "
        ));
        configurations.put("javase", new VersionParserConfiguration(
                "http://www.oracle.com/technetwork/java/javase/downloads/index.html",
                "#javasejdk > a",
                "Java SE ([0-9]+u[0-9]+)"
        ));
        configurations.put("junit", new VersionParserConfiguration(
                "http://junit.org/",
                "#projectVersion",
                "Version: ([0-9]+\\.[0-9]+)"
        ));
        configurations.put("vagrant", new VersionParserConfiguration(
                "https://www.vagrantup.com/downloads.html",
                ".description > p",
                "the latest version of Vagrant \\((([0-9]+\\.){2}[0-9]+)\\)."
        ));
        configurations.put("extjs", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Ext_JS",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(2) > td",
                "(([0-9]+\\.){2}[0-9]+) / "
        ));
        configurations.put("maven", new VersionParserConfiguration(
                "https://maven.apache.org/download.cgi",
                "#bodyColumn > div > p:nth-child(2)",
                "Apache Maven (([0-9]+\\.){2}[0-9]+) is the latest release"
        ));
        configurations.put("hibernate", new VersionParserConfiguration(
                "http://hibernate.org/orm/downloads/",
                "#content > div.row-fluid > div.span10 > div.release-bottons.visible-desktop > div > a.btn.btn-large.btn-success",
                "stable (([0-9]+\\.){2}[0-9]+)\\.Final"
        ));
        configurations.put("javascript", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/JavaScript",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td",
                "([0-9A-Za-z ]+)(\\[[0-9]*\\])? / "
        ));
        configurations.put("ubuntu", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Ubuntu_(operating_system)",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(8) > td > a",
                "([0-9]+\\.[0-9]+) "
        ));
        configurations.put("nginx", new VersionParserConfiguration(
                "http://nginx.org/en/download.html",
                "#content > table:nth-child(3) > tbody > tr > td:nth-child(2) > a:nth-child(1)",
                "nginx-(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("elasticsearch", new VersionParserConfiguration(
                "https://www.elastic.co/downloads/elasticsearch",
                "#main-wrapper > div > div > div > header:nth-child(1) > h2",
                "Elasticsearch (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("logstash", new VersionParserConfiguration(
                "https://www.elastic.co/downloads/logstash",
                "#main-wrapper > div > div > div:nth-child(1) > header:nth-child(1) > h2",
                "Logstash (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("kibana", new VersionParserConfiguration(
                "https://www.elastic.co/downloads/kibana",
                "#main-wrapper > div > div > div > header:nth-child(1) > h2",
                "Kibana (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("logstashforwarder", new VersionParserConfiguration(
                "https://github.com/elastic/logstash-forwarder/releases",
                "#js-repo-pjax-container > div.release-timeline > ul > li > .main",
                "v(([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("openssl", new VersionParserConfiguration(
                "https://www.openssl.org/source/",
                "#content > div > article > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > a:nth-child(1)",
                "openssl-(([0-9]+\\.){2}[0-9]+)[a-z]*\\.tar\\.gz"
        ));
        configurations.put("openssh", new VersionParserConfiguration(
                "http://www.openssh.com/",
                "body > table > tbody > tr:nth-child(1) > td:nth-child(3) > center:nth-child(3) > font > a",
                "OpenSSH ([0-9]+\\.[0-9]+)"
        ));
        configurations.put("zabbix", new VersionParserConfiguration(
                "http://www.zabbix.com/download.php",
                "#content > div > table:nth-child(2) > tbody > tr:nth-child(2) > td:nth-child(1)",
                "Zabbix ([0-9]+\\.[0-9]+)"
        ));
        configurations.put("nagios", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Nagios",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(4) > td",
                "(([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("cobertura", new VersionParserConfiguration(
                "https://cobertura.github.io/cobertura/",
                "#main_content > h3",
                "Cobertura (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("gatling", new VersionParserConfiguration(
                "http://gatling.io/views/docs.html",
                "h1",
                "Latest release : Gatling (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("scala", new VersionParserConfiguration(
                "http://www.scala-lang.org/",
                "body > div.container.central > div.central-btn.scala-version",
                "Scala (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("selenium", new VersionParserConfiguration(
                "http://www.seleniumhq.org/download/",
                "#mainContent > p:nth-child(5) > a",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("virtualbox", new VersionParserConfiguration(
                "https://www.virtualbox.org/wiki/Downloads",
                "#wikipage > ul:nth-child(5) > li > ul > li:nth-child(3) > strong > a",
                "VirtualBox (([0-9]+\\.){2}[0-9]+) for Linux hosts"
        ));
        configurations.put("windows", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Microsoft_Windows",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(8) > td",
                ".*?\\(v(([0-9]+\\.){2}[0-9]+)\\)"
        ));
        configurations.put("centos", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/CentOS",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(8) > td > p",
                "([0-9]+\\.[0-9]+)-[0-9]+ "
        ));
        configurations.put("fedora", new VersionParserConfiguration(
                "https://getfedora.org/en/workstation/download/",
                "#head > div > div > div > h2",
                "Download Fedora ([0-9]+) Workstation"
        ));
        configurations.put("proxmox", new VersionParserConfiguration(
                "http://www.proxmox.com/en/downloads/category/iso-images-pve",
                "#yoo-zoo > div.items > div.row.first-row > div.width50.first-cell > div > ul > li",
                "Version: ([0-9]+\\.[0-9]+)-"
        ));
        configurations.put("sqlite", new VersionParserConfiguration(
                "https://www.sqlite.org/",
                "body > div > table:nth-child(6) > tbody > tr > td:nth-child(5) > ul:nth-child(3) > li > a",
                "Version (([0-9]+\\.){2}[0-9]+)\\.[0-9]+"
        ));
        configurations.put("grunt", new VersionParserConfiguration(
                "http://gruntjs.com/",
                "body > div.content > div > div > div.span3 > div > div.latest-version > ul > li:nth-child(1) > a",
                "v(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("emacs", new VersionParserConfiguration(
                "https://www.gnu.org/software/emacs/",
                "#content > p:nth-child(7) > b",
                "The current stable release is ([0-9]+\\.[0-9]+)"
        ));
        configurations.put("python", new VersionParserConfiguration(
                "https://www.python.org/downloads/",
                "#touchnav-wrapper > header > div > div.header-banner > div > div.download-os-source > p > a:nth-child(1)",
                "Download Python (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("vim", new VersionParserConfiguration(
                "http://www.vim.org/",
                "body > table:nth-child(2) > tbody > tr > td:nth-child(3) > table > tbody > tr > td > table:nth-child(1) > tbody > tr > td:nth-child(2) > small",
                "Vim ([0-9]+\\.[0-9]+)\\.[0-9]+ is the current version"
        ));
        configurations.put("awesome", new VersionParserConfiguration(
                "http://awesome.naquadah.org/download/",
                "#left > p:nth-child(3)",
                "Latest stable version of awesome is version (([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("i3", new VersionParserConfiguration(
                "https://i3wm.org/",
                "#download > a",
                "Download the latest version (([0-9]+\\.){1,2}[0-9]+)"
        ));
        configurations.put("linux", new VersionParserConfiguration(
                "https://www.kernel.org/",
                "#latest_link > a",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("xfce", new VersionParserConfiguration(
                "http://www.xfce.org/download",
                "#stable",
                "Stable release ([0-9]+\\.[0-9]+)"
        ));
        configurations.put("elasticdump", new VersionParserConfiguration(
                "https://www.npmjs.com/package/elasticdump",
                "body > div.container.content > div.sidebar > ul:nth-child(2) > li:nth-child(2) > strong",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("solr", new VersionParserConfiguration(
                "https://lucene.apache.org/index.html",
                "#sidebar > div:nth-child(5)",
                "Apache Solr (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("jquery", new VersionParserConfiguration(
                "https://jquery.com/",
                "#banner-secondary > div.downloads-box.four.columns.push-eight > div > a > span:nth-child(2)",
                "v.*? or v(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("nexus", new VersionParserConfiguration(
                "https://books.sonatype.com/nexus-book/index.html",
                "#preamble > div > div:nth-child(2) > p > a",
                "Sonatype Nexus ([0-9]+\\.[0-9]+) - go there now"
        ));
        configurations.put("googlechrome", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Google_Chrome",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(4) > td > p:nth-child(2)",
                "([0-9]+\\.[0-9]+)(\\.[0-9]+){2} \\("
        ));
        configurations.put("firefox", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Firefox",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td > p",
                "(([0-9]+\\.){1,2}[0-9]+) \\("
        ));
        configurations.put("gnomeshell", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/GNOME_Shell",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td",
                "(([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("kde", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/KDE_Software_Compilation",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td",
                "(([0-9]+\\.){2}[0-9]+) \\("
        ));
        configurations.put("docker", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Docker_(software)",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td",
                "(([0-9]+\\.){2}[0-9]+)\\["
        ));
        configurations.put("kali", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Kali_Linux",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(6) > td",
                "([0-9]+\\.[0-9]+)(\\[|\\()"
        ));
        configurations.put("visualstudio", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Microsoft_Visual_Studio",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(4) > td",
                "([0-9]+ RTM) \\("
        ));
        configurations.put("bower", new VersionParserConfiguration(
                "https://www.npmjs.com/package/bower",
                "body > div.container.content > div.sidebar > ul:nth-child(2) > li:nth-child(2) > strong",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("angularjs", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/AngularJS",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(4) > td",
                "(([0-9]+\\.){2}[0-9]+) /"
        ));
        configurations.put("curator", new VersionParserConfiguration(
                "https://github.com/elastic/curator/releases",
                "#js-repo-pjax-container > div.release-timeline > div.release.label-latest > div.release-body." +
                        "commit.open > div.release-header > h1 > a",
                "(([0-9]+\\.){2}[0-9]+) \\("
        ));
        configurations.put("coreos", new VersionParserConfiguration(
                "https://coreos.com/",
                "body > div.co-p-homepage > div.co-p-header-masthead.co-p-header-masthead-large.homepage." +
                        "co-p-background-hexagons > div.container.co-p-header-masthead-content." +
                        "co-p-header-masthead-center > div > div > div > div > div:nth-child(2) > div",
                "Latest version is CoreOS (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("safari", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Safari_(web_browser)",
                "#mw-content-text > table:nth-child(1) > tbody > tr:nth-child(5) > td > p:nth-child(1)",
                "(([0-9]+\\.){1,2}[0-9]+) "
        ));
        configurations.put("drupal", new VersionParserConfiguration(
                "https://www.drupal.org/download",
                "#download > div.core > ul > li.first.download-core > a > span",
                "Download Drupal ([0-9]+\\.[0-9]+)"
        ));
        configurations.put("foreman", new VersionParserConfiguration(
                "http://theforeman.org/",
                "#latest-news > div > div > p:nth-child(2)",
                "Foreman (([0-9]+\\.){1,2}[0-9]+) "
        ));
        configurations.put("wordpress", new VersionParserConfiguration(
                "https://wordpress.org/",
                "#home-text > p:nth-child(3) > a",
                "Download\\u00a0WordPress\\u00a0([0-9]+\\.[0-9]+)"
        ));
        configurations.put("internetexplorer", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Internet_Explorer",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(6) > td > div > ul > li:nth-child(1)",
                "Windows: (([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("nmap", new VersionParserConfiguration(
                "https://nmap.org/download.html",
                "body > table:nth-child(2) > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr > td > p:nth-child(18) > a:nth-child(2)",
                "nmap-([0-9]+\\.[0-9]+)([a-zA-Z0-9]+)?\\.tar\\.bz2"
        ));
        configurations.put("edge", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Microsoft_Edge",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td",
                "Windows [0-9]+ ([0-9]+\\.[0-9]+)(\\.[0-9]+){2} [a-zA-Z]+"
        ));
        configurations.put("opera", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Opera_(web_browser)",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(5) > td",
                "([0-9]+\\.[0-9]+)(\\.[0-9]+){2}"
        ));
        configurations.put("postgresql", new VersionParserConfiguration(
                "http://www.postgresql.org/",
                "#pgFrontLatestReleasesWrap",
                "(([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("lighttpd", new VersionParserConfiguration(
                "http://www.lighttpd.net/",
                "#content > div.entry > div.entrytitle > h2 > a",
                "(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("bootstrap", new VersionParserConfiguration(
                "http://getbootstrap.com/",
                "#content > div > p.version",
                "Currently v(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("ruby", new VersionParserConfiguration(
                "https://www.ruby-lang.org/en/downloads/",
                "#content > p.summary",
                "Here you can get the latest Ruby distributions in your favorite flavor\\. The current stable " +
                        "version is (([0-9]+\\.){2}[0-9]+)\\. Please be sure to read Ruby’s License\\."
        ));
        configurations.put("zsh", new VersionParserConfiguration(
                "http://zsh.sourceforge.net/Arc/source.html",
                "body > p:nth-child(4)",
                "Download zsh (([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("ansible", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Ansible_(software)",
                "#mw-content-text > table > tbody > tr:nth-child(3) > td",
                "(([0-9]+\\.){2}[0-9]+) /"
        ));
        configurations.put("polymer", new VersionParserConfiguration(
                "https://github.com/Polymer/polymer/releases",
                "#js-repo-pjax-container > div.release-timeline > div.release.label-latest > div.release-body.commit.open > div.release-header > h1 > a",
                "v(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("fail2ban", new VersionParserConfiguration(
                "http://www.fail2ban.org/wiki/index.php/Downloads",
                "#mw-content-text > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > a",
                "fail2ban-(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("go", new VersionParserConfiguration(
                "https://golang.org/",
                "#footer",
                "Build version go(([0-9]\\.){1,2}[0-9])\\."
        ));
        configurations.put("metasploit", new VersionParserConfiguration(
                "https://github.com/rapid7/metasploit-framework/wiki/Downloads-by-Version",
                "#wiki-body > div > table:nth-child(5) > tbody > tr:nth-child(3) > td:nth-child(1) > a",
                "metasploit-(([0-9]+\\.){2}[0-9]+)-"
        ));
        configurations.put("varnish", new VersionParserConfiguration(
                "https://www.varnish-cache.org/releases",
                "#block-system-main > div > div > div > div:nth-child(1) > div > div > div > table > tbody > tr > td.views-field.views-field-title > a:nth-child(1)",
                "Varnish Cache (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("perl", new VersionParserConfiguration(
                "https://www.perl.org/",
                "#short_lists > div:nth-child(1) > div > p > a",
                "(([0-9]+\\.){2}[0-9]+) - download now"
        ));
        configurations.put("lxc", new VersionParserConfiguration(
                "https://linuxcontainers.org/lxc/introduction/",
                "body > div > p:nth-child(20)",
                "At this time, the only such release is LXC ([0-9]+\\.[0-9]+) which was released"
        ));
        configurations.put("nessus", new VersionParserConfiguration(
                "https://support.tenable.com/support-center/",
                "#contentMain > table > tbody > tr > td > h3:nth-child(3)",
                "Nessus (([0-9]+\\.){2}[0-9]+) is available!"
        ));
        configurations.put("latex", new VersionParserConfiguration(
                "http://latex-project.org/ltnews/",
                "#content > p:nth-child(1)",
                "The most recent version of LaTeX is nominally dated (([0-9]+/){2}[0-9]+) \\(",
                new String[][]{{"/", "."}}
        ));
        configurations.put("bash", new VersionParserConfiguration(
                "https://tiswww.case.edu/php/chet/bash/bashtop.html",
                "body > p:nth-child(16) > a:nth-child(1)",
                "bash-([0-9]+\\.[0-9]+)"
        ));
        configurations.put("react", new VersionParserConfiguration(
                "https://facebook.github.io/react/",
                "body > div.container > div.hero > div > div.buttons-unit > a:nth-child(2)",
                "Download React v(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("lua", new VersionParserConfiguration(
                "http://www.lua.org/versions.html",
                "body > p:nth-child(11)",
                "The current release is Lua (([0-9]+\\.){2}[0-9]+), "
        ));
        configurations.put("dart", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Dart_(programming_language)",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(6) > td",
                "(([0-9]+\\.){1,2}[0-9]+)(\\[| )"
        ));
        configurations.put("backbone", new VersionParserConfiguration(
                "http://backbonejs.org/",
                "body > div.container > table > tbody > tr:nth-child(2) > td:nth-child(1) > a",
                "Production Version \\((([0-9]+\\.){2}[0-9]+)\\)"
        ));
        configurations.put("naxsi", new VersionParserConfiguration(
                "https://github.com/nbs-system/naxsi/releases",
                "#js-repo-pjax-container > div.release-timeline > div.release.label-latest > div.release-meta > ul > li:nth-child(1) > a > span.css-truncate-target",
                "(([0-9]+\\.[0-9]+)(rc[0-9]+)?)"
        ));
        configurations.put("memcached", new VersionParserConfiguration(
                "http://memcached.org/",
                "#ver",
                "v(([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("libreoffice", new VersionParserConfiguration(
                "http://www.libreoffice.org/download/libreoffice-fresh/",
                "#content1 > div > article > div.row.col-sm-8.margin-20 > p:nth-child(8) > a",
                "Download Version (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("wireshark", new VersionParserConfiguration(
                "https://www.wireshark.org/download.html",
                "#accordion_download > div:nth-child(1) > div.panel-heading > a",
                "Stable Release \\((([0-9]+\\.){2}[0-9]+)\\)"
        ));
        configurations.put("audacity", new VersionParserConfiguration(
                "http://audacityteam.org/",
                "#download_sub > a > h1",
                "Download Audacity (([0-9]+\\.){2}[0-9]+)"
        ));
        configurations.put("chef", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Chef_(software)",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(4) > td > div > ul > li:nth-child(1)",
                ".*? (([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("vaadin", new VersionParserConfiguration(
                "https://en.wikipedia.org/wiki/Vaadin",
                "#mw-content-text > table.infobox.vevent > tbody > tr:nth-child(3) > td",
                "(([0-9]+\\.){2}[0-9]+) "
        ));
        configurations.put("kubernetes", new VersionParserConfiguration(
                "https://github.com/kubernetes/kubernetes/releases",
                "#js-repo-pjax-container > div.release-timeline > div.release.label-latest > div.release-body.commit.open > div.release-header > h1 > a",
                "Release v?(([0-9]+\\.){2}[0-9]+)"
        ));
    }

    public Map<String, VersionParserConfiguration> getConfigurations() {
        return configurations;
    }
}
