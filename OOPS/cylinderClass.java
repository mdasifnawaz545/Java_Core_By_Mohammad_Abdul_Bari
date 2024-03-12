class cylinder {
    double radius;
    double height;

    double lidArea(double radius) {
        return Math.PI * radius * radius;
    }

    double sufaceArea(double radius, double height) {
        return ((2 * Math.PI * radius * (height + radius)));
    }

    double volume(double radius, double height) {
        return (2 * Math.PI * radius * radius * height);
    }
}

public class cylinderClass {
    public static void main(String args[]) {
        cylinder cy = new cylinder();
        cy.radius = 5.5;
        cy.height = 5.1;
        System.out.println("Surface Area of the Cylinder = " + cy.sufaceArea(cy.radius, cy.height));
        System.out.println("Lid Area of the Cylinder = " + cy.lidArea(cy.radius));
        System.out.println("Surface Area of the Cylinder = " + cy.volume(cy.radius, cy.height));

    }

}
