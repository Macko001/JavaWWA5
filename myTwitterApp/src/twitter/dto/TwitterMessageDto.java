package twitter.dto;

public class TwitterMessageDto {

    public TwitterMessageDto(Integer id, String message, String username) {
        this.id = id;
        this.message = message;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    private Integer id;

    private String message;

    private String username;


}
