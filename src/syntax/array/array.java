package syntax.array;

public class array {//Массив
    public static void main(String[] args) {
        int[] monDay = new int[12];
        //Тип даннах, указание на массив, название, =,
        //new Указание на создание ячейки памяти, тип данных, кол-во в массиве(Неизменяемое)
        monDay[0] = 31;
        monDay[1] = 28;
        monDay[2] = 31;
        monDay[3] = 30;
        monDay[4] = 31;
        monDay[5] = 30;
        monDay[6] = 31;
        monDay[7] = 30;
        monDay[8] = 31;
        monDay[9] = 30;
        monDay[10] = 31;
        monDay[11] = 30;

        System.out.println(monDay[5]);

        int[] monDay0 = {1, 2, 5, 7, 4};
        //Тип данных[], название, = {перечисление, данных, в, массиве]
        System.out.println(monDay0[2]);

        monDay0 = new int[]{1, 6, 8}; //изменение объема данных и содержани\ в массиве

        System.out.println(monDay0[2]);
    }}
