package creational.factorymethod;

public class Developer implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("What is complexity of Merge Sort algorithm?");
    }
}
