import model.ImprovedSimCard;
import model.SimpleSimCard;

public class Main {
    public static void main(String[] args) {
        SimpleSimCard simpleSimCard1 = new SimpleSimCard("1111111111111111111111","1111");
        SimpleSimCard simpleSimCard2 = new SimpleSimCard("2222222222222222","1111");
        SimpleSimCard improvedSimCard = new ImprovedSimCard("123123123123123123","1111","88888888");
//        System.out.println(simpleSimCard1);
//        System.out.println(simpleSimCard2);
//        System.out.println(improvedSimCard);
//
//        System.out.println("---------------------------------------------------");
//
//        simpleSimCard1.enterSim("0000");
//        simpleSimCard1.enterSim("2222");
//        simpleSimCard1.enterSim("2222");
//        simpleSimCard1.enterSim("1111");
//
//        simpleSimCard2.enterSim("1111");
//
//        System.out.println(simpleSimCard1);
//        System.out.println(simpleSimCard2);
//
//        System.out.println("---------------------------------------------------");

        improvedSimCard.enterSim("2222");
        improvedSimCard.enterSim("2222");
        improvedSimCard.enterSim("2222");
        improvedSimCard.enterSim("2222");

        System.out.println(improvedSimCard);

        improvedSimCard.enterSim("88888888");

        System.out.println(improvedSimCard);

        improvedSimCard.enterSim("1111");

    }
}