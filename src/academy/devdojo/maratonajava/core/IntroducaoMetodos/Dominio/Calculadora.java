package academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio;

public class Calculadora {

    int [] numeros = {1,2,3,4,5,6};
    public void varArgs(int ... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}

