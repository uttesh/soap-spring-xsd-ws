/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uttesh.xsd.rest;

/**
 *
 * @author  Uttesh Kumar T.H.
 */
import generated.Invitation;
import generated.Response;
public class InvitationServiceImpl implements InvitationService{

    @Override
    public Response sayHello(Invitation inv){
       try{
            Response wl = new Response();
            wl.setName(inv.getName());
            wl.setMessage("Hello "+inv.getName()+", Welcom to Webservice :) ");
            return wl;
        }catch(Exception e){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }




    
}
