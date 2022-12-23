package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class EventMessageEncoder {
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
    private final DataOutputStream dataOutputStream = new DataOutputStream(this.byteArrayOutputStream);

    public final byte[] encode(EventMessage eventMessage, long j) {
        Assertions.checkArgument(j >= 0);
        this.byteArrayOutputStream.reset();
        try {
            writeNullTerminatedString(this.dataOutputStream, eventMessage.schemeIdUri);
            writeNullTerminatedString(this.dataOutputStream, eventMessage.value != null ? eventMessage.value : "");
            writeUnsignedInt(this.dataOutputStream, j);
            writeUnsignedInt(this.dataOutputStream, Util.scaleLargeTimestamp(eventMessage.presentationTimeUs, j, 1000000));
            writeUnsignedInt(this.dataOutputStream, Util.scaleLargeTimestamp(eventMessage.durationMs, j, 1000));
            writeUnsignedInt(this.dataOutputStream, eventMessage.f16399id);
            this.dataOutputStream.write(eventMessage.messageData);
            this.dataOutputStream.flush();
            return this.byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeNullTerminatedString(DataOutputStream dataOutputStream2, String str) throws IOException {
        dataOutputStream2.writeBytes(str);
        dataOutputStream2.writeByte(0);
    }

    private static void writeUnsignedInt(DataOutputStream dataOutputStream2, long j) throws IOException {
        dataOutputStream2.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream2.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream2.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream2.writeByte(((int) j) & 255);
    }
}
