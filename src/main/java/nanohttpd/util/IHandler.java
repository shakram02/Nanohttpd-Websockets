package nanohttpd.util;

/*
 * #%L
 * NanoHttpd-Core
 * %%
 * Copyright (C) 2012 - 2016 nanohttpd
 * %%

 * #L%
 */

/**
 * Defines a generic handler that returns an object of type O when given an
 * object of type I.
 * 
 * @author LordFokas
 * @param <I>
 *            The input type.
 * @param <O>
 *            The output type.
 */
public interface IHandler<I, O> {

    public O handle(I input);
}
