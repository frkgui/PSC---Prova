import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-/- GravityCalculator -/-");

        System.out.print("\nDigite o número de pessoas: ");
        int totalUsers = input.nextInt();

//      Declarando gravidade de cada planeta;
        double gravityEarth = 9.8;
        double gravityMars = 3.8;
        double gravityVenus = 8.8;
        double gravityMercury = 3.0;

//      Instanciando os pesos das pessoas;
        double[] weightOnEarth = new double[totalUsers];

//      Pegando peso de cada pessoa
        for(int aux = 0; aux < totalUsers; aux++){
            System.out.print("Digite o peso da pessoa [" + (aux+1) + "]: ");
            weightOnEarth[aux] = input.nextDouble();
        }

        System.out.println("""
                \nLista das Gravidades:
                (1) - Terra
                (2) - Marte
                (3) - Venus
                (4) - Mercurio
                """);

        System.out.print("Digite o número do planeta: ");
        int selectedPlanet = input.nextInt();

//      Selecionando gravidade
        double planetGravity = 0;
        switch (selectedPlanet){
            case 1: planetGravity = gravityEarth; break;
            case 2: planetGravity = gravityMars; break;
            case 3: planetGravity = gravityVenus; break;
            case 4: planetGravity = gravityMercury; break;
            default:
                System.out.println("Número invalido!");
                System.exit(0);
        }

//      Percorrendo e calculando peso dos usuarios
        for(int aux=0; aux<totalUsers; aux++){
            double weighOnPlanet = (weightOnEarth[aux]*10)/planetGravity;
            System.out.println("Pessoa [" + (aux+1) + "]: " + weighOnPlanet);
        }

        input.close();
    }

}
