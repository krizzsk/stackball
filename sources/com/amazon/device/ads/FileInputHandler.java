package com.amazon.device.ads;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class FileInputHandler extends FileHandler {
    private static final String LOGTAG = FileInputHandler.class.getSimpleName();
    private BufferedReader bufferedReader;
    private InputStream inputStream;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    FileInputHandler() {
    }

    public boolean isOpen() {
        return this.inputStream != null;
    }

    public boolean open() {
        if (this.file == null) {
            this.logger.mo10939e("A file must be set before it can be opened.");
            return false;
        } else if (this.inputStream != null) {
            this.logger.mo10939e("The file is already open.");
            return false;
        } else {
            try {
                this.inputStream = new BufferedInputStream(new FileInputStream(this.file));
                this.bufferedReader = new BufferedReader(new InputStreamReader(this.inputStream));
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public void close() {
        closeCloseables();
        this.bufferedReader = null;
        this.inputStream = null;
    }

    /* access modifiers changed from: protected */
    public Closeable getCloseableStream() {
        return this.inputStream;
    }

    /* access modifiers changed from: protected */
    public Closeable getCloseableReaderWriter() {
        return this.bufferedReader;
    }

    private void checkReadable() {
        if (this.bufferedReader == null) {
            throw new IllegalStateException("Could not read from the file because no file has been opened yet. Please set the file, then call open() before attempting to read.");
        }
    }

    public byte[] readBytes() {
        checkReadable();
        try {
            int length = (int) this.file.length();
            byte[] bArr = new byte[length];
            int i = 0;
            while (i < length) {
                int read = this.inputStream.read(bArr, i, length - i);
                if (read > 0) {
                    i += read;
                }
            }
            return bArr;
        } catch (IOException e) {
            this.logger.mo11020e("Error reading bytes from input file: %s", e.getMessage());
            return null;
        }
    }

    public byte[] readAllBytesFromFileAndClose() {
        if (isOpen() || open()) {
            byte[] readBytes = readBytes();
            close();
            return readBytes;
        }
        this.logger.mo10939e("Could not open the file for reading");
        return null;
    }

    public String readLine() {
        checkReadable();
        try {
            return this.bufferedReader.readLine();
        } catch (IOException unused) {
            this.logger.mo10939e("Error reading line from file.");
            return null;
        }
    }
}
