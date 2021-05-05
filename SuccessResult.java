public class SuccessResult implements Result{
    private boolean success;
    private String message;

    public SuccessResult(){
        this.success = true;
    }
    public SuccessResult(Boolean success, String message){
        this();
        this.message = message;
    }


    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
