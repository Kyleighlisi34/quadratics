package org.LickingHeights;

public class Main {

    public static void main(String[] args) {

        //todo declare variables a,b,c,discriminant,axisOfSymmetry,parabolaFacing,x,y
        double a,b,c,discriminant,axisOfSysmmetry,x,y;
        String parabolaFacing;
        //todo initialize manually
        a=5;
        b=3;
        c=1;
        // todo calculations
        axisOfSysmmetry = -b/(2*a);
        discriminant = (b*b)-4*(a*c);
        if (discriminant >0){
            System.out.println("There are two real solutions");
        }
        else if(discriminant == 0){
            System.out.println("There are one real solutions");
        }
        else {
            System.out.println("There are NO real solutions");
        }
            // todo print results
        System.out.println("Axis of Symmetry: "+axisOfSysmmetry);
        System.out.println("Discriminant: "+discriminant);
        // todo not in code check results
        
        //todo initialize scanner and redo the initialize area

        //todo double check results

























































    }
}
