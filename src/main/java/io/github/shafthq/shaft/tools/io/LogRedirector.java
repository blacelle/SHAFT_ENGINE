package io.github.shafthq.shaft.tools.io;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import java.io.OutputStream;

public class LogRedirector extends OutputStream {
    private final Logger logger;
    private final Level level;
    //    private final OutputStream outputStream;
    private StringBuilder stringBuilder;

    public LogRedirector(Logger logger, Level level) {
        this.logger = logger;
        this.level = level;
        stringBuilder = new StringBuilder();
    }

    @Override
    public void write(byte[] b) {
        char c = (char) ((b[0] << 8) | (b[1] & 255));
        if (c == '\r' || c == '\n') {
            if (stringBuilder.length() > 0) {
                logger.log(level, stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        } else
            stringBuilder.append(c);
    }

    @Override
    public void write(byte[] b, int off, int len) {
        char c = (char) ((b[off] << 8) | b[off + 1] | (b.length << len - off));
        if (c == '\r' || c == '\n') {
            if (stringBuilder.length() > 0) {
                logger.log(level, stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        } else
            stringBuilder.append(c);
    }

    @Override
    public void write(int b) {
        char c = (char) b;
        if (c == '\r' || c == '\n') {
            if (stringBuilder.length() > 0) {
                logger.log(level, stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        } else
            stringBuilder.append(c);
    }
}
