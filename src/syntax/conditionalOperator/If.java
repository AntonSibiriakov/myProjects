package syntax.conditionalOperator;

public class If {

    public static void main(String[] args) {
        /* условный оператор
        if () {
         }
        else if () { дополнительные условия в неогр кол-ве
         }
        else {} выполняется при невыполнении if */

        /*
        < меньше
        <= меньше или равно
        == равно
        >= больше или равно
        > больше
        != не равно
        && и
        || или
        */

        int num = 9;
        int num1 = 8;
        if (num < num1) {
            System.out.println("Меньше");
        } else if (num == num1) {
            System.out.println("Равно");
        } else {
            System.out.println("Больше");
        }
    }
}