public class Main {
    public static void main(String[] args) {
//        Задача 1
        System.out.println("Задача 1");

        String firstName = "Дмитрий";
        String middleName = "Петрович";
        String lastName = "Волков";
        String fullName = lastName +" " + firstName+ " " + middleName;
        System.out.println(fullName);

        System.out.println();

        //        Задача 2
        System.out.println("Задача 2");
        String fullName2;
        fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        System.out.println();

        //        Задача 3
        System.out.println("Задача 3");
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — "+ fullName3);

        System.out.println();

        //        Задача 4
        System.out.println("Задача 4");



    }
}