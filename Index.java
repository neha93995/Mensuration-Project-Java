import java.util.Scanner;
abstract class Shape2D{
    public double area;
    public double perimeter;

    abstract public void input();
    abstract public void computeArea();
    abstract public void computePerimeter();


    public void show(){
        System.out.println("Area is      :    "+area);
        System.out.println("Perimeter is :    "+perimeter);
    }
}


// --------------------------2D Figures--------------


// ----------------Circle class--------------

class Circle extends Shape2D{
    double radius;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        radius = sc.nextDouble();
    }
    public void computeArea(){
        area = (double)3.14*radius*radius;
    }
    public void computePerimeter(){
        perimeter = (double) 3.14*2*radius;
    }

}

// ------------------Square class -----------------

class Square extends Shape2D{
    double side;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of the Square : ");
        side = sc.nextDouble();
    }
    public void computeArea(){
        area = side*side;
    }
    public void computePerimeter(){
        perimeter = 4*side;
    }
}

// --------------------Rectangle class ------------------


class Rectangle extends Shape2D{
    double length;
    double breadth;
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter length and breadth for reactangle : ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }

    public void computeArea(){
        area = length*breadth;
    }
    public void computePerimeter(){
        perimeter = 2*(length+breadth);
    }
}

// ----------------------Trinagle Class-----------

class Triangle extends Shape2D{
    double side1;
    double side2;
    double side3;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter all three side of Triangle");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();

    }
    
    public void computeArea(){
        double s= (side1+side2+side3)/2.0;
        System.out.println(s);
        double a = s*(s-side1)*(s-side2)*(s-side3);
        System.out.println(a);
        area = Math.sqrt(a);       
    }

    public void computePerimeter(){
        perimeter = side1+side2+side3;
    }
}


// ------------------------3D Figures------------------

abstract class Shape3D{
    public double surfaceArea;
    public double totalArea;
    public double volume;

    abstract public void input();
    abstract public void computeSurfaceArea();
    abstract public void computeTotalArea();
    abstract public void computeVolume();
    public void show(){
        System.out.println("Surface Area  :  "+surfaceArea);
        System.out.println("Total Area    :  "+totalArea);
        System.out.println("Volume        :  "+volume);
    }
}


// -------------Cylinder class-------------
class Cylinder extends Shape3D{
    double radius;
    double height;
     
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height and radius for cylinder : ");
        height = sc.nextDouble();
        radius = sc.nextDouble();
    }

    public void computeTotalArea(){
        totalArea = (2*3.14*height*radius)+(2*3.14*radius*radius);
    }
    public void computeSurfaceArea(){
        surfaceArea = 2*3.14*radius*height;
    }
    public void computeVolume(){
        volume = 3.14*radius*radius*height;
    }
}


// ----------------Cone class-----------------


class Cone extends Shape3D{
    double slantheight;
    double radius;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter slant height and radius for cone ");
        slantheight = sc.nextDouble();
        radius = sc.nextDouble();
    }

    public void computeTotalArea(){
        totalArea = 3.14*radius*slantheight;
    }

    public void computeSurfaceArea(){      
        surfaceArea = 3.14*radius*(radius + slantheight);
    }
    public void computeVolume(){
        
        double a = Math.sqrt(((slantheight*slantheight)-(radius*radius)));
        System.out.println(a);
        volume = (1/3)*3.14*radius*radius*a;
    }
}

// -----------------Cube class-----------------

class Cube extends Shape3D{
    double side;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side for cube ");
        side = sc.nextDouble();
    }

    public void computeTotalArea(){ 
        totalArea = 6*side*side;
    }
    public void computeSurfaceArea(){ 
        surfaceArea = 4*side*side;
    }
    public void computeVolume(){
        volume = side*side*side;
    }
}


// --------------------Cuboid class-----------------

