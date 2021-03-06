package twitter.controllers;

import twitter.dto.TwitterMessageDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TweetsController", value = "/tweets")
public class TweetsController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TwitterMessageDto twitterMessageDto1 = new TwitterMessageDto(1, "first message", "mike");
        TwitterMessageDto twitterMessageDto2 = new TwitterMessageDto(2, "second message", "john");

        List<TwitterMessageDto> tweets = new ArrayList<TwitterMessageDto>();
        tweets.add(twitterMessageDto1);
        tweets.add(twitterMessageDto2);

        req.setAttribute("tweetsModel",tweets);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/tweets/tweets.jsp");
        dispatcher.forward(req,resp);



    }
}