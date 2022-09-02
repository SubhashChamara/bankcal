public class Main {
    public static void main(String[] args) {

        InterestCalc interestcalc = new InterestCalc();

        Banks boc = new BOC();
        interestcalc.interests(boc);

        Banks sampath = new Sampath();
        interestcalc.interests(sampath);

        Banks com = new Com ();
        interestcalc.interests(com);

        Banks peoples = new Peoples ();
        interestcalc.interests(peoples);

        Banks hsbc = new HSBC ();
        interestcalc.interests(hsbc);


    }
}