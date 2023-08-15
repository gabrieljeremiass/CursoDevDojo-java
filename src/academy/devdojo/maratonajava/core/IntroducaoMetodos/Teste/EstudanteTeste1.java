package academy.devdojo.maratonajava.core.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio.Estudante;

public class EstudanteTeste1 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Júlia";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
