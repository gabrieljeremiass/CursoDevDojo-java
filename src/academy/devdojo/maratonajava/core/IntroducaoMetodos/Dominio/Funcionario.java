package academy.devdojo.maratonajava.core.IntroducaoMetodos.Dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private int [] salario;
    private int media = 0;
        public void imprime(){
            System.out.println(this.nome);
            System.out.println(this.idade);
            if (salario == null) {
                return;
            }
                for (int im : salario) {
                    System.out.println(im);
                }
            }

            public void mediaSalario(){
            if(salario == null){
                return;
            }
                int media = 0;
                for (int num : salario) {
                    media += num;

                }
                media /= salario.length;
                System.out.println("Média de sálario: ");
                System.out.print(media);



            }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int[] getSalario() {
        return salario;
    }

    public int getMedia() {
        return media;
    }


    }











