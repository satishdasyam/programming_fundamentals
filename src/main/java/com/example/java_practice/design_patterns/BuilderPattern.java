package com.example.java_practice.design_patterns;

public class BuilderPattern {
    private final String name;
    private final int rank;
    private final int grade;

    private BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.rank = builder.rank;
        this.grade = builder.grade;
    }


    static class Builder {
        private String name;
        private int rank;
        private int grade;

        public Builder(String name) {
            if (name == null) {
                throw new IllegalArgumentException("name can not be null");
            }
            this.name = name;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

        public Builder addrank(int rank) {
            this.rank = rank;
            return this;
        }

        public Builder addGrade(int grade) {
            this.grade = grade;
            return this;
        }

    }
}
