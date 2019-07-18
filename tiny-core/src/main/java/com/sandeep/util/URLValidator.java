package com.sandeep.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;

@Service(value ="urlValidator")
public class URLValidator {

    private static final  Logger LOGGER = LoggerFactory.getLogger(URLValidator.class);

    public static boolean urlValidator(String url) {
        try {
            LOGGER.info("===== validating url=======");
            new URL(url).toURI();
            return true;
        }
        catch (Exception exception) {
            LOGGER.error(String.format("====Invalid URL====: %s",url));
            return false;
        }
    }

    public static boolean isAliveURL(String url) {
        try {
            LOGGER.info("==========checking liveness of url=========");
            URL urlObject = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlObject.openConnection();
            httpURLConnection.setRequestMethod(HttpMethod.HEAD.name());  //OR  huc.setRequestMethod ("HEAD");
            httpURLConnection.connect();
            return httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK;
        }
        catch (Exception e) {
            LOGGER.error(String.format("=====Error while checking liveness of given URL== %s",url));
            return false;
        }
    }

}
