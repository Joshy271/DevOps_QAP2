package com.keyin.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "airport", path = "airport")
public interface airportRESTAPI extends JpaRepository<airport, Long> {
}
