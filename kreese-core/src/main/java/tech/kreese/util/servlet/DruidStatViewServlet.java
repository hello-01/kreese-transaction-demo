package tech.kreese.util.servlet;

import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

@WebServlet(urlPatterns = { "/druid/*" },
	initParams = { 
//				@WebInitParam(name = "loginUsername", value = "roncoo"),
//				@WebInitParam(name = "loginPassword", value = "roncoo")
				}
)
public class DruidStatViewServlet extends StatViewServlet {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 545913726142585346L;

}