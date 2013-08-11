import org.apache.http.impl.io.AbstractSessionOutputBuffer;
import org.apache.http.params.HttpParams;

import java.io.OutputStream;

/**
 * Created by Michal on 11.8.2013.
 */
public class bla {
    AbstractSessionOutputBuffer asdsd = new AbstractSessionOutputBuffer() {
        @Override
        protected void init(OutputStream outstream, int buffersize, HttpParams params) {
            super.init(outstream, buffersize, params);
        }
    };
}
