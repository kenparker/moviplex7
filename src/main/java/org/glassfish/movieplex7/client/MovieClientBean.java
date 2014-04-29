package org.glassfish.movieplex7.client;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.glassfish.movieplex7.entities.Movie;

/**
 *
 * Java Magazine January/February 2014
 * <p/>
 * @author maggioni
 */
@Named
@RequestScoped
public class MovieClientBean implements Serializable {
   
    Client client;
    WebTarget target;
  
    @Inject
    MovieBackingBean bean;
    
    @PostConstruct
    public void init()
    {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/moviplex7/webresources/movie/");
    }

    @PreDestroy
    public void destroy()
    {
        client.close();
    }
    
    public Movie[] getMovies() {
        return target.request().get(Movie[].class);
    }
    
    public Movie getMovie() {
        Movie m = target
                .path("{movie")
                .resolveTemplate("movie", bean.getMovieId())
                .request()
                .get(Movie.class);
        return m;
    }
}
