import java.util.Scanner;


public class Main{
    public static void main(String args[]){

        Scanner ler = new Scanner(System.in);

        //int nasc = ler.nextInt();
        //int ano = 2020;
        //System.out.println("A pessoa nascida em " + nasc + " tem " + (ano-nasc) + " anos.");

        int i = 100;
        boolean primo;
        while(i < 200){
            primo = true;
            for(int j=2;j<i;j++){
                if (i % j == 0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.println(i);
                
                }
            
            i++;
        }
    }

}
