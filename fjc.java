// Fast Java Calculator by Iago Dórea (Southern Claim)
// Fast Java Calculator por Iago Dórea (Southern Claim)
import java.util.Scanner;  // Importando o scanner | importing the scanner

public class fjc {
    public static void main(String[] args) {
        int result = 0;         // Declarando a int do resultado | Declaring the result's int
        String ver = "v0.1";        // Versão do programa (opcional) | Program version (optional)
        int numOne;     // Criando a int do primeiro numero | Creating the first number's int!
        int numTwo;     // Criando a int do segundo numero | Creating the second number's int!
        String numOneString;     // Criando a String do primeiro numero | Creating the first number's string!
        String numTwoString;     // Criando a String do segundo numero | Creating the second number's string!
        String operator;        // Criando a String do operador | Creating the operator's string
        Scanner gets = new Scanner(System.in);      // Criando o objeto do scanner | Creating the scanner's object
        System.out.println("Fast Java Calculator " + ver);      // Mostrando o nome do programa e a versão | Showing the program name and the version
        System.out.println("Number:");      // Numero 1 | Number one
        numOneString = gets.nextLine();     // Escutando o que o usuario vai digitar na proxima linha | Listening to user's input next line
        numOne = Integer.parseInt(numOneString);        // Convertendo uma String para uma Int | Converting a String to a Int
        System.out.println("Number");      // Numero 2 | Number two
        numTwoString = gets.nextLine();    // Escutando o que o usuario vai digitar na proxima linha | Listening to user's input next line
        numTwo = Integer.parseInt(numTwoString);        // Convertendo uma String para uma Int | Converting a String to a Int
        System.out.println("Operator (+, -, *, /):");      // Operador | Operator
        operator = gets.nextLine();      // Escutando o que o usuario vai digitar na proxima linha | Listening to user's input next line
        if (operator.equals("+")) {     // Se a String operator for igual a "+" | If the String called operator is equal to "+"
            result = numOne + numTwo;   // Resultado vai ser igual a Numero 1 + Numero 2 | Result will be equal to Number 1 + Number 2
        }
        if (operator.equals("-")) {     // Se a String operator for igual a "-" | If the String called operator is equal to "-"
            result = numOne - numTwo;  // Resultado vai ser igual a Numero 1 - Numero 2 | Result will be equal to Number 1 - Number 2
        }
        if (operator.equals("*")) {     // Se a String operator for igual a "*" | If the String called operator is equal to "*"
            result = numOne * numTwo;  // Resultado vai ser igual a Numero 1 * Numero 2 | Result will be equal to Number 1 * Number 2
        }
        if (operator.equals("/")) {     // Se a String operator for igual a "/" | If the String called operator is equal to "/"
            result = numOne / numTwo;  // Resultado vai ser igual a Numero 1 / Numero 2 | Result will be equal to Number 1 / Number 2
        }
        System.out.println(result);     // Mostra o resultado da conta | Show the result
        gets.close();   // Desativa o scanner | Power off the scanner
    }
}