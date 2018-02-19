package structural.adapter;

public class EnglishToSpanishAdapter implements SpanishSpeaker {

    private EnglishSpeaker englishSpeaker;

    public EnglishToSpanishAdapter(EnglishSpeaker englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }

    @Override
    public String sayHola() {
        return translateToSpanish(englishSpeaker.sayHello());
    }

    private String translateToSpanish(String toTranslate) {
        return "Hola";
    }
}
