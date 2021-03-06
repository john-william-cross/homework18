package edu.dmacc.codedsm.April18Lab;

public class FizzBuzzServiceImpl implements FizzBuzzService {

    private MapRepository repository;

    public FizzBuzzServiceImpl(MapRepository repository) {

        this.repository = repository;
    }

    @Override
    public Result performFizzBuzzLogic(Submission submission) {
        String message = " ";
        if (submission.getInputNumber() % 3 == 0 && submission.getInputNumber() % 5 == 0) {
            message = "FizzBuzz!";
        } else if (submission.getInputNumber() % 3 == 0) {
            message = "Fizz";
        } else if (submission.getInputNumber() % 5 == 0) {
            message = "Buzz";
        }

        Result result = new Result();
        result.setMessage(message);
        result.setSubmission(submission);

        repository.save(result);

        return result;

    }
}


