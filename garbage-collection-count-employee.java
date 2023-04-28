
// Java Program to count number of employees working in a company (Completed With Garbage Collection)

class Employee {
    private String name;
    private int age;
    private int ID;
    private static int nextId = 1;
    
    
    public Employee (String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    
    public void show()
    {
        System.out.println( "\nID=" + ID +  "\nName=" + name + "\nAge=" + age);
    }
    
    public void showNextId()
    {
        System.out.println("Next employee id will be=" + nextId);
    }
    
     protected void finalize()
    {
        --nextId;
        // In this case,
        // gc will call finalize()
        // for 2 times for 2 objects.
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Employee E = new Employee("Ayush", 28);
        Employee F = new Employee("Abhinav", 24);
        E.show();
        F.show();
        
        //Sub block
        {
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            
            X = Y = null;
            
            // For garbage collection
            System.gc();
            System.runFinalization();
        }
        
        E.showNextId();
    }
    
    
}
