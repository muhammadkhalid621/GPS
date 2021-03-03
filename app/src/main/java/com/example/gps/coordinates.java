package com.example.gps;

public class coordinates {
    public Double latitude;
    public Double longitude;
    public String date;


    public coordinates() {
    }

    public coordinates(Double latitude, Double longitude,String date) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
    }
}
