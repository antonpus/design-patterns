package structural.adapter;

import org.junit.Test;

public class SpanishListenerTest {

    @Test
    public void adapterApi() {
        EnglishSpeakerImpl englishSpeaker = new EnglishSpeakerImpl();
        SpanishSpeakerImpl spanishSpeaker = new SpanishSpeakerImpl();

        SpanishListener spanishListener = new SpanishListener();

        spanishListener.listenToGreetings(new EnglishToSpanishAdapter(englishSpeaker));
    }
}