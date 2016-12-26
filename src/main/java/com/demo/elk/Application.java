/**
 * Project Name:ELKDemo
 * File Name:Application.java
 * Package Name:com.demo.elk
 * Date:2016年12月21日下午3:05:18
*/

package com.demo.elk;

import org.apache.log4j.Logger;

/**
 * ClassName:Application <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年12月21日 下午3:05:18 <br/>
 * @author   zhujisong
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Application {
	private static final Logger LOGGER = Logger.getLogger(Application.class);
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            LOGGER.error("log4j test [" + i + "].");
            Thread.sleep(500);
        }
    }
}

