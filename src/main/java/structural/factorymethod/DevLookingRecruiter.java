package structural.factorymethod;

public class DevLookingRecruiter implements Recruiter {
    @Override
    public Interviewer inviteInterviewer() {
        return new Developer();
    }
}
