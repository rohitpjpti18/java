package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @RequestMapping(value="/{licenseId}", method=RequestMethod.GET)
    public License getLicenses(
        @PathVariable("organizationId") String organizationId, 
        @PathVariable("licenseId") String licenseId){
        
        return new License()
            .withId(licenseId)
            .withProductName("Teleco")
            .withLicenseType("Seat")
            .withOrganizationId("TestOrg");
    }
}
