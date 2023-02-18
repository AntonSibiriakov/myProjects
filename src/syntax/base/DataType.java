package syntax.base;

public class DataType {
    public static void main  (String[] args) {
        /* формат: ТипДанных название = значение
        преимущественно int double
        тип данных более низкого значени используется для экономии данных
         */
        byte num = 100; /* 8 бит
        -128 +127
         */
        short num1 = 131; /* 16 бит
        -32128 + 32127
         */
        int num2 = 141; /* ** 32 бита
        -2147483648 +21474836487
         */
        long num3 = 123; /* 64 бита
        -9 223 372 836  854 775 888 +9 223 372 836  854 775 887
         */
        float num4 = 1.1f; /* 32 бита
        6-7 знаков после точки
         */
        double num5 = 1.11; /*  64 бита
        15 знаков после точки
         */
        char sym = '\u2122'; /* 16 бит символы  unicode
        https://unicode-table.com/ru/
         */
        boolean IsTrue = false; /* 1 бит логические тип данных
        true истина
        false лож
         */
        String str = "Hi!"; // строки

    }
}