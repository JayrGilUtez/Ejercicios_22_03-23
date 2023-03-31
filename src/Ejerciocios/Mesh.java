package Ejerciocios;

public class Mesh {
    public Object[][] mesh = new Object[3][3];

    public Mesh(Object[][] mesh) {
        this.mesh = mesh;
    }
    public Mesh(){

    }

    public Object[][] getMesh() {
        return mesh;
    }

    public void setMesh(Object[][] mesh) {
        this.mesh = mesh;
    }
}


