import java.util.Scanner;

public class Main {
    private static boolean hasKey = false;
    private static boolean hasSword = false;
    private static boolean hasPotion = false;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ласкаво просимо до захоплючої пригодницької гри!");

        // Початок гри
        System.out.println("Ви прокидаєтеся в темній кімнаті. Трохи оговтавшись, помічаєте декілька дверей. Перед вами постає вибір між двома дверми - праворуч та ліворуч.");
        System.out.println("Куди ви хочете піти? ('Праворуч' або 'Ліворуч'):");

        String direction = scanner.nextLine();

        if (direction.equalsIgnoreCase("праворуч")) {
            // Перша кімната
            System.out.println("Ви потрапили в першу кімнату. Знаходиться вона у повній темряві.");
            System.out.println("Що ви робите? (введіть 'Шукати' або 'Вийти'):");

            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("Шукати")) {
                System.out.println("Ви шукаєте в кімнаті те, що може вам допомогти та знаходите ключ!");
                hasKey = true;
                System.out.println("Після докладного пошуку ви помічаєте ще два предмети: меч та зілля.");
                System.out.println("Що ви робите? (введіть 'Взяти меч', 'Взяти зелье' або 'Вийти'):");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("Взяти меч")) {
                    System.out.println("Ви берете меч.");
                    hasSword = true;

                    System.out.println("Ви берете меч і готові до подальших пригод!");
                } else if (choice.equalsIgnoreCase("Взяти зілля")) {
                    System.out.println("Ви берете зілля.");
                    hasPotion = true;
                    System.out.println("Ви випили зілля. Це оживило вас! Ви відчуваєте себе сильнішим і готовим до пригод. Гра закінчена!");
                } else if (!choice.equalsIgnoreCase("Вийти")) {
                    System.out.println("Невірний ввід. Гра завершується.");
                    return;
                }

            }
        } else if (direction.equalsIgnoreCase("Ліворуч")) {
            // Друга кімната
            System.out.println("Ви потрапили в другу кімнату. Вона освітлена свічками. Ви почуваєте себе спокійно.");
            System.out.println("Перед вами стоїть стіл зі скринькою.");
            System.out.println("Що ви робите? ('Відкрити скриньку', 'Оглянути книги' або 'Пройти назад'):");

            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("Відкрити скриньку")) {
                hasKey = true;

                System.out.println("Ви відкриваєте скриньку та знаходите скарби! Вітаємо, ви виграли гру!");

            } else if (action.equalsIgnoreCase("Оглянути книги")) {

                System.out.println("Ви оглядаєте книги на столі, але вони здаються вам не потрібними.");
                System.out.println("Проте, одна книга привертає вашу увагу. Це старовинна книга із загадковими символами на обкладинці.");
                System.out.println("Ви відчуваєте, що вона може бути корисною. Бажаєте взяти її з собою? ('Взяти книгу' або 'Продовжити дослідження'):");

                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Взяти книгу")) {
                    System.out.println("Ви берете старовинну книгу з собою.");

                } else if (choice.equalsIgnoreCase("Продовжити дослідження")) {
                    System.out.println("Ви вирішуєте не брати книгу та продовжуєте досліджувати кімнату.");

                } else {
                    System.out.println("Невірний ввід. Гра завершується.");
                    return;
                }

            } else if (action.equalsIgnoreCase("Пройти назад")) {
                System.out.println("Ви повертаєтесь назад до вибору дверей.");
            } else {
                System.out.println("Невірний ввід. Гра завершується.");
                return;
            }

        }

        scanner.close();
    }
}