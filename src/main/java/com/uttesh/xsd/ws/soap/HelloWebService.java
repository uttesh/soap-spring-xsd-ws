/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uttesh.xsd.ws.soap;

import com.uttesh.xsd.rest.InvitationService;
import generated.Invitation;
import generated.Response;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author Uttesh Kumar T.H.
 */
@WebService
public class HelloWebService extends SpringBeanAutowiringSupport{
    
    private final Logger logger = Logger.getLogger(HelloWebService.class);
    
    @Autowired
    private InvitationService invitationService;

    @WebMethod(exclude = true)
    public void setInvitationService(InvitationService invitationService) {
        this.invitationService = invitationService;
    }
    
    @WebMethod
    public Response Invite(Invitation invitation){
        return invitationService.sayHello(invitation);
    }
    
}
