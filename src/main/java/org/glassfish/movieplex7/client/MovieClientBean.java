
package org.glassfish.movieplex7.client;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * Java Magazine January/February 2014
 * 
 * @author maggioni
 */

@Named
@SessionScoped
public class MovieClientBean implements Serializable {
   
    Client client;
    WebTarget target;
  
    @PostConstruct
    public void init() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/moviplex7/webresources/movie/");
    }
    
    @PreDestroy
    public void destroy() {
        client.close();
    }
    
    
}
