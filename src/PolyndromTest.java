/*Реализуйте метод, проверяющий, является ли заданная строка палиндромом.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Подсказки (не читайте, если хотите решить сами):

для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по регулярному выражению;
для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
в классе String есть методы для преобразования всей строки в верхний и нижний регистр.*/

public class PolyndromTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        //Убираем проблемы и знаки препинания
        String replaced = text.replaceAll("[^a-zA-Z0-9]","");
        //Делаем StringBuilder, чтобы реверснуть строку
        StringBuilder reverseReplaced = new StringBuilder(replaced);
        //А еще круче это: return result.equalsIgnoreCase(new StringBuilder(result).reverse().toString());
        //Для сравнения, надо обязательно преобразовывать StringBuilder в String!
        return (reverseReplaced.reverse().toString()).equalsIgnoreCase(replaced);
        //.equalsIgnoreCase - метод, который позволяет сравнивать, игнорируя регистр
        }
}
