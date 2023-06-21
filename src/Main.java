public class Main {
    public static void main(String[] args) {

        int ticket = 13_676; //Стоимость авиабилета
        int accrual = 20; //Начисление одной мили

        int miles = ticket / accrual;

        System.out.println("Количество начисленных миль: " + miles);
    }
}