package modernjavainaction.chap03.aroundPattern;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader br) throws IOException;

}
