import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        task3();
    }

static void task3(){
    try (/*<aside>
        📔 **Текст задачи:**
        
        Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
        
        Пример 1: а = 3, b = 2, ответ: 9
        
        Пример 2: а = 2, b = -2, ответ: 0.25
        
        Пример 3: а = 3, b = 0, ответ: 1
        
        </aside>*/
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку ");
            String input = scanner.nextLine();


            String[] words = input.split(" ");

            String reversed = "";

                for (int i = words.length - 1; i >= 0; i--) {
                    reversed += words[i];
                    if (i > 0) {
                        reversed += " ";
                    }
                }

                System.out.printf("Результат %s: ", reversed);
        }
        }
    }