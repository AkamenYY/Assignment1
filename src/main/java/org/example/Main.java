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


