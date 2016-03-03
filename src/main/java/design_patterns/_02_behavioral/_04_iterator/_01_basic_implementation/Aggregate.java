package design_patterns._02_behavioral._04_iterator._01_basic_implementation;

public interface Aggregate {        // analog of java.lang.Iterable
    public Iterator createIterator();
}
