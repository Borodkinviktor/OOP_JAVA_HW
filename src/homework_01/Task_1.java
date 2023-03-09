package homework_01;

/*
Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения
А так же реализовать следующие классы-наследники:
1. Продукты питания, содержащие следующие свойства:
1.1 Срок годности
2. Напитки, содержащие следующие свойства:
2.1 Объём
3. Предметы гигиены, содержащие следующие свойства:
3.1 Количество штук в упаковке
4. Детские товары:
4.1 Минимальный возраст
4.2 Гипоаллергенность,
А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
5. Молоко, содержащиее следующее свойство:
5.1 Процент жирности
5.2 Срок годности
6. Лимонад
7. Хлеб, содержащий следующие свойство:
7.1 Тип муки
8. Яйца, содержащее следующиее свойство:
8.1 Количество в упаковке
9. Маски
10. Туалетная бумага, содержащее следующее свойство:
10.1 Количество слоёв
11. Подгузники, содержащие следующее свойства:
11.1 Размер
11.2 Минимальный вес
11.3 Максимальный вес
11.4 Тип
12. Соска
У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет происходить
вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и проверить работу
метода, созданного в классе Program
 */
public class Task_1 {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Milk("Сарафаново", 75, 1, "уп.", 1, 4, 10),
                new Lemonade("Буратино", 45, 1, "бут.", 0.5),
                new Bread("Бородинский", 47, 1, "уп.", 7, "Ржаная 1 сорт"),
                new Egg("Окское", 114, 1, "уп.", 10),
                new Mask("Safety mask", 75, 1, "уп.", 100),
                new ToiletPaper("Zewa ", 156, 1, "шт.", 4, 3),
                new Diaper("Cheris", 268, 28, "уп.",0, true, "L", 1, 24, "в цветочек"),
                new Nipple("Агуша ", 348, 1, "уп.", 0, false)
        };

        showFeatures(products);
    }

    public static void showFeatures(Product[] products){
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
