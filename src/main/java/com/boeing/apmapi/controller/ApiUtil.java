package com.boeing.apmapi.controller;

import org.springframework.web.context.request.NativeWebRequest;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

public class ApiUtil {
    public static final String NODE_ID_REGEX = "^[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*";
    public static final Pattern NODE_ID_PATTERN = Pattern.compile(NODE_ID_REGEX);
    public static void setExampleResponse(NativeWebRequest req, String contentType, String example) {
        try {
            HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
            if(res == null) {
                throw new RuntimeException("No HttpServletResponse");
            }
            res.setCharacterEncoding("UTF-8");
            res.addHeader("Content-Type", contentType);
            res.getWriter().print(example);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } 
    }

    public static void validateNodeIdFormat(String nodeId) {
        if(nodeId == null || !NODE_ID_PATTERN.matcher(nodeId).matches()) {
            throw new IllegalArgumentException("Invalid node ID");
        }
    }
}
