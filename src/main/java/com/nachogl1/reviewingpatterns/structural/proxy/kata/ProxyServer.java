package com.nachogl1.reviewingpatterns.structural.proxy.kata;

public class ProxyServer implements Resource {

    private Resource targetResource;
    private String cachedResult;

    public ProxyServer(Resource targetResource) {
        this.targetResource = targetResource;
    }

    @Override
    public String getResource() {
        if (this.cachedResult == null) this.cachedResult = this.targetResource.getResource();

        return this.cachedResult;
    }
}
