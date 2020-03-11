import java.util.Scanner;


public class Main{

    public static int ehprimo(int p, int h){
        int aux = 0;

        while (aux < p){

            aux += h;
            if (aux == p){

                return 1;
            }

        }
        return 0;
    }


    public static void main(String args[]){

        Scanner ler = new Scanner(System.in);

        //int nasc = ler.nextInt();
        //int ano = 2020;
        //System.out.println("A pessoa nascida em " + nasc + " tem " + (ano-nasc) + " anos.");

        int i = 1;
        int x = 0;
        boolean primo;
        while(x < 15){
            primo = true;
            for(int j=2;j<i;j++){
                if (ehprimo(i, j) == 1){
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
                x++;
            }
                
                
            i++;
        }
    }

}