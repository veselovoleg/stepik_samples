/*Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
Данная задача актуальна, например, при работе с битовыми полями.

Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.*/

public class flipBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(flipBit(42, 2)));


    }
        public static int flipBit (int value, int bitIndex) {
            return  value ^ (1 << bitIndex-1);
            //Берем единицу, двигаем ее на нужный нам байт.
            //Применяем XOR, который превращает 0 в 1, и 1 в 0.

    }
}
