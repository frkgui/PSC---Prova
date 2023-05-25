import java.util.Scanner;

public class Array {

    private final Integer[][] array;
    public Array(int arraySize){
        this.array = new Integer[arraySize][arraySize];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-/- Matriz Quadrada -/-");

//      Coletando tamanho desejado para a matriz
        System.out.print("\nDigite o tamanho da matriz: ");
        int arraySize = input.nextInt();

//      Criando matriz e chamando função que lê os numeros digitados e guarda na variável
        Array array1 = new Array(arraySize);
        array1.readNumbers();

//      Coletando a quantidade de primos na diagonal secundária
        int quantityPrimeNumbers2ndDiagonal = array1.getQuantityPrimeNumbers2ndDiagonal();

        System.out.println("Quantidade de números primos: " + quantityPrimeNumbers2ndDiagonal);
    }

//    Pega a quantidade de numeros primos percorrendo a matriz inteira
    private int getQuantityPrimeNumbers2ndDiagonal() {

        int quantityPrimeNumbers2nd = 0;
        for (int line = 0, col = this.array.length - 1; line < this.array.length; line++, col--){
            int number = this.array[line][col];
            if(this.isPrime(number)){
                quantityPrimeNumbers2nd += 1;
            }
        }
        return quantityPrimeNumbers2nd;
    }

//    Verifica se o número é primo
    private boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for(int divisor = 2;divisor < number; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }

//    Entrada dos números da matriz
    public void readNumbers(){
        System.out.println("\nLeitura Matriz: ");
        Scanner read = new Scanner(System.in);

        for (int line = 0; line < this.array.length; line++) {
            for (int col = 0; col < this.array.length; col++) {
                System.out.printf("Matriz [%d][%d]: ", line, col);
                this.array[line][col] = read.nextInt();
            }
        }
        read.close();
    }
}
