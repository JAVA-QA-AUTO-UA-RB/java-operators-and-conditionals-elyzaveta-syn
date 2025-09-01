import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Забута усіма стежка привела до чарівного лісу...");
        System.out.println("Якщо ти сміливець, то не зупиняйся - попереду чекатимуть нові пригоди!");
        System.out.println("Ідучи далі чарівною стежкою, перед очима постає роздоріжжя: 1 - піти наліво, 2 - піти направо, 3 - повернутися назад");
        int health = 100;
        int luck = 50;

        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Ти обрав піти наліво та натрапив на святе місце");
            System.out.println("Тебе атакували лісні духи");
            health = 10;
            luck = luck - 10;
            System.out.println("Ти віддав свій амулет та зміг втекти");
            luck = luck - 10;

            System.out.println("Блукаючи лісом, ти зустрів закинуту хатину лісничого. Чи бажаєш зайти? 1 - так, 2 - ні");
            Scanner s = new Scanner(System.in);
            int choice2 = s.nextInt();

            if ((choice1 == 1) && (choice2 == 1)) {
                System.out.println("Ти зайшов до хатини та побачив старі книги та зілля");
                luck += 5;
                System.out.println("У тебе низьке здоров'я - спробуєш знайти зілля зцілення? 1 - так, 2 - ні");
                Scanner с = new Scanner(System.in);
                int choice3 = с.nextInt();

                if ((choice1 == 1) && (choice2 == 1) && (choice3 == 1)) {
                    System.out.println("Ти випив жовте зілля");
                    System.out.println("Це виявилось зілля зцілення!");
                    health = 100;
                    luck = 100;
                    System.out.println("Ти продовжив вивчати книги та артефакти");
                }
                else {
                    System.out.println("Ти вирішиі не пити зілля та помер від низького здоров'я. Гра закінчена");
                    return;
                }
            } else {
                System.out.println("Ти продовжив блукати лісом, але помер від низького здоров'я. Гра закінчена");
                return;
            }
        }


        else if (choice1 == 2) {
            System.out.println("Ти обрав піти направо та натрапив на чарівне озеро...");
            luck = luck + 20;
            System.out.println("Підійшовши ближче, ти побачив маленьку фею, яка розкладала квіточки на камінні.");

            System.out.println("Які наступні дії? 1 - забрати квіточки у феї, 2 - подарувати нову квіточку, 3 - пройти повз");
            Scanner scan = new Scanner(System.in);
            int choice4 = scan.nextInt();

            if ((choice1 == 2) && (choice4 == 1)) {
                System.out.println("Ти забрав квіточки, за що фея наклала на тебе прокляття");
                luck = 0;
                health -= 90;
            } else if ((choice1 == 2) && (choice4 == 2)) {
                System.out.println("Ти подарував квіточку, за що фея показала тобі старинний артефакт");
                luck = 100;
                System.out.println("Ти знайшов старинні багатства, вітаємо!");
            } else {
                System.out.println("Ти пройшов повз та продовжив блукати лісом");
                luck -= 10;
                System.out.println("Тебе атакували бжоли і сильно отруїли!");
                health -= 30;

                System.out.println("Недалеко є квітка, яка схожа на Чарівний лотос - цілющу рослину, або ж на Білу смерть - дуже отруйну квітку");
                System.out.println("Спробуєш приготувати з неї чай? 1 - так, 2 - ні");
                Scanner scann = new Scanner(System.in);
                int choice5 = scann.nextInt();

                if ((choice1 == 2) && (choice4 == 3) && (choice5 == 1)) {
                    System.out.println("О ні! Це виявилась Біла смерть!");
                    health = 0;
                    System.out.println("Ти помер. Гра закінчена");
                    return;
                } else {
                    System.out.println("Молодець! Це була отруйна квітка");
                    luck += 5;
                    System.out.println("Ти лишився досліджувати чарівний ліс.");
                }
            }

        } else {
            System.out.println("Коли ти намагався повернутися назад, духи лісу розгнівалися відсутності подарунків та заплутали стежки");
            luck = 0;
            System.out.println("Не знайшовши виходу, ти продовив блукати в лісі");
            health = 0;
            System.out.println("Ти втопився в болоті. Бажаєте почати гру спочатку?");
            return;
        }
    }
}
