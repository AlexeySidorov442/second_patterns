package ObserverPattern;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobsSite javaDeveloperJobsSite = new JavaDeveloperJobsSite();
        javaDeveloperJobsSite.addVacancy("Junior QA Automation engineer");
        javaDeveloperJobsSite.addVacancy("Middle QA Automation engineer");

        Observer observer = new Subscriber("Aleksey Sidorov");
        javaDeveloperJobsSite.addObserver(observer);
        javaDeveloperJobsSite.addVacancy("Senior QA Automation engineer");

    }
}
