package com.ndcc.ndccservicelogin.util;

import com.ndcc.ndccservicelogin.model.User;
import org.apache.commons.lang3.StringUtils;

public class NdccUtil {

    public static boolean validate(User user) {
        boolean isUserValid = false;
        if (user != null
                && StringUtils.isNotEmpty(user.getUserId())
                && StringUtils.isNotEmpty(user.getEmail())
                && StringUtils.isNotEmpty(user.getPassword())) {

            isUserValid = true;
        }
        return isUserValid;
    }
}
