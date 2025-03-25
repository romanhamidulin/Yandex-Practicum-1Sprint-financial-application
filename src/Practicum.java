import java.util.Scanner;

class Practicum {
    public static void main(String[] args) {
        double rateUSD = 94.8;
        double rateEUR = 103.8;
        double rateCNY = 13.1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble(); // считали число типа double

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt(); // считали число типа int

        System.out.println("Введите команду. Доступные команды: convert и advice.");
        String command = scanner.next(); // // вместо многоточия используйте нужный метод класса Scanner

        if (command.equals("convert")) { // сравните переменную command с командой для конвертации
            System.out.println("В какую валюту хотите конвертировать рубли? Доступные варианты: USD, EUR, CNY.");
            String currency = scanner.next(); // считайте это значение с помощью scanner

            if (currency.equals("USD")) { // определите, какой был введён код валюты 
                // выведите результат конвертации
                System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary/rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary/rateEUR);
            } else if (currency.equals("CNY")) {
                System.out.println("Ваши сбережения в юанях: " + moneyBeforeSalary/rateCNY);
            }
            else {
                System.out.println("Введена неизвестная валюта");
            }
            // не забудьте обработать случай, когда введён некорректный код валюты

        } else if (command.equals("advice")) { // сравните переменную command с командой для советника
            if (moneyBeforeSalary < 3000) {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            } else if (moneyBeforeSalary < 10000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Можно заказать пиццу!");
                } else {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                }
            } else if (moneyBeforeSalary < 30000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
                } else {
                    System.out.println("Можно заказать пиццу!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("Отлично! Можно сходить в ресторан.");
                } else {
                    System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
                }
            }
        }
        else {
            System.out.println("Такой команды нет");
        }
        // не забудьте обработать случай, когда нужной команды нет
    }
}