package com.example.aw.berita.model;

import com.example.aw.berita.Timeline;

/**
 * Created by AW on 3/14/2017.
 */

public class TimelineItem {
    String username, timestamp, link, status;

    public TimelineItem(){
        //empty constructur
    }

    public TimelineItem(String username, String timestamp, String link, String status) {
        this.username = username;
        this.timestamp = timestamp;
        this.link = link;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
