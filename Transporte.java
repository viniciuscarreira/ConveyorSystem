import java.util.ArrayList;
import java.util.Scanner;

public class Transporte {
    
    public static void main(String[] args) {
        
        // Definição das variáveis
        ArrayList<Double> pesos = new ArrayList<Double>();
        int numItens;
        double pesoTotal = 0.0;
        
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
                
                // CIDADE DE ORIGEM
                System.out.print("Digite a cidade de origem: ");
                String cidadeOrigem = sc.nextLine();
                
                // CIDADE DE DESTINO
                System.out.print("Digite a cidade de destino: ");
                String cidadeDestino = sc.nextLine();
                
                // DISTANCIA ENTRE AS CIDADES
                System.out.print("Digite a distância entre " + cidadeOrigem + " e " + cidadeDestino + ": ");
                float distanciaTotal = sc.nextFloat();

        // Itens tranportados
        System.out.print("Digite o número de itens a serem transportados: ");
        numItens = sc.nextInt();
        
        // Peso de cada item
        for (int i = 1; i <= numItens; i++) {
            System.out.print("Digite o peso do item " + i + " em kg: ");
            float peso = sc.nextFloat();
            pesos.add((double) peso);
            pesoTotal += peso;
        }
                
        // Identificação do modelo de caminhão mais adequado        
        float custoPorKmPequeno = 4.87f;
        float custoPorKmMedio = 11.92f;
        float custoPorKmGrande = 27.44f;
        
        float custoTotalF;
        
        if (pesoTotal <= 500) {
            custoTotalF = distanciaTotal * custoPorKmPequeno;
            System.out.println("\n----------------------------\n" );
            System.out.println("\nSerá necessário utilizar um caminhão de porte PEQUENO \n" );
        } else if (pesoTotal <= 1500) {
            custoTotalF = distanciaTotal * custoPorKmMedio;
            System.out.println("Será necessário utilizar um caminhão de porte MÉDIO \n");
        } else {
            custoTotalF = distanciaTotal * custoPorKmGrande;
            System.out.println("Será necessário utilizar um caminhão de porte GRANDE \n");
        }
        
        // Saída de dados
        System.out.println("A distância total percorrida é: " + distanciaTotal + " km ");
         System.out.println("O custo total do transporte é: R$ " + custoTotalF);
        double valorTotalF = custoTotalF * pesoTotal;
        System.out.println("O valor total dos itens transportados é: R$ " + valorTotalF);
    }
}
