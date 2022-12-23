package com.amazon.device.ads;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

class FileOutputHandler extends FileHandler {
    private static final String LOGTAG = FileOutputHandler.class.getSimpleName();
    private BufferedWriter bufferedWriter;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    private OutputStream outputStream;
    private WriteMethod writeMethod;

    public enum WriteMethod {
        APPEND,
        OVERWRITE
    }

    FileOutputHandler() {
    }

    public boolean isOpen() {
        return this.outputStream != null;
    }

    public boolean open(WriteMethod writeMethod2) {
        if (this.file == null) {
            this.logger.mo10939e("A file must be set before it can be opened.");
            return false;
        } else if (this.outputStream != null) {
            this.logger.mo10939e("The file is already open.");
            return false;
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.file, WriteMethod.APPEND.equals(writeMethod2));
                this.writeMethod = writeMethod2;
                this.outputStream = new BufferedOutputStream(fileOutputStream);
                this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.outputStream));
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public void close() {
        flush();
        closeCloseables();
        this.bufferedWriter = null;
        this.outputStream = null;
    }

    public void flush() {
        OutputStream outputStream2 = this.outputStream;
        if (outputStream2 != null) {
            try {
                outputStream2.flush();
            } catch (IOException e) {
                this.logger.mo11020e("Could not flush the OutputStream. %s", e.getMessage());
            }
        }
        BufferedWriter bufferedWriter2 = this.bufferedWriter;
        if (bufferedWriter2 != null) {
            try {
                bufferedWriter2.flush();
            } catch (IOException e2) {
                this.logger.mo11020e("Could not flush the BufferedWriter. %s", e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public Closeable getCloseableStream() {
        return this.outputStream;
    }

    /* access modifiers changed from: protected */
    public Closeable getCloseableReaderWriter() {
        return this.bufferedWriter;
    }

    private void checkWritable() {
        if (this.bufferedWriter == null) {
            throw new IllegalStateException("Could not write to the file because no file has been opened yet. Please set the file, then call open() before attempting to write.");
        }
    }

    public void write(String str) throws IOException {
        checkWritable();
        this.bufferedWriter.write(str);
    }

    public void write(byte[] bArr) throws IOException {
        checkWritable();
        this.outputStream.write(bArr);
    }

    public boolean overwriteFile(String str) {
        return writeToFile(str, WriteMethod.OVERWRITE);
    }

    public boolean appendToFile(String str) {
        return writeToFile(str, WriteMethod.APPEND);
    }

    private boolean writeToFile(String str, WriteMethod writeMethod2) {
        if (isOpen()) {
            if (!writeMethod2.equals(this.writeMethod)) {
                close();
                if (!open(writeMethod2)) {
                    this.logger.mo11020e("Could not reopen the file for %s.", writeMethod2.toString());
                    return false;
                }
            }
        } else if (!open(writeMethod2)) {
            this.logger.mo10939e("Could not open the file for writing.");
            return false;
        }
        try {
            write(str);
            close();
            return true;
        } catch (IOException unused) {
            this.logger.mo10939e("Failed to write data to the file.");
            return false;
        }
    }
}
