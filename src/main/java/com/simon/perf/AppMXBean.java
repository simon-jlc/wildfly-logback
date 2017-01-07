package com.simon.perf;

/**
 * Created by margot on 07/01/2017.
 */
public interface AppMXBean {

    public String getName() ;

    public int getValue() ;

    public void setValue(int value) ;

    public void refresh() ;

}
