package de.gast.activityrecord.service;

import de.gast.activityrecord.entity.Route;

import java.util.Date;
import java.util.List;

public interface RouteRecordService {

    List<Route> deleteActivityRecord(String domain, Date date);

}
