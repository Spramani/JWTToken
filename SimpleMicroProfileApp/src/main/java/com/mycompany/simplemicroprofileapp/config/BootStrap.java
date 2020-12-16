package com.mycompany.simplemicroprofileapp.config;
import javax.annotation.security.DeclareRoles;
import javax.ws.rs.ApplicationPath;
import org.eclipse.microprofile.auth.LoginConfig;

@SuppressWarnings({"EmptyClass", "SuppressionAnnotation"})
@DeclareRoles({"Admin", "Supervisor"})
@LoginConfig(authMethod = "MP-JWT")
@ApplicationPath("rest")
public class BootStrap extends javax.ws.rs.core.Application {
}
