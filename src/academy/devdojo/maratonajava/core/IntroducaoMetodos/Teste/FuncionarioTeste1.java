package academy.devdojo.maratonajava.core.IntroducaoMetodos.Teste;

import academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio.Funcionario;

public class FuncionarioTeste1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Gabriel");
        funcionario.setIdade(18);
        funcionario.setSalario(new int[] {4000, 5000, 1000});


        funcionario.imprime();
        funcionario.mediaSalario();
    }
}
