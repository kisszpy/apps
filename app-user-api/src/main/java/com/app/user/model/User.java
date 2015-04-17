package com.app.user.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by zhaop01 on 2015/4/17.
 */
public class User implements Serializable {

    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String name;

}