class Cuboid extends Shape3D{
    double length;
    double breadth;
    double height;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side for cuboid ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        height = sc.nextDouble();
    }

    public void computeTotalArea(){ 
        totalArea = 2*((length*breadth)+(breadth*height)+(height*length));
    }
    public void computeSurfaceArea(){ 
        surfaceArea = 2*((length*height)+(breadth*height));
    }
    public void computeVolume(){
        volume = length*breadth*height;
    }
}

// ---------------Sphere class-------------


class Sphere extends Shape3D{
    double radius;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius for sphere ");
        radius = sc.nextDouble();
    }

    public void computeTotalArea(){
        totalArea = 4*3.14*radius*radius;
    }

    public void computeSurfaceArea(){
        surfaceArea = 4*3.14*radius*radius;
    }

    public void computeVolume(){
        volume = (4/3)*3.14*radius*radius*radius;
    }
}


// ---------------Geomatric class for 2D shape----------

class Geometry2D{

    void compute(Shape2D ref){
        ref.input();
        ref.computeArea();
        ref.computePerimeter();
        ref.show();
    }

}

// -----------------Geomatric class for 3D shape--------------


class Geometry3D{

    void compute(Shape3D ref){
        ref.input();
        ref.computeSurfaceArea();
        ref.computeTotalArea();
        ref.computeVolume();
        ref.show();
    }

}

// -----------------Main class-------------------

public class Index{

// ----------function for 2D shape selection and execution------

public static void selectionFor2dShape(String shapeName){
    
    Geometry2D g1 = new Geometry2D();
    Circle circle =new Circle();
    Square square = new Square();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();
    
    switch (shapeName){
        case "circle":{
            g1.compute(circle);
                break;
            }
            case "rectangle":{
                g1.compute(rectangle);
                break;
            }
            case "square":{
                g1.compute(square);
                break;
            }
            case "triangle":{
                g1.compute(triangle);
                break;
            }
            default:{
                System.out.println("please select among circle, rectangle, triangle, square");
                // selectionFor2dShape(s);
            }
        }
        
    }

// ----------function for 3D shape selection and execution------
    
    public static void selectionFor3dShape(String shapeName){
        
        Geometry3D g2= new Geometry3D();
        Cylinder cylinder = new Cylinder();
        Cone cone = new Cone();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        Cuboid cuboid = new Cuboid();


        switch (shapeName){
            case "cylinder":{
                g2.compute(cylinder);
                break;
            }
            case "cone":{
                g2.compute(cone);
                break;
            }
            case "sphere":{
                g2.compute(sphere);
                break;
            }
            case "cube":{
                g2.compute(cube);
                break;
            }
            case "cuboid":{
                g2.compute(cuboid);
                break;
            }
            default:{
                System.out.println("please select among cylinder, cube, cuboid, cone, sphere");
            }
        }

    }


// --------------Main Function-----------

    public static void main(String[] args) {
        System.out.println("An application for solve Geomatric Problem");


        Scanner sc = new Scanner(System.in); 

        while(true){

            
            System.out.println("which type of shape do you want to solve ! ");
            System.out.println("2D or 3D");
            String shape = sc.next();
            
            shape = shape.toLowerCase();
            System.out.println(shape);
            
            if(shape.equals("2d")){
                System.out.println("In 2D shape which type of shape do you want to solve ");
                System.out.println("Circle, Rectangle, Square, Triangle");
                String shapeName = sc.next();
                shapeName = shapeName.toLowerCase();
                selectionFor2dShape(shapeName);
        }
        else if(shape.equals("3d")){
            System.out.println("In 3D shape which type of shape do you want to solve");
            System.out.println("Cylinder, Cube, cuboid, cone, sphere");
            String shapeName = sc.next();
            shapeName = shapeName.toLowerCase();
            selectionFor3dShape(shapeName);
        }
        else{
            System.out.println("select one between 2D or 3D");
        }
        
        System.out.println("Do you want to continue! ");
        System.out.println("Yes or No");
        String isContinue = sc.next();
        isContinue = isContinue.toLowerCase();

        if(isContinue.equals("yes")){
            System.out.println("Thank You for using!");
            break;
        }

    }
    }
}