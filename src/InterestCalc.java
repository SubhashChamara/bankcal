public class InterestCalc {

    public double interests(Banks bank) {



        if( bank instanceof HSBC){
            System.out.println(1000*13/100);
        }
        else if (bank instanceof Peoples) {
            System.out.println(1000*15/100);
        }
        else if (bank instanceof BOC) {
            System.out.println(1000 * 11 / 100 );
        }
        else {
            System.out.println(1000*12/100);
        }

        return bank.interest();
    }
}
