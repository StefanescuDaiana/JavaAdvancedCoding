package ro.sda.advanced._3_composition;

//composition nu este o propr. OOP
//Prop.OOP: inheritance, polymorphism, abstraction, encapsulation

import java.util.ArrayList;

/**
 * java doc
 * <p>
 * The following exercise is for understanding composition, we will create a few classes which represents different
 * components of a PC.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Case case1 = new Case("220B", "HP", "230", new Dimensions(10, 20, 30));

        Monitor monitor1 = new Monitor("27 INCH", "ASUS", "27", new Resolution(20, 30));
        PC pc1 = new PC(monitor1, case1);

        pc1.powerUp();

        case1.setManufacturer("gigabyte");
        case1.setModel("nush d-astea");



//        PC pc2 = new PC(
//                new Monitor("3X4", "ACER", "32", new Resolution(10, 20)),
//                new Case("Model", "manufacturer", "230", new Dimensions(30, 40, 50))
//        );
//
//        pc2.powerUp();


    }
}
