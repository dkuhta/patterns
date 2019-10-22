package com.patterns.creational.prototype;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public interface Prototype extends Cloneable {

    Prototype clone() throws CloneNotSupportedException;
}
