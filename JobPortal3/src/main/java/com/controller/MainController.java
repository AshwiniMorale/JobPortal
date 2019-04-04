package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.services.Mailer;
import com.services.SendMsg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

	SendMsg sendSMS = new SendMsg();
	Mailer senMail = new Mailer();

	MainController() {
		System.out.println("::MainController:: Constructor():called");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("::MainController:: register():called");
		String eMail = req.getParameter("eMail");
		String msg = "Welcome to cyber edu " + req.getParameter("uName") + " " + req.getParameter("lName");

		System.out.println(eMail + "\n " + req.getParameter("uName") + "\n " + req.getParameter("lName") + "\n "
				+ req.getParameter("nPass"));

		senMail.send("info.cyberedu@gamil.com", "!ndian@123", eMail, "Welcome", msg);
		sendSMS.sendMsg(req.getParameter("nPass"), msg);

		System.out.println("Success...");

		return new ModelAndView("registration", "message", msg);
	}
}
