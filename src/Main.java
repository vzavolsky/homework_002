import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args)
    {
        task_001();
        task_002();
        task_003();
        task_004();
        task_005();
        task_006();
        task_007();
        task_008();
    }

    public static void space() {
        System.out.println("----------------------------");
    }
    public static void task_001() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        space();
    }

    public static void task_002() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var increment = 4;

        dog = dog + increment;
        cat = cat + increment;
        paper = paper + increment;

        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        space();
    }

    public static void task_003() {
        var dog = 8.0; // Объявили и инициировали переменные
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5; // Выполнили арифметические действия
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Dog = " + dog); // Вывели в консоль
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        space();
    }

    public static void task_004() {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        space();
    }

    public static void task_005() {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        space();
    }

    public static void task_006() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Общий вес бойцов: " + (boxerWeight1 + boxerWeight2) + " кг");
        System.out.println("Разница бойцов в весе: " + abs(boxerWeight1 - boxerWeight2) + " кг");
        space();
    }

    public static void task_007() {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        //Решение задачи через вычетание
        System.out.println("Разница бойцов в весе: " + abs(boxerWeight2 - boxerWeight1) + " кг");
        //Решение задачи через остаток от деления
        System.out.println("Разница бойцов в весе: " + (boxerWeight2 % boxerWeight1) + " кг");
        space();
    }

    public static void task_008() {
        var hoursAmount = 640;
        var hourPerEmploye = 8;
        var employesInCompany = 94;

        System.out.println("Всего работников в компании — " + (hoursAmount / hourPerEmploye) + " человек");
        System.out.println("Если в компании работает " + employesInCompany + " человек, то всего " + (employesInCompany * hourPerEmploye) + " часа(ов) работы может быть поделено между сотрудниками");
        space();
    }
}