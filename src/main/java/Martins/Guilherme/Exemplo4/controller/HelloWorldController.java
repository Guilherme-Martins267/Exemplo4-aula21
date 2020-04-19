package Martins.Guilherme.Exemplo4.controller;

import Martins.Guilherme.Exemplo4.model.Assassinos;
import Martins.Guilherme.Exemplo4.model.Promissoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Home page";
    }

    @GetMapping("/promissoria")
    public ArrayList<Promissoria> getPromissoria() {

        Promissoria promissoria1 = new Promissoria();
        promissoria1.setPromissoria("15.000.000 on John Wick's head");

        Promissoria promissoria2 = new Promissoria();
        promissoria2.setPromissoria("11.000.000 on Thiago Cury's head");

        Promissoria promissoria3 = new Promissoria();
        promissoria3.setPromissoria("7.000.000 on Catapimba's head");

        ArrayList<Promissoria> promissoria = new ArrayList<>();
        promissoria.add(promissoria1);
        promissoria.add(promissoria2);
        promissoria.add(promissoria3);

        return promissoria;
    }

    @GetMapping("/assassinos")
    public ArrayList<Assassinos> getAssassino() {

        Assassinos assassino1 = new Assassinos();
        assassino1.setNome("John Wick");
        assassino1.setIdade(39);
        assassino1.setHabilidade(93.5);

        Assassinos assassino2 = new Assassinos();
        assassino2.setNome("Laurence Fishburn/Morpheu");
        assassino2.setIdade(39);
        assassino2.setHabilidade(83.5);

        Assassinos assassino3 = new Assassinos();
        assassino3.setNome("Thomas Anderson");
        assassino3.setIdade(35);
        assassino3.setHabilidade(99.5);

        ArrayList<Assassinos> assassino = new ArrayList<>();
        assassino.add(assassino1);
        assassino.add(assassino2);
        assassino.add(assassino3);

        return assassino;
    }
}
