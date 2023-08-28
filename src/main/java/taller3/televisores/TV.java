package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca mark, boolean status) {
        this.marca = mark;
        this.estado = status;
        numTV++;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca newMark) {
        this.marca = newMark;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int newChanel) {
        if (this.estado == true & 1 <= newChanel & newChanel <= 120) {
            this.canal = newChanel;
        }
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int newValue) {
        this.precio = newValue;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int newVol) {
        if (estado == true & 0 <= newVol & newVol <= 7) {
            this.volumen = newVol;
        }
    }

    public Control getControl() {
        return this.control;
    }

    public void setControl(Control other) {
        this.control = other;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int value) {
        numTV = value;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void canalUp() {
        if (this.estado == true & canal < 120) {
            this.canal++;
        }
    }

    public void canalDown() {
        if (this.estado == true & this.canal > 1) {
            this.canal--;
        }
    }

    public void volumenUp() {
        if (this.estado == true & volumen < 7) {
            this.volumen++;
        }
    }

    public void volumenDown() {
        if (estado == true & this.volumen > 0) {
            this.volumen--;
        }
    }
}