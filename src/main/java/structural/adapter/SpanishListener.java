package structural.adapter;

public class SpanishListener {

    public void listenToGreetings(SpanishSpeaker speaker) {
        System.out.println("Spanish speaker said " + speaker.sayHola());
    }
}
