//Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.

public class charExpression {
    public static void main(String[] args) {
        System.out.println(charExpression(32));
    }
    public static char charExpression(int a) {
                int c = '\\' + a; //преобразуем символ в int, экранируя слэш. Прибавляем наше a
                return  (char) c; //возвращаем полученное, преобразуя его в char
    }
}
