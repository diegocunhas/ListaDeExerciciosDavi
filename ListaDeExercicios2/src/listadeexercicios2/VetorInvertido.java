/*
 Elabore um programa que receba 10 valores do usuário e armazene-os em um vetor; após, percorra o
vetor (a partir do índice 0) e exiba todos os valores na tela. Em seguida, utilizando o mesmo vetor e, no
máximo, 3 variáveis, inverta a posição desses valores no vetor. Ao final, partindo novamente do índice 0,
percorra o vetor e apresente os valores armazenados (que deverão estar invertidos).
Por exemplo:
valores iniciais do vetor[] = {2, 3, 9, 10, 8, 5}
valores invertidos do vetor[] = {5, 8, 10, 9, 3, 2}
 */
package listadeexercicios2;

/**
 *
 * @author Diego da Cunha Silva         - Ra 1290481923021
 * @author Maria Luixa da Silva Augusto - Ra 1290482013029
 */
import java.util.Scanner;
public class VetorInvertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = new int[10];
        int aux;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("***Invertendo Vetores****");
        for(int i =0;i<vetor.length;i++){
            System.out.println("Entre com um valor para o vetor["+i+"] = "+vetor[i]);
            vetor[i] = leitor.nextInt();
        }        
        
        for(int i =0;i<vetor.length;i++){
            System.out.println("vetor["+i+"] = "+vetor[i]);
        }
        
        for(int i =0;i<vetor.length/2;i++){
            aux = vetor[i];
            vetor[i] = vetor[vetor.length-1-i];
            vetor[vetor.length-1-i] = aux;
        }
        
        System.out.println("***Trocando as posições fica assim:***");
        
        for(int i =0;i<vetor.length;i++){
            System.out.println("vetor["+i+"] = "+vetor[i]);
        }
    }
    
}
