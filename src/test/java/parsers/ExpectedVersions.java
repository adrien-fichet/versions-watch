package parsers;

import java.util.HashMap;
import java.util.Map;

public class ExpectedVersions {
    private Map<String, String> expectedVersions;

    public ExpectedVersions() {
        expectedVersions = new HashMap<String, String>();
        expectedVersions.put("idea", "14.1.3");
        expectedVersions.put("youtrack", "6.0.12634");
        expectedVersions.put("solr", "5.1.0");
        expectedVersions.put("spring", "4.1.6");
        expectedVersions.put("apache", "2.4.12");
        expectedVersions.put("debian", "8.0");
        expectedVersions.put("eclipse", "4.4.2");
        expectedVersions.put("git", "2.4.1");
        expectedVersions.put("javase", "8u45");
        expectedVersions.put("jenkins", "1.613");
        expectedVersions.put("mysql", "5.6");
        expectedVersions.put("netbeans", "8.0.2");
        expectedVersions.put("php", "5.6.8");
        expectedVersions.put("puppet", "4.0.0");
        expectedVersions.put("sublimetext", "2.0.2");
        expectedVersions.put("subversion", "1.8.13");
        expectedVersions.put("tomcat", "8.0.22");
        expectedVersions.put("junit", "4.12");
        expectedVersions.put("vagrant", "1.7.2");
        expectedVersions.put("extjs", "5.1.0");
        expectedVersions.put("maven", "3.3.3");
        expectedVersions.put("hibernate", "4.3.9");
        expectedVersions.put("javascript", "1.8.5");
        expectedVersions.put("ubuntu", "15.04");
        expectedVersions.put("nginx", "1.9.0");
        expectedVersions.put("elasticsearch", "1.5.2");
        expectedVersions.put("logstash", "1.4.2");
        expectedVersions.put("kibana", "4.0.2");
        expectedVersions.put("logstashforwarder", "0.4.0");
        expectedVersions.put("openssl", "1.0.2a");
        expectedVersions.put("openssh", "6.8");
        expectedVersions.put("zabbix", "2.4");
        expectedVersions.put("nagios", "4.0.8");
        expectedVersions.put("cobertura", "2.1.1");
        expectedVersions.put("gatling", "2.1.6");
        expectedVersions.put("scala", "2.11.6");
        expectedVersions.put("selenium", "2.45.0");
        expectedVersions.put("virtualbox", "4.3.28");
        expectedVersions.put("windows", "6.3.9600");
        expectedVersions.put("centos", "7.1503");
        expectedVersions.put("fedora", "21");
        expectedVersions.put("proxmox", "3.4-3f2d890e-1");
        expectedVersions.put("sqlite", "3.8.10.1");
        expectedVersions.put("grunt", "0.4.5");
        expectedVersions.put("emacs", "24.5");
        expectedVersions.put("python", "3.4.3");
        expectedVersions.put("vim", "7.4.729");
        expectedVersions.put("awesome", "3.5.6");
        expectedVersions.put("i3", "4.10.2");
        expectedVersions.put("linux", "4.0.3");
        expectedVersions.put("xfce", "4.12");
        expectedVersions.put("elasticdump", "0.12.0");
        expectedVersions.put("solr", "5.1.0");
        expectedVersions.put("jquery", "2.1.4");
        expectedVersions.put("nexus", "2.11.2");
        expectedVersions.put("googlechrome", "42.0.2311.152");
        expectedVersions.put("firefox", "38.0");
        expectedVersions.put("gnomeshell", "3.16");
    }

    public Map<String, String> getExpectedVersions() {
        return expectedVersions;
    }
}
