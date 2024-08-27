package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class ShapeFactory{
    public static Shape create(RegularShapeType tipo){
        Triangle myClass = new Triangle();
        Quadrilateral myClass1 = new Quadrilateral();
        Pentagon myClass2 = new Pentagon();
        Hexagon myClass3 = new Hexagon();
    switch (tipo){
        case Triangle:
            myClass.getNumberOfEdges();
            break;
        case Quadrilateral:
            myClass1.getNumberOfEdges();
            break;
        case Pentagon:
            myClass2.getNumberOfEdges();
            break;
        case Hexagon:
            myClass3.getNumberOfEdges();
        }
        return null;
    }
}