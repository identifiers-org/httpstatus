package org.identifiers.org.cloud.ws.httpstatus.models;

import org.springframework.http.HttpStatus;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: httpstatus
 * Package: org.identifiers.org.cloud.ws.httpstatus.models
 * Timestamp: 2018-02-03 5:16
 * ---
 */
public class HttpstatusApiModel {

    public HttpStatus getHttpstatusFrom(int status) {
        try {
            return HttpStatus.valueOf(status);
        } catch (IllegalArgumentException e) {
            return HttpStatus.BAD_REQUEST;
        }
    }
}
