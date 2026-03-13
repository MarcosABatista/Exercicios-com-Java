package variaveis;

public class varitipos {
    public static void main(String[] args){
        // variaveis
        String nome = "Marcos";
        int idade = 15;
        double altura = 1.80;
        double peso = 60.5;
        boolean ativo;

        // laço de repetição FOR
        for(int i = 1; i < 18; i ++){
            System.out.println(i);
        }
        double imc = peso/(altura*2);
        System.out.println("seu imc é: "+ imc);
        
        // laço de repetição WHILE 

        while (imc < 22) {
            System.out.println("imc: "+ imc + ", " + nome + " você está desnutrido");
            peso ++;
            imc = peso/(altura*2);
        }

        // Condicional IF ELSE

        if(imc < 18.5){
            System.out.println(nome + " você está desnutrido");
        }else if(imc > 24.5){
            System.out.println(nome + " Você está com sobrepeso!");
        }else{
            System.out.println(nome + " Seu peso está normal!");
        }
        System.out.println("Idade: "+ idade);
        System.out.println("Peso: "+ peso);
        System.out.println("Altura: "+ altura);

        if(idade < 18){
            ativo = false;
            System.out.println("Você não pode se alistar! status de ativo: " + ativo);
        } else if(idade < 65){
            ativo = true;
            System.out.println("Você está alistado! status de ativo: " + ativo);
        }else{
            ativo=false;
            System.out.println("Você já passou da idade! status de ativo: " + ativo);
        }
    }
}
