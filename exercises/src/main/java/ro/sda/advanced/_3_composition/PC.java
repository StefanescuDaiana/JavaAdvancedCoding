package ro.sda.advanced._3_composition;
 /*
         * Create a class PC which will have a case of type Case, a monitor of type Monitor and a motherboard of type Motherboard
        *
        *  The class should have:
        *  - a constructor
        *  - a method powerUp() - which will call the method for powering up from the Case class
 *  - a method drawLogo() - which will call the method drawPixel from Monitor class
 */
public class PC {
    private Monitor monitor;
    private Case theCase;

     public PC(Monitor monitor, Case theCase) {
         this.monitor = monitor;
         this.theCase = theCase;
     }

     public void powerUp(){
         theCase.pressPowerButton();
         this.drawLogo();
     }

     public  void drawLogo(){
         monitor.drawPixelAt(1200, 500, "red");
     }
 }
