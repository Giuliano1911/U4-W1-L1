import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int a = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int b = scanner.nextInt();
        System.out.println("Risultato della moltiplicazione: "+multiplication(a,b));

        System.out.println("Inserisci frase");
        String s = scanner.next();
        System.out.println("Inserisci numero");
        int c = scanner.nextInt();
        System.out.println(concat(s,c));

        String[] arr = new String[] {"asd","fgh","jkl","zxc","vbn"};
        System.out.println("Inserisci frase");
        String st = scanner.next();
        for (int i=0;i<6;i++){
        System.out.println(insertArray(arr,st)[i]);
        }

        System.out.println("Inserisci frase 1");
        String s1 = scanner.next();
        System.out.println("Inserisci frase 2");
        String s2 = scanner.next();
        System.out.println("Inserisci frase 3");
        String s3 = scanner.next();
        System.out.println(s1+s2+s3);
        System.out.println(s3+s2+s1);

        System.out.println("Inserisci lato rettangolo");
        int l = scanner.nextInt();
        System.out.println("Inserisci altro lato");
        int h = scanner.nextInt();
        System.out.println("Perimetro: "+ perimeterRectangle(a,b));

        System.out.println("Inserisci numero");
        int d = scanner.nextInt();
        System.out.println(pariDispari(d));
    }

   static int multiplication(int a, int b) {
   return a*b;
    }

    static String concat(String a,int b){
        return a+' '+b;
    }

    static String[] insertArray(String[]array,String s){
        String[] result = new String[6];
        result[0]=array[0];
        result[1]=array[1];
        result[2]=array[2];
        result[3]=s;
        result[4]=array[3];
        result[5]=array[4];
        return result;
    }

    static int perimeterRectangle(int a, int b){
        return (2*a)+(2*b);
    }

    static int pariDispari(int a){
        return a%2;
    }

}