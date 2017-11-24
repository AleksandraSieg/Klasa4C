package pl.madison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.madison.dao.UczenRepository;
import pl.madison.domain.Uczen;

@SpringBootApplication
public class Klasa4CAplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Klasa4CAplication.class, args);
    }

    @Autowired
    UczenRepository uczenDao;

    public void run(String... strings) throws Exception {
        Uczen uczen1 = new Uczen();
        uczen1.setImie("Wojciech");
        uczen1.setNazwisko("Jablonski");
        uczen1.setSredniaOcen(4.5);
        uczenDao.save(uczen1);
        Uczen uczen2 = new Uczen();
        uczen2.setImie("Martyna");
        uczen2.setNazwisko("Witkowska");
        uczen2.setSredniaOcen(3.8);
        uczenDao.save(uczen2);
        Uczen uczen3 = new Uczen();
        uczen3.setImie("Miroslawa");
        uczen3.setNazwisko("Piasek");
        uczen3.setSredniaOcen(5.0);
        uczenDao.save(uczen3);
    }
}
