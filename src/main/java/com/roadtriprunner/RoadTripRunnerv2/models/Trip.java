package com.roadtriprunner.RoadTripRunnerv2.models;

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

    private String tripName;

    private String startingLocation;

    private String endingLocation;

    public Trip (String startingLocation, String endingLocation) {
        this.startingLocation = startingLocation;
        this.endingLocation = endingLocation;
    }

    public Trip (){}
}
