package com.company;

import java.util.Collection;

public interface IWaitList <E> {

    void add(E element) throws IllegalStateException;

    E remove();

    boolean contains(E element);

    boolean containsAll(Collection<E> collection);

    boolean isEmpty();

}
