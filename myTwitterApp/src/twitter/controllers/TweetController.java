package twitter.controllers;

import twitter.dto.TwitterMessageDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet (name = " TweetController",value = "/tweet")
public class TweetController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tweeIdAsString = req.getParameter("tweetId");

        int tweetId = Integer.valueOf(tweeIdAsString);

        TwitterMessageDto twitterMessageDto1 = new TwitterMessageDto(1, "first message", "mike");
        TwitterMessageDto twitterMessageDto2 = new TwitterMessageDto(2, "second message", "john");

        Map<Integer, TwitterMessageDto> tweetsMap = new HashMap<Integer, TwitterMessageDto>();

        tweetsMap.put(twitterMessageDto1.getId(), twitterMessageDto1);
        tweetsMap.put(twitterMessageDto2.getId(), twitterMessageDto2);

        TwitterMessageDto foundTweet = tweetsMap.get(tweetId);

        req.setAttribute("tweet",foundTweet);
        RequestDispatcher rd = req.getRequestDispatcher ("/tweets/tweet.jsp");
        rd.forward(req,resp);
    }
}
