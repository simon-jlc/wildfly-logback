package com.simon.loggers;

import com.simon.perf.AppPerfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by margot on 07/01/2017.
 */

@SuppressWarnings("serial")
@WebServlet("/AppPerf")
public class AppPerfServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(AppPerfService.class);

    @Inject
    AppPerfService appPerfService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        appPerfService.registerAll();
        logger.info("All MBean registerd..");

    }
}
