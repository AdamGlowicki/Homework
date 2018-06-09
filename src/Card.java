import java.util.Scanner;

public class Card {

    private Ranks ace = Ranks.ACE;
    private Ranks king = Ranks.KING;
    private Ranks queen = Ranks.QUEEN;
    private Ranks jack = Ranks.JACK;

    private Suits clubs = Suits.CLUBS;
    private Suits diamonds = Suits.DIAMONDS;
    private Suits herats = Suits.HEARTS;
    private Suits spades = Suits.SPADES;


    Scanner scanner = new Scanner(System.in);



    public void display(){

        System.out.println("Enter ranks lowercase ");
        String variable = scanner.nextLine();
        System.out.println("Enter suit lowercase ");
        String variable2 = scanner.nextLine();
        if (variable.equals("king")&&variable2.equals("clubs")){
            System.out.println(king + "-" + clubs);
        }
        if (variable.equals("king")&&variable2.equals("diamonds")){
            System.out.println(king + "-" + diamonds);
        }
        if (variable.equals("king")&&variable2.equals("heartd")){
            System.out.println(king + "-" + herats);
        }
        if (variable.equals("king")&&variable2.equals("spades")){
            System.out.println(king + "-" + spades);
        }


        if (variable.equals("ace")&&variable2.equals("clubs")){
            System.out.println(ace + "-" + clubs);
        }
        if (variable.equals("ace")&&variable2.equals("diamonds")){
            System.out.println(ace + "-" + diamonds);
        }
        if (variable.equals("ace")&&variable2.equals("heartd")){
            System.out.println(ace + "-" + herats);
        }
        if (variable.equals("ace")&&variable2.equals("spades")){
            System.out.println(ace + "-" + spades);
        }

        if (variable.equals("queen")&&variable2.equals("clubs")){
            System.out.println(queen + "-" + clubs);
        }
        if (variable.equals("king")&&variable2.equals("diamonds")){
            System.out.println(queen + "-" + diamonds);
        }
        if (variable.equals("king")&&variable2.equals("heartd")){
            System.out.println(queen + "-" + herats);
        }
        if (variable.equals("king")&&variable2.equals("spades")){
            System.out.println(queen + "-" + spades);
        }

        if (variable.equals("jack")&&variable2.equals("clubs")){
            System.out.println(jack + "-" + clubs);
        }
        if (variable.equals("jack")&&variable2.equals("diamonds")){
            System.out.println(jack + "-" + diamonds);
        }
        if (variable.equals("jack")&&variable2.equals("heartd")){
            System.out.println(jack + "-" + herats);
        }
        if (variable.equals("jack")&&variable2.equals("spades")){
            System.out.println(jack + "-" + spades);
        }


    }

}
