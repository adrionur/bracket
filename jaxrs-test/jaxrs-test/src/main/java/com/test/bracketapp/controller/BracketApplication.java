package com.test.bracketapp.controller;


import com.test.bracketapp.controller.BracketController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class BracketApplication extends Application {
    private Set<BracketController> controllers = new HashSet<>();

    public BracketApplication() {
        controllers.add(new BracketController());
    }

    public Set<BracketController> getControllers() {
        return controllers;
    }
}
