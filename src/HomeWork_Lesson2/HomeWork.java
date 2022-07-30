package HomeWork_Lesson2;

public class HomeWork {
    public static void main(String[] args) {
        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        //
        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        //
        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.
//        Cat mursik = new Cat("Mursik", 3);
//        Dog muhtar = new Dog("Muhtar", true);
//        System.out.println(muhtar.getName() + " " + mursik.getName());


        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
//        double increment = 1;
//        double result = 0;
//        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
//        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
//        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
//        long count = 0;
//
//        for (double i = 0; i < 10; i += increment) {
//            count++;
//            System.out.print("i = " + i + " ");
//        }
//        System.out.println("\n" + "count = " + count);
//
//        int count2 = 0;
//        do {
//            if(increment <= 0){
//                break;
//            }
//            result += increment;
//            count2++;
//            if(result >= 1_000_000){
//                System.out.println("count = " + count2);
//            }
//
//        }while (result < 1_000_000);



        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

//        int[] arrey1 = new int[]{1, 1, 1, 1};
//        int[] arrey2 = new int[4];
//        for (int i = 0; i < arrey1.length; i++){
//            if(i % 2 == 1){
//                arrey1[i] = 999;
//            }
//            if(i % 2 == 0){
//                arrey1[i] = 23;
//            }
//            arrey2[i] = arrey1[i];
//            System.out.print(arrey2[i] + " "); // Позволяет распечатать массив е через Arreys.toString
//        }
//        System.out.println("\n" + Arrays.toString(arrey2));



        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
//        double prise = 0;
//        int countProblems = 0;
//
//        if(!hasFuel && !(hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)){
//            prise = 1000;
//        }else {
//            if(hasMotorProblem){
//                prise += 10000;
//                countProblems++;
//            }
//
//            if(hasElectricsProblem){
//                prise += 5000;
//                countProblems++;
//            }
//
//            if (hasTransmissionProblem){
//                prise += 4000;
//                countProblems++;
//            }
//
//            if (hasWheelsProblem){
//                prise += 2000;
//                countProblems++;
//            }
//
//            if (countProblems > 1){
//                prise *= 0.9;
//            }
//
//            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)){
//                prise *= 0.8;
//            }
//
//        }
//
//        System.out.println(prise);
//        System.out.println(countProblems);


        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        StoreHouse storeHouse = new StoreHouse();
        Worker worker1 = new Worker(storeHouse);
        Worker worker2 = new Worker(storeHouse);
        Worker worker3 = new Worker(storeHouse);


        worker1.brokeVodka();
        worker2.brokeVodka();
        worker3.brokeVodka();
        System.out.println(storeHouse.getCountProdukt());







        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
        // Не повторяющиеся

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
    }
}
