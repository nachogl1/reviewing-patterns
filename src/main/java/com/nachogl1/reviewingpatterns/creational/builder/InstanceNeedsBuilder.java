package com.nachogl1.reviewingpatterns.creational.builder;

public class InstanceNeedsBuilder {

    private String name;
    private int age;

    private InstanceNeedsBuilder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstanceNeedsBuilder{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public InstanceNeedsBuilder build() {
            return new InstanceNeedsBuilder(this.name, this.age);
        }
    }
}
