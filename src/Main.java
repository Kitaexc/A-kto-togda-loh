import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

import static java.lang.Math.pow;

public class Main {

    public static Scanner vvod = new Scanner(System.in);
    public static void main(String[] args) {
        String scr = """
                После новогодних праздников Ашот набрал прилично веса,
                поэтому он создал калькулятор ИМТ, чтобы быстрее похудеть.
                Если ты тоже хочешь начать пользоваться калькулятором отправь 1.
                
                ----------------------------------------------------------------
                1. Ашот радоваться :D
                2. Ашот грустить :(                 
                """;

        System.out.println(scr);
        try {

            int num = vvod.nextInt();
            switch (num) {
                case 1:
                    dannie();
                    break;
                case 2:
                    System.exit(0);
            }
        }
        catch (Exception exception){
            System.out.println("Ты не тупой, все ошибаются ^_^");
        }
    }
    public static void dannie(){
        System.out.println("Для начала введите свой текущий рост в метрах с точностью до сотых: ");
        double size = vvod.nextDouble();
        System.out.println("Отлично, теперь введи свой вес, с точностью до десятых: ");
        float weight = vvod.nextFloat();
        System.out.println("Капец ты конечно, Ашот такой вес не одобрять, введи свой возраст: ");
        int age = vvod.nextInt();
        System.out.println("Выберите ваш пол: \n1. Мужчина\n2. Женщина");
        int or = vvod.nextInt();

        double imt = weight / pow(size, 2);
        System.out.printf("Ваш ИМТ равен: " + "%.1f", imt);
        double ideal = 24.9 * pow(size, 2);
        double sbros = weight - ideal;
        double nabor = ideal - weight;
        if (or == 1){
            double bmrM = (10 * weight) + (6.25 * (size * 100)) - (5 * age) + 5;
            if (imt > 24.9){
                System.out.println("Рекомендуется снизить вес для достижения идеального веса.");
                System.out.println("Идеальный вес: " + ideal + "кг.");
                System.out.println("Необходимо сбросить: " + sbros + "кг.");
                System.out.println("Рекомендуемый дневной прием калорий:" + (bmrM - 500)  + "ккал.");
            }
            else if (imt < 18.5){
                System.out.println("Рекомендуется набрать вес для достижения идеального веса.");
                System.out.println("Идеальный вес: " + ideal + "кг.");
                System.out.println("Необходимо набрать: " + nabor + "кг.");
                System.out.println("Рекомендуемый дневной прием калорий:" + (bmrM + 500) + "ккал.");
            }
            else{
                System.out.println("\nВаш вес в пределах нормы!\nАшот рекомендует принимать " + bmrM + "ккал.\nАшот радоваться за вас хехе :D ");
            }
        } else if (or == 2) {
            double bmrJ = (10 * weight) + (6.25 * (size * 100)) - (5 * age) - 161;
            if (imt > 24.9){
                System.out.println("Рекомендуется снизить вес для достижения идеального веса.");
                System.out.println("Идеальный вес: " + ideal + "кг.");
                System.out.println("Необходимо сбросить: " + sbros + "кг.");
                System.out.println("Рекомендуемый дневной прием калорий:" + (bmrJ - 500)  + "ккал.");
            }
            else if (imt < 18.5){
                System.out.println("Рекомендуется набрать вес для достижения идеального веса.");
                System.out.println("Идеальный вес: " + ideal + "кг.");
                System.out.println("Необходимо набрать: " + nabor + "кг.");
                System.out.println("Рекомендуемый дневной прием калорий:" + (bmrJ + 500) + "ккал.");
            }
            else{
                System.out.println("\nВаш вес в пределах нормы!\nАшот рекомендует принимать " + bmrJ + "ккал.\nАшот радоваться за вас хехе :D ");
            }
        }
    }
}
