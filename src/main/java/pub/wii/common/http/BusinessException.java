package pub.wii.common.http;

public class BusinessException extends Exception {
    Status status;

    public BusinessException(Status status) {
        super(status.getMsg());
        this.status = status;
    }

    public BusinessException(Status bizStatus, String message) {
        super(message);
        this.status = bizStatus;
    }

    public BusinessException(Status bizStatus, String message, Throwable cause) {
        super(message, cause);
        this.status = bizStatus;
    }

    public BusinessException(Status bizStatus, Throwable cause) {
        super(bizStatus.getMsg(), cause);
        this.status = bizStatus;
    }

    public int getCode() {
        return this.status.getCode();
    }

    public Status getStatus() {
        return this.status;
    }

}
