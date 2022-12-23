package com.amazon.device.ads;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

abstract class FileHandler implements Closeable {
    private static final String LOGTAG = FileHandler.class.getSimpleName();
    File file;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    public abstract void close();

    /* access modifiers changed from: protected */
    public abstract Closeable getCloseableReaderWriter();

    /* access modifiers changed from: protected */
    public abstract Closeable getCloseableStream();

    public abstract boolean isOpen();

    FileHandler() {
    }

    public boolean setFile(File file2, String str) {
        return setFile(new File(file2, str));
    }

    public boolean setFile(String str) {
        return setFile(new File(str));
    }

    public boolean setFile(File file2) {
        if (!isFileSet()) {
            this.file = file2;
            return true;
        } else if (file2.getAbsolutePath().equals(this.file.getAbsolutePath())) {
            return true;
        } else {
            this.logger.mo10939e("Another file is already set in this FileOutputHandler. Close the other file before opening a new one.");
            return false;
        }
    }

    public boolean isFileSet() {
        return this.file != null;
    }

    public long getFileLength() {
        if (isFileSet()) {
            return this.file.length();
        }
        throw new IllegalStateException("A file has not been set, yet.");
    }

    public boolean doesFileExist() {
        if (isFileSet()) {
            return this.file.exists();
        }
        throw new IllegalStateException("A file has not been set, yet.");
    }

    /* access modifiers changed from: protected */
    public void closeCloseables() {
        Closeable closeableReaderWriter = getCloseableReaderWriter();
        if (closeableReaderWriter != null) {
            try {
                closeableReaderWriter.close();
            } catch (IOException e) {
                this.logger.mo11020e("Could not close the %s. %s", closeableReaderWriter.getClass().getSimpleName(), e.getMessage());
                closeStream();
            }
        } else {
            closeStream();
        }
    }

    private void closeStream() {
        Closeable closeableStream = getCloseableStream();
        if (closeableStream != null) {
            try {
                closeableStream.close();
            } catch (IOException e) {
                this.logger.mo11020e("Could not close the stream. %s", e.getMessage());
            }
        }
    }
}
