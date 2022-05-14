import ru.ufa.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        // в строке 10 возможно деление на 0, поэтому
        // можно ловить ошибку try/catch, можно как предложено в реализации ДЗ
        // использовать полноценный многострочный блок кода с { return }, где будет
        // вывод сообщения о делении на 0, можно с тернарным оператором
        // заменить деление на 0 на другую операцию без ошибки,
        // при этом результат должен быть Integer, т.к. BinaryOperator<Integer> devide
        // у нас возвращает int (вернем 0 и сообщим об ошибке).

        calc.println.accept(c);
    }
}