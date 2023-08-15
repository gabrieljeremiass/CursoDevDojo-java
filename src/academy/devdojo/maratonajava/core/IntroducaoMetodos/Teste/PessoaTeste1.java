package academy.devdojo.maratonajava.core.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste1 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Gabriel");
        pessoa.setIdade(18);
        pessoa.imprime();

        System.out.println(pessoa.getIdade());
    }
}
