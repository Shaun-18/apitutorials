package org.example.springboot;

import java.util.ArrayList;
import java.util.List;

public class softwareDevelopers {
private  int id;
private String name;
private String email;
private List<String> techStack = new ArrayList<>();
private String password;

    public softwareDevelopers(int id, String email, String name, List<String> techStack, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.techStack = techStack;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
