/*
Utilizando-se das facilidades da recursividade, elabore um programa que grave, num arquivo chamado
“Fibo.txt”, a "Sequência de Fibonacci" até o termo “n”, a ser informado pelo usuário. Exemplo: se o
usuário informar o número 6 (que corresponderá ao 6º termo), seu programa calculará (e gravará no
arquivo) a sequência de Fibonacci até o número 8, já que a sequência é:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55,..., n. (repare que o número 8 é o 6º termo).
 */
package listadeexercicios3;

/**
 *
 * @author Diego da Cunha Silva
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int termo;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual termo da sequencia você deseja? ");
        termo = leitor.nextInt();
        
        try{
        FileWriter docTxt = new FileWriter("Fibonacci.txt");
        for(int i =1;i<=termo;i++){
            //aparentemente o comando \n para pular linha é reconhecido por 
            //sistemas linux mas não por sistemas windows/mac, \r\n garante
            // que se irá pular a linha em sistemas windows
            docTxt.write("| Termo nº "+i+" = "+Fibonacci(i)+" |\r\n");            
            //System.out.println("Termo nº "+i+" = "+Fibonacci(i));
        }
        docTxt.close();
        System.out.println("Deu tudo certo. o Arquivo Fibonacci.txt foi criado com sucesso.");
        } catch (IOException e){
            System.out.println("Deu pau na bagaça.");
            e.printStackTrace();
        }
    }
    
    public static int Fibonacci(int termo){
        if(termo==1){
            return 1;
        }
        if(termo ==2)
            return 1;
        else{ 
            return Fibonacci(termo-1)+Fibonacci(termo-2);
        }
    }
    
}
