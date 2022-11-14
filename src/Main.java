import java.util.Random;
import java.util.Scanner;

class Main
{
    public static void main (String[]args)
    {


        Random random = new Random();
        int nr_random=random.nextInt(2);

        String computer="";

        if(nr_random==0){
            computer="piatra";
        }
        if(nr_random==1){
            computer="hartie";
        }
        if(nr_random==2){
            computer="foarfeca";
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Alege foarfeca,hartie,piatra: ");
        String utilizator= scanner.next();
        System.out.println("Calculatorul a ales: "+computer);


        if (computer.equals(utilizator)){
            System.out.println("Egalitate! Hai sa mai jucam!");
        }


        if (computer.equals("piatra")&& utilizator.equals("hartie")){
            System.out.println("Ai castigat , hartia infasoara piatra!");
        }

        if (computer.equals("hartie")&& utilizator.equals("piatra")){
            System.out.println("Ai pierdut , hartia infasoara piatra!");
        }

        if (computer.equals("piatra") && utilizator.equals("foarfeca")){
            System.out.println("Ai pierdut , piatra strica foarfeca!");
        }

        if (computer.equals("foarfeca") && utilizator.equals("piatra")){
            System.out.println("Ai castigat , piatra strica foarfeca!");
        }

        if (computer.equals("foarfeca") && utilizator.equals("hartie")){
            System.out.println("Ai pierdut , foarfeca taie hartia!");
        }

        if (computer.equals("hartie")&& utilizator.equals("foarfeca")){
            System.out.println("Ai castigat , foarfeca taie hartia!");
        }
    }
}
