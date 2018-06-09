import java.util.Scanner;

public class Card {

    Ranks ranks;
    Suits suit;


    Scanner scanner = new Scanner(System.in);



    public void display(){

        System.out.println("Enter ranks lowercase ");
        String variable = scanner.nextLine();
        System.out.println("Enter suit lowercase ");
        String variable2 = scanner.nextLine();
        if (variable.equals("king")&&variable2.equals("clubs")){
            System.out.println(Ranks.KING + "-" + Suits.CLUBS);
        }
        if (variable.equals("king")&&variable2.equals("diamonds")){
            System.out.println(Ranks.KING + "-" + Suits.DIAMONDS);
        }
        if (variable.equals("king")&&variable2.equals("heartd")){
            System.out.println(Ranks.KING + "-" + Suits.HEARTS);
        }
        if (variable.equals("king")&&variable2.equals("spades")){
            System.out.println(Ranks.KING + "-" + Suits.SPADES);
        }


        if (variable.equals("ace")&&variable2.equals("clubs")){
            System.out.println(Ranks.ACE + "-" + Suits.CLUBS);
        }
        if (variable.equals("ace")&&variable2.equals("diamonds")){
            System.out.println(Ranks.ACE + "-" + Suits.DIAMONDS);
        }
        if (variable.equals("ace")&&variable2.equals("heartd")){
            System.out.println(Ranks.ACE + "-" + Suits.HEARTS);
        }
        if (variable.equals("ace")&&variable2.equals("spades")){
            System.out.println(Ranks.ACE + "-" + Suits.SPADES);
        }

        if (variable.equals("queen")&&variable2.equals("clubs")){
            System.out.println(Ranks.QUEEN + "-" + Suits.CLUBS);
        }
        if (variable.equals("king")&&variable2.equals("diamonds")){
            System.out.println(Ranks.QUEEN + "-" + Suits.DIAMONDS);
        }
        if (variable.equals("king")&&variable2.equals("heartd")){
            System.out.println(Ranks.QUEEN + "-" + Suits.HEARTS);
        }
        if (variable.equals("king")&&variable2.equals("spades")){
            System.out.println(Ranks.QUEEN + "-" + Suits.SPADES);
        }

        if (variable.equals("jack")&&variable2.equals("clubs")){
            System.out.println(Ranks.JACK + "-" + Suits.CLUBS);
        }
        if (variable.equals("jack")&&variable2.equals("diamonds")){
            System.out.println(Ranks.JACK + "-" + Suits.DIAMONDS);
        }
        if (variable.equals("jack")&&variable2.equals("heartd")){
            System.out.println(Ranks.JACK + "-" + Suits.HEARTS);
        }
        if (variable.equals("jack")&&variable2.equals("spades")){
            System.out.println(Ranks.JACK + "-" + Suits.SPADES);
        }


    }

}
