import java.math.BigDecimal;

public class BigDecInt {

    public static void main(String[] args) {

// TODO Auto-generated method stub

        BigDecimal Wisconsin_pop = new BigDecimal("5726398");
        BigDecimal California_pop = new BigDecimal("38041430");
        BigDecimal Texas_pop = new BigDecimal("26059203");
        BigDecimal cost_per_copies = new BigDecimal("3.23");
        BigDecimal how_many_latters = Wisconsin_pop.multiply(California_pop);
        BigDecimal number_of_copies = how_many_latters.multiply(Texas_pop);
        BigDecimal cost = cost_per_copies.multiply(number_of_copies);

        System.out.println("Number of letters: "+how_many_latters);
        System.out.println("Number of copies: "+number_of_copies);
        System.out.println("Cost: $"+cost);

    }

}