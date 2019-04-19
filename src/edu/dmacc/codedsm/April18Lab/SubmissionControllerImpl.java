package edu.dmacc.codedsm.April18Lab;

public class SubmissionControllerImpl implements SubmissionController {

    private FizzBuzzService service;

    public SubmissionControllerImpl (FizzBuzzService service) {
        this.service = service;
    }

    @Override
    public void submit(String userName, Integer inputNumber) {
    }

    public InputView submit(Integer inputNumber, String userName) {
        Submission submission = new Submission();
        submission.setInputNumber(inputNumber);
        submission.setUserName(userName);

        Result result = service.performFizzBuzzLogic(submission);
        return new ConsoleInputView(result);
    }
}
