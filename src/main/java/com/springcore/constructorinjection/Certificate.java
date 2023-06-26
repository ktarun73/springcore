package com.springcore.constructorinjection;

public class Certificate {
    private int certId;

    public Certificate(int certId) {
        this.certId = certId;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certId=" + certId +
                '}';
    }
}
