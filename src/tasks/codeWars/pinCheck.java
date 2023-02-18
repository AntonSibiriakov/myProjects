package tasks.codeWars;

import static java.lang.Character.isDigit;

public class pinCheck {

    public static boolean validatePin(String pin) {
        //Проверка пин кода на корректность--------------
        //isDigit(сhar) определяет цифра или нет
        //str.charAt(0) символ по индексу 0

        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (isDigit(pin.charAt(i)) == false) {
                    return false;
                }
            }
        }


        return true;
    }




}


