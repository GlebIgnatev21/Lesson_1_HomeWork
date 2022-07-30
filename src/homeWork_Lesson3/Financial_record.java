package homeWork_Lesson3;

public class Financial_record {
    // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
    // 4. Записать в файл "report.txt" данные из объекта класса.
    // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

    int incomes;
    int outcomes;

    public Financial_record(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}

