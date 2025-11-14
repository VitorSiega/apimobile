package spring.ai.example.spring_ai_demo.errorStatus;

public class ErrorResponse {

    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    // Getter e Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}