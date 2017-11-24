package pl.madison.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.madison.dao.UczenRepository;
import pl.madison.domain.Uczen;

@RestController
public class TestCotroller{
    @Autowired
    private UczenRepository uczendao;

    @RequestMapping(value = "/wyswietl", method = RequestMethod.GET)
    public String wyswietl(){
        String uczen = "";

        for (Uczen uczen1 : uczendao.findAll()) {
            uczen = uczen + uczen1;
        }

        return uczen;

    }

    @RequestMapping(value = "/srednia", method = RequestMethod.GET)
    public String srednia(){
        String wynik = "";
        double suma = 0;
        int licznik = 0;

        for (Uczen uczen : uczendao.findAll()) {
            suma = suma + uczen.getSredniaOcen();
            licznik++;
        }

        double srednia = suma/licznik;

        return wynik + "Srednia ocen klasy4C to: " + srednia;

    }


}
