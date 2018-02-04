package structural.factorymethod;

public class Manager implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("What Agile methodologies do you know?");
    }
}
