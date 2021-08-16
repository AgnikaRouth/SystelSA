package com.example.otakudb.Entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "evenements")
public class evenements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "event_details", nullable = false)
    private String event_details;

    @Lob
    @Column(name = "event_imageb64", length = 1000)
    private byte[] event_imageb64;

    @CreationTimestamp
    @Column(name = "event_date")
    private Timestamp event_date;


    public evenements(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent_details() {
        return event_details;
    }

    public void setEvent_details(String event_details) {
        this.event_details = event_details;
    }

    public byte[] getEvent_imageb64() {
        return event_imageb64;
    }

    public void setEvent_imageb64(byte[] event_imageb64) {
        this.event_imageb64 = event_imageb64;
    }

    public Timestamp getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Timestamp event_date) {
        this.event_date = event_date;
    }



    public evenements(String event_details, byte[] event_imageb64, Timestamp event_date) {
        this.event_details = event_details;
        this.event_imageb64 = event_imageb64;
        this.event_date = event_date;
    }
}
