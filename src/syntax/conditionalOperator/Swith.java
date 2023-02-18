package syntax.conditionalOperator;

public class Swith {
    public static void main(String[] args){

        //оператор switch рекомендуется применять при нескольких проверках
        //char, byte, short, int, enum(v.6 java), string(v.7 java)
        int x = 3;
        //если (x)
        switch (x) {
            //действительно 1: то
            case 1:
                System.out.println("зеленый");
                break;//останавливает исполнение кода
            case 2:
                System.out.println("желтый");
                break;
            case 3:
                System.out.println("красный");
                break;
            //в ином случае
            default:
                System.out.println("error");
                break;
        }
    }
}