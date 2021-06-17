package com.knoldus;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String branch;

    public Topic(String id,String name,String branch){
        this.id=id;
        this.name=name;
        this.branch=branch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
