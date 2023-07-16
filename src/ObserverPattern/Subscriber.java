package ObserverPattern;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> vacancies) {
        System.out.println("Dear " + name + " actual list of vacancies:\n" + vacancies);
    }
}
