
package edu.dmacc.codedsm.April18Lab;

public class AlternateFizzBuzzServiceImpl implements FizzBuzzService {

    private MapRepository repository;

    public AlternateFizzBuzzServiceImpl(MapRepository repository) {

        this.repository = repository;
    }

    @Override
    public Result performFizzBuzzLogic(Submission submission) {
        String message = " ";


        if(submission.getInputNumber() % 4 == 0 && submission.getInputNumber() % 7 == 0) {
            message = "FizzBuzz";
        } else if (submission.getInputNumber() % 4 == 0) {
            message = "Fizz";
        } else if (submission.getInputNumber() % 7 == 0) {
            message = "Buzz";
        } else {
            message = "Input was not fizzy.";
        }

        Result result = new Result();
        result.setMessage(message);
        result.setSubmission(submission);

        repository.save(result);

        return result;

    }
}


