package academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio;

import academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio.Estudante;

public class ImpressoraJava {

    public void imprime(Estudante estudante){
        System.out.println("-------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
