import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        
            System.out.println("--------------------------------------");
            System.out.println("Bem-vindo à nossa BesteiraFood!");
            System.out.println("--------------------------------------");

            System.out.print("Para começar, qual é o seu nome? "); 
            String nome = sc.nextLine();
        do {  
            System.out.println("----------------------------------------------------------------");
            System.out.println("Olá " + nome + ", escolha a comida desejada do nosso cardápio: ");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Pastel");
            System.out.println("Coxinha");
            System.out.println("Enroladinho");
            System.out.println("--------------------------------------");

            String escolha = sc.nextLine();
            System.out.println("--------------------------------------");

            switch (escolha) {
                case "Pastel":
                    System.out.println("Você escolheu Pastel!!"); 
                    break;
                case "Coxinha":
                    System.out.println("Você escolheu Coxinha!!"); 
                    break;
                case "Enroladinho":
                    System.out.println("Você escolheu Enroladinho!!"); 
                    break;   
                default:
                    System.out.println("Opção inválida! Digite novamente a comida referente ao seu pedido!");
                    break;
            }

            System.out.println("--------------------------------------");

            System.out.print("De 1 a 5, qual é sua nota ao nosso atendimento? ");
            int nota = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println("------------------------------------------");
            
            if (nota >= 3) {
                System.out.println("Que bom que gostou do nosso atendimento!!");
            } else {
                System.out.println("Obrigado por seu feedback, prometemos melhorar!!");
            }
           
            System.out.println("------------------------------------------");
            
            System.out.print("Deseja fazer outro pedido? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Pedido finalizado com sucesso. Boa refeição!");
    
    }
}

