package taller3.televisores;

public class Control {
    private TV tv = null;

    public void enlazar(TV newTv) {
        this.tv = newTv;
        newTv.setControl(this);
    }

    public void turnOn() {
        this.tv.turnOn();
    }

    public void turnOff() {
        this.tv.turnOff();
    }

    public void canalUp() {
        this.tv.canalUp();
    }

    public void canalDown() {
        this.tv.canalDown();
    }

    public void volumenUp() {
        this.tv.volumenUp();
    }

    public void volumenDown() {
        this.tv.volumenDown();
    }

    public void setCanal(int value) {
        this.tv.setCanal(value);
    }

    public void setVolumen() {
        this.tv.setVolumen(0);
    }

    public void setTv(TV newObjectTV) {
        this.tv = newObjectTV;
    }

    public TV getTv() {
        return this.tv;
    }
}