package com.example.demo.domain;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tab")
public class Tab implements Serializable {

    private static final long serialVersionUID = 456789l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tabId")
    private long tabId;

    public long getTabId() {
        return tabId;
    }

    public void setTabId(long tabId) {
        this.tabId = tabId;
    }

    @Column(name = "tabName", nullable = false)
    private String tabName;

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    @Column(name = "createdBy")
    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "createdAt")
    private String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    protected Tab(){}

    public Tab(String tabName, String createdBy, String createdAt) {
        this.tabName = tabName;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }
}
