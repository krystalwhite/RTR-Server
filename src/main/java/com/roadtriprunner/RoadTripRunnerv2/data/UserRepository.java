package com.roadtriprunner.RoadTripRunnerv2.data;

import com.roadtriprunner.RoadTripRunnerv2.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository {
    User findByUsername(String username);
}
