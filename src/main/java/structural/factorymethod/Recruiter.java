package structural.factorymethod;

@FunctionalInterface
public interface Recruiter {

    Interviewer inviteInterviewer();

    default void runInterview() {
        Interviewer interviewer = inviteInterviewer();
        interviewer.askQuestion();
    }
}
