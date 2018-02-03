package org.identifiers.org.cloud.ws.httpstatus.controllers;

import org.identifiers.org.cloud.ws.httpstatus.models.HttpstatusApiModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: httpstatus
 * Package: org.identifiers.org.cloud.ws.httpstatus.controllers
 * Timestamp: 2018-02-03 5:15
 * ---
 */
public class HttpstatusApiController {
    private HttpstatusApiModel httpstatusApiModel;

    public HttpstatusApiController(HttpstatusApiModel httpstatusApiModel) {
        this.httpstatusApiModel = httpstatusApiModel;
    }

    @RequestMapping(value = "{httpStatusCode}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<?> getHttpStatusCode(@PathVariable("httpStatusCode") int httpStatusCode) {
        return new ResponseEntity<>(httpstatusApiModel.getHttpstatusFrom(httpStatusCode));
    }
}
