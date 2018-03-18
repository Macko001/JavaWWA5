package twitter.servlets;

import twitter.dto.TwitterMessageDto;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "TweetServlet", value = "/tweetServlet")

public class TweetServlet extends HttpServlet {

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

        ServletOutputStream out = resp.getOutputStream();

        out.println("<html>");
        out.println("<form>");
        out.println("<input type=\"text\" name=\"message\" value=\""+foundTweet.getMessage()+"\"/>");
        out.println("<input type=\"hidden\" name=\"id\" value=\""+foundTweet.getId()+"\"/>");
        out.println("<input type=\"text\" name=\"username\" value=\"" +foundTweet.getUsername()+"\"/>");

        out.println("</form>");
        out.println("</html>");

    }
}