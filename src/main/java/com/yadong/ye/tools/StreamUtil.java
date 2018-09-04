package com.yadong.ye.tools;


import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class StreamUtil {
    public static String readRequestInputStream(HttpServletRequest request) throws Exception{
        return readRequestInputStream(request, "utf-8");
    }

    public static String readRequestInputStream(HttpServletRequest request, String charset) throws Exception{
        if (null == request
                || StringUtils.isEmpty(charset)) {
            return null;
        }

        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();
        try {
            reader = new BufferedReader(new InputStreamReader(request.getInputStream(), charset));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        }finally {
            if (null != reader) {
                reader.close();
            }
        }
        return builder.toString();
    }
}
