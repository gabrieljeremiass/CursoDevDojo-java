package academy.devdojo.maratonajava.core.Construtores.teste;

import academy.devdojo.maratonajava.core.Construtores.dominio.Anime;

public class AnimeTeste1 {
    public static void main(String[] args) {

        Anime anime = new Anime("Gabriel", "TV", 18, "Livro");
        anime.imprime();
    }
}
