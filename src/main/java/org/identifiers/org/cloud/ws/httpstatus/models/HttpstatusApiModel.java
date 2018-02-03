package org.identifiers.org.cloud.ws.httpstatus.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: httpstatus
 * Package: org.identifiers.org.cloud.ws.httpstatus.models
 * Timestamp: 2018-02-03 5:16
 * ---
 */
@Component
public class HttpstatusApiModel {
    private static Logger logger = LoggerFactory.getLogger(HttpstatusApiModel.class);

    public HttpStatus getHttpstatusFrom(int status) {
        try {
            return HttpStatus.valueOf(status);
        } catch (IllegalArgumentException e) {
            logger.error("Illegal HTTP Status Request for status '{}'", status);
            return HttpStatus.BAD_REQUEST;
        }
    }
}
