package de.gast.activityrecord.controller;

import de.gast.activityrecord.entity.Route;
import de.gast.activityrecord.service.RouteRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Routes")
public class RoutRecordController {

    private static final Logger logger = LoggerFactory.getLogger(ActivityRecordController.class);

    @Autowired
    private RouteRecordService routeRecordService;

    @RequestMapping(value = "/deleteWithDomainAndBeforeDate", method = RequestMethod.DELETE)
    public void deleteActivityRecord(@RequestParam("domain") String domain, @RequestParam("date") String dateString) {

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            logger.error(e.getMessage());
            logger.error("inappropriate date format - should be yyyy-MM-dd");

        }
        try {
            List<Route> routes = routeRecordService.deleteActivityRecord(domain, date);
            for (Route route : routes) {
                logger.debug("deleted activities for domain: {} and date:{}", route.getDomain(), route.getTimeStamp());
            }
        } catch (Exception e) {
            logger.error("failed to delete activities for domain: {} and date:{}", domain, dateString);
        }

    }
}
