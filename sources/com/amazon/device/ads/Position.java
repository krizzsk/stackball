package com.amazon.device.ads;

import org.json.JSONObject;

class Position {
    private Size size;

    /* renamed from: x */
    private int f1615x;

    /* renamed from: y */
    private int f1616y;

    public Position() {
        this.size = new Size(0, 0);
        this.f1615x = 0;
        this.f1616y = 0;
    }

    public Position(Size size2, int i, int i2) {
        this.size = size2;
        this.f1615x = i;
        this.f1616y = i2;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size2) {
        this.size = size2;
    }

    public int getX() {
        return this.f1615x;
    }

    public void setX(int i) {
        this.f1615x = i;
    }

    public int getY() {
        return this.f1616y;
    }

    public void setY(int i) {
        this.f1616y = i;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = this.size.toJSONObject();
        JSONUtils.put(jSONObject, "x", this.f1615x);
        JSONUtils.put(jSONObject, "y", this.f1616y);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        if (this.size.equals(position.size) && this.f1615x == position.f1615x && this.f1616y == position.f1616y) {
            return true;
        }
        return false;
    }
}
