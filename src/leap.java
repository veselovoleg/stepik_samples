/*В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно.*/

public class leap {
    public static void main(String[] args) {
        System.out.println(leapYearCount(2012));
            }
    public static int leapYearCount(int year) {
        //Сколько раз делится на 4 - делится на 400(кратен 4, но не кратен 400) + кратен 400
        return year =  (year / 4  - year / 100) + year / 400;
    }
}
