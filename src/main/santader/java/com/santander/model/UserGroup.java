package com.santander.model;

public class UserGroup {

    private String user;
    private String group;

    public String getUser() {
        return user;
    }

    public UserGroup setUser(String user) {
        this.user = user;
        return this;
    }

    public UserGroup setGroup(String group) {
        this.group = group;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public UserGroup(String user, String group) {
        this.user = user;
        this.group = group;
    }

    public UserGroup(){}
}
