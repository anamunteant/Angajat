package md.tekwill.lectia3;

public class Operations {
    static void printAritmeticOperations(int a, int b) {
        System.out.println("Adunarea: " + (a + b));
        System.out.println("Scaderea: " + (a - b));
        System.out.println("Inmultirea: " + (a * b));
        System.out.println("Impartirea: " + (a / b));
        System.out.println("Restul impartirii: " + (a % b));
    }

    ;

    static void printLogicOperations(boolean a, boolean b) {
        System.out.println("And: " + (a && b));
        System.out.println("Or: " + (a || b));
        System.out.println("Negation: " + !(a && b));
    }

    ;

    static void printRelationarOperations(int a, int b) {
        System.out.println("Egalitate: " + (a == b));
        System.out.println("Diferenta: " + (a != b));
    }

    ;

    static void printUseForAndWhile(int limita) {
        int index = 12;

        while(index <= limita){
            System.out.print(index+ " ");
            index++;
        }
        System.out.println("Valoarea lui index la finalul executiei while este: " + index);

        for(int i = 3; i <= limita; i++){
            System.out.println(i + " ");
        }
        System.out.println("Ciclul for s-a executat. ");
    }

    ;
}
