package com.hargun.c0752452_mad3125_midterm.Models;

public class SpaceXFlight {
    String flight_number;
    String mission_name;
    String upcoming;
    String launch_year;
    String launch_window;
    Rocket rocket;
    Launch launch;
    Link link;
    String details;

    public SpaceXFlight() {
    }

    public SpaceXFlight(String flight_number, String mission_name, String upcoming, String launch_year, String launch_window, Rocket rocket, Launch launchSite, Link links, String details) {
        this.flight_number = flight_number;
        this.mission_name = mission_name;
        this.upcoming = upcoming;
        this.launch_year = launch_year;
        this.launch_window = launch_window;
        this.rocket = rocket;
        this.launch = launch;
        this.link = link;
        this.details = details;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public String getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(String upcoming) {
        this.upcoming = upcoming;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public void setLaunch_year(String launch_year) {
        this.launch_year = launch_year;
    }

    public String getLaunch_window() {
        return launch_window;
    }

    public void setLaunch_window(String launch_window) {
        this.launch_window = launch_window;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Launch getLaunchSite() {
        return launch;
    }

    public void setLaunchSite(Launch launchSite) {
        this.launch = launchSite;
    }

    public Link getLinks() {
        return link;
    }

    public void setLinks(Link links) {
        this.link = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "SpaceXFlight{" +
                "flight_number='" + flight_number + '\'' +
                ", mission_name='" + mission_name + '\'' +
                ", upcoming='" + upcoming + '\'' +
                ", launch_year='" + launch_year + '\'' +
                ", launch_window='" + launch_window + '\'' +
                ", rocket=" + rocket +
                ", launch=" + launch +
                ", link=" + link +
                ", details='" + details + '\'' +
                '}';
    }
}


