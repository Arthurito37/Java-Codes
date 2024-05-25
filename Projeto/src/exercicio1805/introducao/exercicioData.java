package introducao;
import java.util.Scanner;
import java.util.Locale;


public class exercicioData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana de hoje:");
        System.out.println("1 - DOMINGO");
        System.out.println("2 - SEGUNDA");
        System.out.println("3 - TERÇA");
        System.out.println("4 - QUARTA");
        System.out.println("5 - QUINTA");
        System.out.println("6 - SEXTA");
        System.out.println("7 - SÁBADO");

        try {
            int diaSemana = Integer.parseInt(diaSemana);
            switch (diaSemana) {
                case 1:
                    String diaSemanaString = "Domingo";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("Aproveite bem a folga aproveite.");
                    break;
                case 2:
                    diaSemanaString = "Segunda - feira";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("#SEGUNDOU.");
                    break;
                case 3:
                    diaSemanaString = "Terça - feira";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("#TERÇOU.");
                    break;
                case 4:
                    diaSemanaString = "Quarta - feira";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("#QUARTOU BORA DE FEIJOADA?");
                    break;
                case 5:
                    diaSemanaString = "Quinta - feira";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("QUINTOU BORA DE #TBT");
                    break;
                case 6:
                    diaSemanaString = "Sexta - feira";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("#SEXTOU ABASTECE O CARRO, CHAMA AS PROSTITUTAS E PEGA AS ARMAS DE FOGO");
                    break;
                case 7:
                    diaSemanaString = "Sábado";
                    System.out.println("Hoje é " + diaSemanaString + ", boa semana!");
                    System.out.println("LEVANTAR CEDO NO SÁBADO É A DIFERENÇA DOS HOMENS PARA OS FILHINHOS DE PAPAI MACONHEIROS, BOM DIA.");
                    break;

                default:
            }
        }
         catch (NumberFormatException e) {
            if (diaSemana.contains("Domingo")){
                resultado = "1"
            }
         }


        sc.close();


    }
}
