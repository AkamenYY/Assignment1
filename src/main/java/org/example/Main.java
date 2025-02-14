package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Esportsman {
    private String name;
    private String role;

    public Esportsman() {}

    public Esportsman(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

class Organization {
    private String orgName;
    private String region;

    public Organization() {}

    public Organization(String orgName, String region) {
        this.orgName = orgName;
        this.region = region;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getRegion() {
        return region;
    }
}

@Configuration
class ProjectConfig {
    @Bean
    public Esportsman esportsman() {
        var es = new Esportsman();
        es.setName("m0nesy");
        es.setRole("AWPer");
        return es;
    }

    @Bean
    public Organization organization() {
        var org = new Organization();
        org.setOrgName("G2");
        org.setRegion("Europe");
        return org;
    }
}

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Esportsman es = context.getBean(Esportsman.class);
        Organization org = context.getBean(Organization.class);

        System.out.println("Esportsman: " + es.getName() + ", Role: " + es.getRole());
        System.out.println("Organization: " + org.getOrgName() + ", Region: " + org.getRegion());

        context.close();
    }
}
