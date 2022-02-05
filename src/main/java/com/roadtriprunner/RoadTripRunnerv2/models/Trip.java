package com.roadtriprunner.RoadTripRunnerv2.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Trip extends AbstractEntity {

    /*
    Question: Should tripName, startingLocation and endingLocation be of a different datatype?
    See AddressComponent
    https://www.javadoc.io/doc/com.google.maps/google-maps-services/latest/com/google/maps/model/AddressComponent.html

    AutocompletePrediction and its relatives
    https://www.javadoc.io/doc/com.google.maps/google-maps-services/latest/com/google/maps/model/AutocompletePrediction.html

    FindPlaceByText
    https://www.javadoc.io/doc/com.google.maps/google-maps-services/latest/com/google/maps/model/FindPlaceFromText.html

    LatLng
    https://www.javadoc.io/doc/com.google.maps/google-maps-services/latest/com/google/maps/model/LatLng.html

    Geometry
    https://www.javadoc.io/doc/com.google.maps/google-maps-services/latest/com/google/maps/model/Geometry.html

    PlaceDetails and its relatives
    https://www.javadoc.io/doc/com.google.maps/google-maps-services/latest/com/google/maps/model/PlaceDetails.html
     */

    @NotBlank(message="A trip name is required to save your trip.")
    private String tripName;

    @NotBlank(message="Enter a starting location.")
    private String startingLocation;

    @NotBlank(message="Enter a destination.")
    private String endingLocation;

    public Trip (String startingLocation, String endingLocation) {
        this.startingLocation = startingLocation;
        this.endingLocation = endingLocation;
    }

    public Trip(String tripName, String startingLocation, String endingLocation) {
        this.tripName = tripName;
        this.startingLocation = startingLocation;
        this.endingLocation = endingLocation;
    }

    public Trip (){}
}
