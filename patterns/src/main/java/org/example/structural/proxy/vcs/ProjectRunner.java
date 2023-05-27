package org.example.structural.proxy.vcs;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/Pinimini/realProject");
        project.run();
    }
}
