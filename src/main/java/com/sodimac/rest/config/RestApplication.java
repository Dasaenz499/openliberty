package com.sodimac.rest.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@ApplicationPath("/api")
@OpenAPIDefinition(info = @Info(title = "PurchaseDService",version = "2.4.2",description = "12/08/2020 14:00"))
public class RestApplication extends Application{}
