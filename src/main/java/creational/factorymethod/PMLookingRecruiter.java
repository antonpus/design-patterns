package creational.factorymethod;

public class PMLookingRecruiter implements Recruiter {
    @Override
    public Interviewer inviteInterviewer() {
        return new Manager();
    }
}
