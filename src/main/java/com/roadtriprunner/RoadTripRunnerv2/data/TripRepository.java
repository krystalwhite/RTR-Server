package com.roadtriprunner.RoadTripRunnerv2.data;

import com.roadtriprunner.RoadTripRunnerv2.models.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends CrudRepository<Trip, Integer> {
    Trip findByTripName(String tripName);
    Trip findByStartingLocation(String startingLocation);
    Trip findByEndingLocation(String endingLocation);
}
