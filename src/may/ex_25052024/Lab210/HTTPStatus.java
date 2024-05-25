package src.may.ex_25052024.Lab210;

public class HTTPStatus {
    public static void main(String[] args) {
        HTTPStatusCODE status = HTTPStatusCODE.OK;
        System.out.println(status.getCode() +" - " + status.getMessage());
    }




}

enum HTTPStatusCODE{
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");


    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    HTTPStatusCODE(int code, String message) {
        this.code = code;
        this.message = message;
    }


}
