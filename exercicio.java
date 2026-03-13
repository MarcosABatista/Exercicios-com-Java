package exercicios;

public class exercicio {
    public static void main(String[] args){
        double[] array = {5, 6, -8, 5, 1, -56, 58, -69 , 10};
        double soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
            System.out.println(array[i]);
        }

        System.out.println("A soma dos numeros é: " + soma);
    }
    
}
