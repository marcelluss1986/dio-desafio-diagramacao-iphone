package devices.aux;

import devices.navegadores.NavegadorInternet;
import devices.playersMusica.ReprodutorMusical;
import devices.telefones.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {


    @Override
    public void navegarInternet() {
        System.out.println("Navegando via Iphone");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Playing music by iphone");
    }

    @Override
    public void telefonar() {
        System.out.println("making calls by iphone");
    }
}
