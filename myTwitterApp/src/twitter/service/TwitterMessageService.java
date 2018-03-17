package twitter.service;

import twitter.dto.TwitterMessageDto;

public interface TwitterMessageService {

    public TwitterMessageDto findById(int id);
}
