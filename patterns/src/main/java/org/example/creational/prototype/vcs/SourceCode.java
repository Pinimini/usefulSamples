package org.example.creational.prototype.vcs;

public class SourceCode implements Copyable {
    private String sourceName;

    public SourceCode(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @Override
    public String toString() {
        return "SourceCode{" +
                "sourceName='" + sourceName + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new SourceCode(sourceName);
    }
}
