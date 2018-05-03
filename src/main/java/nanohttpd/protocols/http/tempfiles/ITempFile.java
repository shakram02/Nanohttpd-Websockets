package nanohttpd.protocols.http.tempfiles;

/*
 * #%L
 * NanoHttpd-Core
 * %%
 * Copyright (C) 2012 - 2016 nanohttpd
 * %%

 * #L%
 */

import java.io.OutputStream;

/**
 * A temp file.
 * <p/>
 * <p>
 * Temp files are responsible for managing the actual temporary storage and
 * cleaning themselves up when no longer needed.
 * </p>
 */
public interface ITempFile {

    public void delete() throws Exception;

    public String getName();

    public OutputStream open() throws Exception;
}
