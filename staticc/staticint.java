package opps.staticc;

//this is a demo to show intailsationof static varvale
public class staticint {
    static int a=4;
    static int b;
    //we only run once when first object creted onlyy when class is loaded
    static{ //we gwwt execute onece when class was loaded at first
        System.out.println("i am static");
        b=a*5;
    }
    public static void main(String[] args) {
        staticint obj = new staticint();
//        System.out.println(staticint.a+""+staticint.b);
        staticint obje = new staticint(); //when we creted another obj static{
//    } not again caleed beacuse static called only one time
//        System.out.println();
    }
}
