package ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {

    final static Logger logger=Logger.getLogger(Payment.class);

    public static void pay(Electricity electricity, Water water) {
        logger.info("This is Info - კომუნალური გადახდილია: " + electricity);
        logger.info("This is Info - კომუნალური გადახდილია: " + water);

    }

    public static void main(String[] args) {
        Electricity electricity = new Electricity("5A", 24.5);
        Water water = new Water("5A", 12.25);

        pay(electricity, water);

    }
}
