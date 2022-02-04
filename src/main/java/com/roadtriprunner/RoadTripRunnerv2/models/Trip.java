package com.roadtriprunner.RoadTripRunnerv2.models;

public class Trip extends AbstractEntity {

    private String tripName;

    private String startingLocation;

    private String endingLocation;

    public Trip (String startingLocation, String endingLocation) {
        this.startingLocation = startingLocation;
        this.endingLocation = endingLocation;
    }

    public Trip (){}
}
