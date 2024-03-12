package OOPS.Inheritance;
class Circle {
    float radius;

    float area() {
        return 3.14f * radius * radius;
    }

    float cirumference() {
        return 2 * 3.14f * radius;
    }
}

class Cylin extends Circle {
    float height;

    float CylArea() {
        return area() * height;
    }
}

public class cylinder {


    public static void main(String args[]) {
        Cylin cy = new Cylin();
        cy.radius = 10;
        cy.height = 10;
        System.out.println(cy.CylArea());
    }
}
