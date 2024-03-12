class Cylinder {
    private float radius;
    private float height;

    float getRadius() {
        return radius;
    }

    float getHeight() {
        return height;
    }

    void setRadius(float r) {
        radius = r;

    }

    void setHeight(float h) {
        height = h;
    }

    public Cylinder() {
        setRadius(5f);
        setHeight(5f);
    }

    public Cylinder(float r, float h) {
        setRadius(r);
        setHeight(h);
    }

    double volume(float r, float h) {
        return Math.PI * r * r * h;
    }

    double surfaceArea(float r, float h) {
        return 2f * Math.PI * r * (h + r);
    }

    double lidArea(float r) {
        return Math.PI * r * r;
    }
}

public class cylinderCons {
    public static void main(String args[]) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10f, 5f);
        System.out.println("Radius 1 = " + c1.getRadius());
        System.out.println("Radius 2 = " + c2.getRadius());
        System.out.println("Height 1 = " + c1.getHeight());
        System.out.println("Height 2 = " + c2.getHeight());
        System.out.println("Lid Area 1 = " + c1.lidArea(c1.getRadius()));
        System.out.println("Lid Area 2 = " + c2.lidArea(c2.getRadius()));
        System.out.println("Surface Area 1 = " + c1.surfaceArea(c1.getRadius(), c1.getHeight()));
        System.out.println("Surface Area 2 = " + c2.surfaceArea(c2.getRadius(), c2.getHeight()));
        System.out.println("Volume 1 = " + c1.volume(c1.getRadius(), c1.getHeight()));
        System.out.println("Volume 2 = " + c2.volume(c2.getRadius(), c2.getHeight()));
    }
}
