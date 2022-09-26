public class Main {
    public static void main(String[] args) {
//        String phone = "+960-415-75-30";
//        phone = phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
////            phone = '7' + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException(" Телефон слишко длинный ");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий ");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Среди нас спосторонний");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79604157530";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("Успех ");
//        } else {
//            System.out.println("Неудача ");
//        }
        System.out.println("Задание 1");
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastNAme = "Семёнович";
        String fullName = firstName + " " + middleName + " " + lastNAme;
        System.out.println("Ф.И.О. сорудника: " + fullName);

        System.out.println("Задание 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО для сотрудника для заполнения отчета - " + upperFullName);

        System.out.println("Задание 3");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}