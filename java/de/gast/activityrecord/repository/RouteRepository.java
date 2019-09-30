package de.gast.activityrecord.repository;

import org.springframework.data.repository.CrudRepository;

import de.gast.activityrecord.entity.Route;

import java.util.Date;
import java.util.List;

public interface RouteRepository extends CrudRepository<Route, Integer>{

    List<Route> findByDomainAndTimeStampBefore(String domain, Date timestamp);

}
