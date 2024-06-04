import java.util.Scanner;



class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

}

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numUm = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numDois = scanner.nextInt();

        try { 
            contar(numUm, numDois);
            
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
 
    static void contar(int numUm, int numDois) throws ParametrosInvalidosException {
        if (numUm > numDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
            


        for(int x = numUm; x <= numDois; x++){
            System.out.println("Imprimindo o número: " + x);
        }
    }
}