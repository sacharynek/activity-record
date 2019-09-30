package de.gast.activityrecord.service;

import de.gast.activityrecord.entity.Route;
import de.gast.activityrecord.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RouteRecordServiceImpl implements RouteRecordService {


    private final RouteRepository routeRepository;

    @Autowired
    public RouteRecordServiceImpl(RouteRepository routeRepository) {

        this.routeRepository = routeRepository;
    }

    @Override
    public List<Route> deleteActivityRecord(String domain, Date date) {

        List<Route> routes = routeRepository.findByDomainAndTimeStampBefore(domain, date);

        routeRepository.delete(routes);

        return routes;

    }

}
