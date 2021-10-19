public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2_000; //стоимость билета
        int bonus = 20;          //рублей за 1 милю
        //Расчитываем мили
        int milii = ticketPrice / bonus;
        System.out.println(milii);
    }
}
