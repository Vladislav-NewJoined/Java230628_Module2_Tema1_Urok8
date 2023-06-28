import java.util.stream.IntStream;
import java.util.Random;

public class Task2_1_8_1 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tПопробуйте создать поток рандомных чисел от -10  до 10, отфильтруйте их " +
                "\nтак, чтобы остались только положительные, отсортируйте по возрастанию и выведите их  в консоль" +
                "\n\nРешение: ");
        int[] array = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив: ");
        IntStream.of(array).forEach(a -> System.out.print(a + " "));
        System.out.println(); // Это перенос строки

        Random random = new Random();
        System.out.println("Создаём потоковый массив рандомных чисел в количестве 20 чисел, отфильтровываем " +
                "\nиз него положительные числа, сортируем по возрастанию и выводим на печать:  ");
        IntStream s = random.ints(20, -10, 10);
        s.filter((a) -> a > 0).sorted().forEach(a -> System.out.print(a + " "));
        System.out.println(); // Это перенос строки
    }
}
