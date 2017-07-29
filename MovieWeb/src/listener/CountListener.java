package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountListener implements HttpSessionListener {

	private int userNum;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {

		userNum++;
		arg0.getSession().setAttribute("userNum", userNum);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {

		userNum--;
		arg0.getSession().setAttribute("userNum", userNum);
	}

}
