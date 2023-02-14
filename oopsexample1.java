// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Studio st = new Studio();
        st.calculatepercentage(22,22);
        
        Pen reynolds = new Pen();
        reynolds.settip(23);
        System.out.println(reynolds.tip);
        reynolds.setcolor("Yellow");
        System.out.println(reynolds.color);
    }
}
class Pen{
    String color;
    int tip;
     void setcolor(String newcolor){
         color  = newcolor;
     }
     void settip(int newtip){
         tip = newtip;
     }
}
class Studio{
    String name;
    int age;
    double percentage;
    void calculatepercentage(double physics , double maths){
        double perc;
        perc  = (physics+maths)/2;
        System.out.println(perc);
    }
}
