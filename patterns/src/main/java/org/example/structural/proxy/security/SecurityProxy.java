package org.example.structural.proxy.security;

public class SecurityProxy implements SecurityAccess {

    SecurityAccess securityAccess;

    public SecurityProxy(SecurityAccess securityAccess) {
        this.securityAccess = securityAccess;
    }

    @Override
    public void access() {
        System.out.println("Before");
        securityAccess.access();
        System.out.println("After");
    }
}
