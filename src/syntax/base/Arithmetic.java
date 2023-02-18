package syntax.base;

public class Arithmetic {

    public static void main(String[] args) {
        int num = 4;
        int num1 =9;

        int result = num + num1;
        System.out.println("Результат сложения: " + result);
        // при наличии строки + выполняет конкретинацию строк


        int result1 = num1 / num;
        System.out.println("Результат деления: " + result1);
        // целочисленное значение int не предусматривает дробную часть


        int result2 = num1 % num;
        System.out.println("Результат деления по модулю: " + result2);
        // остаток от деления

        result += result1;
        System.out.println("Результат сложения рез и рез1: " + result);
        // сокрощенние варианта result =  result +  result1


        int num2 = num++;// сначала результат, затем +1
        int num3 = ++num1;// сначала +1, затем результат
        // инкремент(+1) и декремент(-1) применяются исключительно к переменным


        System.out.println("num1++: " + num2);
        System.out.println("++num1: " + num3);

    }
}
