package edu.matc.taglibdemoeve;

import javafx.util.converter.LocalTimeStringConverter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by student on 10/26/16.
 */
public class HelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        DateFormat dateFormat = new SimpleDateFormat("MM/dd");

        Calendar halloweenTestCalendar = new GregorianCalendar(2013, 9, 31);

        out.println("Hi, the time is: " + sdf.format(cal.getTime()) + "<br />");
        out.println("Halloween test date: " + dateFormat.format(halloweenTestCalendar.getTime()) + "<br />");

        if(dateFormat.format(cal.getTime()).equals("10/31")) {
            out.println("It's Halloween.  Cool.");
        } else {
            out.println("The non-Halloween date is: " + dateFormat.format(cal.getTime()));
        }

        if(dateFormat.format(halloweenTestCalendar.getTime()).equals("10/31")) {
            out.println("<br /> Halloween Test Passed");
        }


    }
}
