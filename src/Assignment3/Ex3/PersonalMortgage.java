package Assignment3.Ex3;

public class PersonalMortgage extends Mortgage{

    public PersonalMortgage(int mortgageNumber, String name, int amount, double rate, int term) {
        super(mortgageNumber, name, amount, rate, term);
        setRate(0.02);
    }
}
