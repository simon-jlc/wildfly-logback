package com.simon.perf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * Created by margot on 07/01/2017.
 */
public class AppPerfService {

    Logger logger = LoggerFactory.getLogger(AppPerfService.class);

    public void registerAll() {
        logger.info("Start register all MBean...");
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = null;
        try {
            name = new ObjectName("com.simon.perf:type=AppMXBean");
            AppPerf mbean = new AppPerf();
            mbs.registerMBean(mbean, name);
            logger.info("Register MBean {}", AppPerf.class);
//            while (true) {
//                Thread.sleep(1000);
//                mbean.setValue(mbean.getValue() + 1);
//            }

            mbean.setValue(10);

        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (InstanceAlreadyExistsException e) {
            e.printStackTrace();
        } catch (MBeanRegistrationException e) {
            e.printStackTrace();
        } catch (NotCompliantMBeanException e) {
            e.printStackTrace();
        }
    }
}
