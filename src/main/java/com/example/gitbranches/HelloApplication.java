package com.example.gitbranches;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    @Override
    public String toString() {
        return super.toString();
    }
}