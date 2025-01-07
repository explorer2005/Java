package banking;

public class OverDraftLimitExceedsException extends Exception{
    public OverDraftLimitExceedsException(String message){
        super(message);
    }
}
