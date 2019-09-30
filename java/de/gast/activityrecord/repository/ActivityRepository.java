package de.gast.activityrecord.repository;

import de.gast.activityrecord.entity.Activity;
import org.springframework.data.repository.CrudRepository;


public interface ActivityRepository extends CrudRepository<Activity, Integer> {

    Activity findBySessionIdAndClientIp(String sessionId, String clientIp);


}
