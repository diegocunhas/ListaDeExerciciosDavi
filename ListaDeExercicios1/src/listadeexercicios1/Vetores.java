/* Crie um programa que contenha 2 vetores de 5 posições cada. Preencha-os com valores recebidos do
usuário. Em seguida, declare um novo vetor, com 10 posições, e preencha-o com os valores dos 2 vetores
anteriores, intercalando os valores destes no vetor de 10 posições. Por fim, apresente os valores do vetor
de 10 posições.
Por exemplo:
vetor1[] = {1,2,3,4,5}, vetor2[] = {10,11,12,13,14}, vetorFinal[] = {1, 10, 2, 11, 3, 12, 4, 13, 5, 14}
 */
package listadeexercicios1;

/**
 *
 * @author Diego da Cunha Silva         - Ra 1290481923021
 * @author Maria Luixa da Silva Augusto - Ra 1290482013029
 */
import java.util.Scanner;

public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int vetorFinal[] = new int[10];
        int countVetor1 = 0;
        int countVetor2 = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("*Preencha os valores do vetor1*");
        for(int i=0;i<5;i++){
            System.out.println("Digite um valor para vetor1["+i+"]:");
            vetor1[i] = leitor.nextInt();
        }
        
        System.out.println("*Preencha os valores do vetor2*");
        for(int i=0;i<5;i++){
            System.out.println("Digite um valor para vetor2["+i+"]:");
            vetor2[i] = leitor.nextInt();
        }
        
        for(int i=0;i<vetorFinal.length;i++){
            if(i%2==0){
                vetorFinal[i] = vetor1[countVetor1];
                countVetor1++;
            }
            else{
                vetorFinal[i] = vetor2[countVetor2];
                countVetor2++;
            }
        }
        for(int i=0;i<vetorFinal.length;i++){
            System.out.println("vetorFinal["+i+"] = "+vetorFinal[i]);
        }
    }
    
}
