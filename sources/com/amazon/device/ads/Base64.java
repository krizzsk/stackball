package com.amazon.device.ads;

class Base64 {
    private static final String ENCODE_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    Base64() {
    }

    public static byte[] decode(String str) {
        int i;
        int indexOf;
        int i2;
        if (!StringUtils.isNullOrWhiteSpace(str)) {
            int decodedLength = getDecodedLength(str);
            if (decodedLength > 0) {
                byte[] bArr = new byte[decodedLength];
                int i3 = 0;
                int i4 = 0;
                while (i3 < str.length() && i4 < decodedLength && (((i = i3 % 4) != 0 || str.length() >= i3 + 4) && (indexOf = ENCODE_CHARSET.indexOf(str.charAt(i3))) != -1)) {
                    if (i != 0) {
                        if (i == 1) {
                            i2 = i4 + 1;
                            bArr[i4] = (byte) (((byte) (3 & (indexOf >> 4))) | bArr[i4]);
                            if (i2 < decodedLength) {
                                bArr[i2] = (byte) (indexOf << 4);
                            }
                        } else if (i == 2) {
                            i2 = i4 + 1;
                            bArr[i4] = (byte) (bArr[i4] | ((byte) ((indexOf >> 2) & 15)));
                            if (i2 < decodedLength) {
                                bArr[i2] = (byte) (indexOf << 6);
                            }
                        } else if (i == 3) {
                            i2 = i4 + 1;
                            bArr[i4] = (byte) (((byte) (indexOf & 63)) | bArr[i4]);
                        }
                        i4 = i2;
                    } else {
                        bArr[i4] = (byte) (indexOf << 2);
                    }
                    i3++;
                }
                return bArr;
            }
            throw new IllegalArgumentException("Encoded String decodes to zero bytes");
        }
        throw new IllegalArgumentException("Encoded String must not be null or white space");
    }

    private static int getDecodedLength(String str) {
        int indexOf = str.indexOf("=");
        return (((str.length() + 3) / 4) * 3) - (indexOf > -1 ? str.length() - indexOf : 0);
    }
}
