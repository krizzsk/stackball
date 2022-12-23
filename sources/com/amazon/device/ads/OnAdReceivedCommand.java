package com.amazon.device.ads;

interface OnAdReceivedCommand {
    ActionCode onAdReceived(C0898Ad ad, AdData adData);
}
