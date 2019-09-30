package de.gast.activityrecord.repository;

import de.gast.activityrecord.entity.Route;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface RouteRepository extends CrudRepository<Route, Integer> {

    List<Route> findByDomainAndTimeStampBefore(String domain, Date timestamp);

}
