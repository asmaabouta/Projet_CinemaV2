package ma.emsi.projet_cinema2;

import ma.emsi.projet_cinema2.services.ICinemaInitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ProjetCinema2Application implements CommandLineRunner {
     @Autowired
    private ICinemaInitServices cinemaInitServices;


    public static void main(String[] args) {
        SpringApplication.run(ProjetCinema2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    cinemaInitServices.initVilles();
    cinemaInitServices.initCinemas();
    cinemaInitServices.initSalles();
    cinemaInitServices.initPlaces();
    cinemaInitServices.initSeances();
    cinemaInitServices.initCategories();
    cinemaInitServices.initfilms();
    cinemaInitServices.initProjections();
    cinemaInitServices.initTickets();




    }
}
















