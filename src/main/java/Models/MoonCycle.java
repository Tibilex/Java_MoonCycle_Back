package Models;

import java.time.LocalDate;

public class MoonCycle {

    private LocalDate currentDate;
    private static String[] moonCycle = {"Нарастающая Луна", "Полнолуние", "Убывающая луна", "Последняя четверть",
            "Убывающий серп", "Новая Луна", "Растущий серп", "Первая четверть"};

    public MoonCycle(){ }

    public LocalDate getCurrentDate() {
        return currentDate;
    }
    public String[] getmoon() {
        return moonCycle;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

}
