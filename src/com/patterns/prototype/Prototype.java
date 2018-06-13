package com.patterns.prototype;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public interface Prototype {

    Prototype doClone() throws CloneNotSupportedException;
}
